package com.soffid.bpm.authoritativechange.handler;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jbpm.JbpmContext;
import org.jbpm.context.exe.ContextInstance;
import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ExecutionContext;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.graph.exe.Token;
import org.zkoss.zul.Label;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Row;

import com.soffid.bpm.consum.data.RequestInfo;
import com.soffid.iam.addons.lopd.common.Fitxer;
import com.soffid.iam.addons.lopd.service.LopdService;

import es.caib.bpm.toolkit.exception.UserWorkflowException;
import es.caib.seycon.ng.ServiceLocator;
import es.caib.seycon.ng.comu.Aplicacio;
import es.caib.seycon.ng.comu.Rol;
import es.caib.seycon.ng.comu.RolAccount;
import es.caib.seycon.ng.comu.UsuariWFProcess;
import es.caib.seycon.ng.exception.InternalErrorException;
import es.caib.seycon.ng.servei.AplicacioService;
import es.caib.seycon.ng.servei.UsuariService;
import es.caib.seycon.ng.utils.Security;
import es.caib.zkib.component.DataCheckbox;
import es.caib.zkib.component.DataListbox;

public class ManagerHandler implements ActionHandler {
	Log log = LogFactory.getLog(getClass());
	
	public void execute(ExecutionContext executionContext) throws Exception {
		if (executionContext.getToken().isRoot())
		{
			executeRootToken(executionContext);
		} else {
			executeChildToken (executionContext);
		}
	}

	/**
	 * Executes when child token has finished
	 * 
	 * @param ctx
	 * @throws Exception
	 */
	public void executeChildToken(ExecutionContext ctx) throws Exception {
		List<RequestInfo> roles = (List<RequestInfo>) ctx.getVariable("roles");
		Token childToken = ctx.getToken();
		Token parent = childToken.getParent();
		childToken.end(false);

		String report = (String) ctx.getVariable("report");
		
		// Update parent process status
		ExecutionContext ctx2 = new ExecutionContext ( parent );
		String fullReport = (String) ctx2.getVariable("fullReport");
		if (fullReport == null)
			fullReport = "";
		
		fullReport = fullReport + 
				"FILE: " +
				ctx.getVariable("file")+"\n---------------------------------------------------------------------------------\n"+
				report+
				"\n\n";
		
		ctx2.setVariable("fullReport", fullReport);
		
		boolean lastToken = true;
		for (Token sibbling: ((Map<String,Token>)parent.getActiveChildren()).values())
		{
			if (! sibbling.hasEnded())
			{
				lastToken = false;
			}
		}
		
		if (lastToken)
		{
			ctx2.leaveNode("Continue");
		}
		
	}


	private void executeRootToken(ExecutionContext executionContext)
			throws InternalErrorException {
		int approvals = 0;
		
		LopdService svc = (LopdService) ServiceLocator.instance().getService(LopdService.SERVICE_NAME);
		for (Fitxer app: svc.findFitxersByFiltre(null, null, null, null, null, null, null))
		{
			String tag = "file"+app.getId().toString();
			Boolean v = (Boolean) executionContext.getVariable(tag);
			if (v != null && v.booleanValue())
			{
				Token t = new Token (executionContext.getToken(), app.getNom());
				ExecutionContext ctx2 = new ExecutionContext(t);
				ContextInstance instance = ctx2.getContextInstance();
				instance.createVariable("file", app.getNom(), t);
				instance.createVariable("owner", app.getResponsable(), t);
				ctx2.leaveNode("Dispatch");
				approvals ++;
			}
		}
		if (approvals == 0)
			executionContext.leaveNode("Continue");
	}


}
