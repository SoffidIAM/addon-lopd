package com.soffid.bpm.authoritativechange.handler;

import org.jbpm.graph.exe.ExecutionContext;
import org.jbpm.taskmgmt.exe.Assignable;

import es.caib.seycon.ng.comu.Rol;
import es.caib.seycon.ng.comu.RolAccount;
import es.caib.seycon.ng.comu.Usuari;
import es.caib.seycon.ng.sync.intf.AuthoritativeChange;
import es.caib.seycon.ng.utils.Security;

public class AppOwnerAssignmentHandler implements org.jbpm.taskmgmt.def.AssignmentHandler {

	public void assign(Assignable task, ExecutionContext ctx) throws Exception {
		String owner = (String) ctx.getVariable("owner"); 
		
		task.setPooledActors(new String [] { owner });
	}

}
