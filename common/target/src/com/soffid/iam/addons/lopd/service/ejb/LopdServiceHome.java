//
// (C) 2013 Soffid
//
//

package com.soffid.iam.addons.lopd.service.ejb;
/**
 * EJB Home LopdService
 */
public interface LopdServiceHome
	extends javax.ejb.EJBLocalHome
 {
	/**
	 * The logical JDNI name
	 */
	public static final String COMP_NAME="java:comp/ejb/LopdService";

	/**
	 * The physical JDNI name
	 */
	public static final String JNDI_NAME="soffid/ejb/com.soffid.iam.addons.lopd.service.LopdService";

	public com.soffid.iam.addons.lopd.service.ejb.LopdService create()
		throws javax.ejb.CreateException;

}
