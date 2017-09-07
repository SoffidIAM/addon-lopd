package com.soffid.bpm.authoritativechange.ui;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Label;
import org.zkoss.zul.Row;

import com.soffid.iam.addons.lopd.common.Fitxer;
import com.soffid.iam.addons.lopd.service.LopdService;

import es.caib.bpm.toolkit.WorkflowWindow;
import es.caib.seycon.ng.ServiceLocator;
import es.caib.seycon.ng.exception.InternalErrorException;
import es.caib.seycon.ng.utils.Security;
import es.caib.zkib.component.DataCheckbox;

public class RequestWindow extends WorkflowWindow
{
		
	Log log = LogFactory.getLog(getClass());
	public RequestWindow() 
	{
	}

	public void onCreate() throws InternalErrorException
	{
	}
	
	
	public void onLoad () throws InternalErrorException
	{
		Grid g = (Grid) getFellow("grid");
		String user = Security.getCurrentUser();
		getTask().getVariables().put("solicitante", user);
		((Label)getFellow("requester")).setValue(user);
		LopdService svc = (LopdService) ServiceLocator.instance().getService(LopdService.SERVICE_NAME);
		for (Fitxer app: svc.findFitxersByFiltre(null, null, null, null, null, null, null))
		{
			Row row = new Row();
			row.setParent(g.getRows());
			Label b = new Label (app.getNom());
			b.setParent(row);
			DataCheckbox c = new DataCheckbox();
			c.setBind("@file"+app.getId().toString());
			c.setParent(row);
		}
	}

}
