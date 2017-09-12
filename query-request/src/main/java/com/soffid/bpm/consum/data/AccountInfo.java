package com.soffid.bpm.consum.data;

import java.io.Serializable;

public class AccountInfo implements Serializable {
	public String dispatcher;
	public String dispatcherDescription;
	public String plexApp;
	public String plexAccount;
	public String accountName;
	public boolean exists;
	
	
	public String getPlexApp() {
		return plexApp;
	}
	public void setPlexApp(String plexApp) {
		this.plexApp = plexApp;
	}
	public String getPlexAccount() {
		return plexAccount;
	}
	public void setPlexAccount(String plexAccount) {
		this.plexAccount = plexAccount;
	}
	public String getDispatcher() {
		return dispatcher;
	}
	public void setDispatcher(String dispatcher) {
		this.dispatcher = dispatcher;
	}
	public String getDispatcherDescription() {
		return dispatcherDescription;
	}
	public void setDispatcherDescription(String dispatcherDescription) {
		this.dispatcherDescription = dispatcherDescription;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public boolean isExists() {
		return exists;
	}
	public void setExists(boolean exists) {
		this.exists = exists;
	}


}
