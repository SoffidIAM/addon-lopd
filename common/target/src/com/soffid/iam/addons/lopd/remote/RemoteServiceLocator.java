//
// (C) 2013 Soffid
//
//

package com.soffid.iam.addons.lopd.remote;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;


import es.caib.seycon.ng.config.Config;
import es.caib.seycon.ng.exception.InternalErrorException;
import es.caib.seycon.ng.remote.RemoteInvokerFactory;
import es.caib.seycon.ng.remote.URLManager;

/**
 * Locates and provides all available application services.
 */
public class RemoteServiceLocator
{

	String server = null;
	String authToken = null;
	
	public RemoteServiceLocator()
	{
	}

	public RemoteServiceLocator(String server)
	{
		setServer (server);
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	
	private static int roundRobin = 0;
	
	public Object getRemoteService (String serviceName) throws IOException, InternalErrorException {
		Object robj;
		RemoteInvokerFactory factory = new RemoteInvokerFactory();
		
		Config config = Config.getConfig();

		String list[];
		if (server == null) {
			list = config.getServerList().split("[, ]+");
		} else {
			list = new String[] {server} ;
		}
			
		roundRobin ++;
		Exception lastException  = null;
		for (int i = 0; i < list.length; i++) {
			URLManager m = null;
			try {
				m = new URLManager(list[ (i+roundRobin) % list.length ]);
				if (authToken == null)
	                return factory.getInvoker(m.getHttpURL(serviceName));
	            else
	                return factory.getInvoker(m.getHttpURL(serviceName), authToken);
			} catch (Exception e) {
				lastException = e;
			}
		}
		throw new IOException ("Unable to locate remote service "+serviceName, lastException);
	}
 
 

}
