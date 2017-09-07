//
// (C) 2013 Soffid
//
//

package com.soffid.iam.addons.lopd.service.ejb;
/**
 * EJB LopdService
 */
public interface LopdService
	extends javax.ejb.EJBLocalObject
 {

	java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> getFitxers()
	throws es.caib.seycon.ng.exception.InternalErrorException;

	com.soffid.iam.addons.lopd.common.Fitxer create(
		com.soffid.iam.addons.lopd.common.Fitxer fitxer)
	throws es.caib.seycon.ng.exception.InternalErrorException;

	com.soffid.iam.addons.lopd.common.Fitxer update(
		com.soffid.iam.addons.lopd.common.Fitxer fitxer)
	throws es.caib.seycon.ng.exception.InternalErrorException;

	void delete(
		com.soffid.iam.addons.lopd.common.Fitxer fitxer)
	throws es.caib.seycon.ng.exception.InternalErrorException;

	java.util.Collection<es.caib.seycon.ng.comu.Rol> findRolesByIdFitxer(
		java.lang.Long idFitxer)
	throws es.caib.seycon.ng.exception.InternalErrorException;

	java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> findFitxersByFiltre(
		java.lang.String id, 
		java.lang.String nom, 
		java.lang.String responsable, 
		java.lang.String conselleria, 
		java.lang.String dg, 
		java.lang.String nivell, 
		java.lang.String registrat)
	throws es.caib.seycon.ng.exception.InternalErrorException;

	java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> findFitxersByNomFitxer(
		java.lang.String nomFitxer)
	throws es.caib.seycon.ng.exception.InternalErrorException;

	com.soffid.iam.addons.lopd.common.Fitxer findFitxerById(
		java.lang.Long idFitxer)
	throws es.caib.seycon.ng.exception.InternalErrorException;

	com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer create(
		com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer)
	throws es.caib.seycon.ng.exception.InternalErrorException;

	void delete(
		com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer)
	throws es.caib.seycon.ng.exception.InternalErrorException;

	com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer create(
		com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer)
	throws es.caib.seycon.ng.exception.InternalErrorException;

	void delete(
		com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer)
	throws es.caib.seycon.ng.exception.InternalErrorException;

	com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer findAdministradorSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(
		java.lang.String codiUsuari, 
		java.lang.Long idFitxer)
	throws es.caib.seycon.ng.exception.InternalErrorException;

	com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer findResponsableSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(
		java.lang.String codiUsuari, 
		java.lang.Long idFitxer)
	throws es.caib.seycon.ng.exception.InternalErrorException;

	java.util.Collection<com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer> findAdministradorsSeguretatOrganitzatiusFitxerByIdFitxer(
		java.lang.Long idFitxer)
	throws es.caib.seycon.ng.exception.InternalErrorException;

	java.util.Collection<com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer> findResponsablesSeguretatOrganitzatiusFitxerByIdFitxer(
		java.lang.Long idFitxer)
	throws es.caib.seycon.ng.exception.InternalErrorException;

	com.soffid.iam.addons.lopd.common.RolFitxer create(
		com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer)
	throws es.caib.seycon.ng.exception.InternalErrorException;

	void delete(
		com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer)
	throws es.caib.seycon.ng.exception.InternalErrorException;

	java.util.Collection<com.soffid.iam.addons.lopd.common.RolFitxer> findRolsFitxersByIdFitxer(
		java.lang.Long idFitxer)
	throws es.caib.seycon.ng.exception.InternalErrorException;

	com.soffid.iam.addons.lopd.common.RolFitxer findRolFitxerByNomRolAndIdFitxer(
		java.lang.String nomRol, 
		java.lang.Long idFitxer)
	throws es.caib.seycon.ng.exception.InternalErrorException;

}
