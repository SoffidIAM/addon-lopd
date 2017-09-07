//
// (C) 2013 Soffid
//
//

package com.soffid.iam.addons.lopd.service;
/**
 * Service LopdService
 */
public interface LopdService {

	public final static String SERVICE_NAME = "lopd-lopdService";

	/**
	 * Operation getFitxers

	 * @return 
	 */
	java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> getFitxers()
			throws es.caib.seycon.ng.exception.InternalErrorException;

	/**
	 * Operation create

	 * @param fitxer 
	 * @return 
	 */
	com.soffid.iam.addons.lopd.common.Fitxer create(
		com.soffid.iam.addons.lopd.common.Fitxer fitxer)
			throws es.caib.seycon.ng.exception.InternalErrorException;

	/**
	 * Operation update

	 * @param fitxer 
	 * @return 
	 */
	com.soffid.iam.addons.lopd.common.Fitxer update(
		com.soffid.iam.addons.lopd.common.Fitxer fitxer)
			throws es.caib.seycon.ng.exception.InternalErrorException;

	/**
	 * Operation delete

	 * @param fitxer 
	 */
	void delete(
		com.soffid.iam.addons.lopd.common.Fitxer fitxer)
			throws es.caib.seycon.ng.exception.InternalErrorException;

	/**
	 * Operation findRolesByIdFitxer

	 * @param idFitxer 
	 * @return 
	 */
	java.util.Collection<es.caib.seycon.ng.comu.Rol> findRolesByIdFitxer(
		java.lang.Long idFitxer)
			throws es.caib.seycon.ng.exception.InternalErrorException;

	/**
	 * Operation findFitxersByFiltre

	 * @param id 
	 * @param nom 
	 * @param responsable 
	 * @param conselleria 
	 * @param dg 
	 * @param nivell 
	 * @param registrat 
	 * @return 
	 */
	java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> findFitxersByFiltre(
		java.lang.String id, 
		java.lang.String nom, 
		java.lang.String responsable, 
		java.lang.String conselleria, 
		java.lang.String dg, 
		java.lang.String nivell, 
		java.lang.String registrat)
			throws es.caib.seycon.ng.exception.InternalErrorException;

	/**
	 * Operation findFitxersByNomFitxer

	 * @param nomFitxer 
	 * @return 
	 */
	java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> findFitxersByNomFitxer(
		java.lang.String nomFitxer)
			throws es.caib.seycon.ng.exception.InternalErrorException;

	/**
	 * Operation findFitxerById

	 * @param idFitxer 
	 * @return 
	 */
	com.soffid.iam.addons.lopd.common.Fitxer findFitxerById(
		java.lang.Long idFitxer)
			throws es.caib.seycon.ng.exception.InternalErrorException;

	/**
	 * Operation create

	 * @param responsableSeguretatOrganitzatiuFitxer 
	 * @return 
	 */
	com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer create(
		com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer)
			throws es.caib.seycon.ng.exception.InternalErrorException;

	/**
	 * Operation delete

	 * @param responsableSeguretatOrganitzatiuFitxer 
	 */
	void delete(
		com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer)
			throws es.caib.seycon.ng.exception.InternalErrorException;

	/**
	 * Operation create

	 * @param administradorSeguretatOrganitzatiuFitxer 
	 * @return 
	 */
	com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer create(
		com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer)
			throws es.caib.seycon.ng.exception.InternalErrorException;

	/**
	 * Operation delete

	 * @param administradorSeguretatOrganitzatiuFitxer 
	 */
	void delete(
		com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer)
			throws es.caib.seycon.ng.exception.InternalErrorException;

	/**
	 * Operation findAdministradorSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer

	 * @param codiUsuari 
	 * @param idFitxer 
	 * @return 
	 */
	com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer findAdministradorSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(
		java.lang.String codiUsuari, 
		java.lang.Long idFitxer)
			throws es.caib.seycon.ng.exception.InternalErrorException;

	/**
	 * Operation findResponsableSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer

	 * @param codiUsuari 
	 * @param idFitxer 
	 * @return 
	 */
	com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer findResponsableSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(
		java.lang.String codiUsuari, 
		java.lang.Long idFitxer)
			throws es.caib.seycon.ng.exception.InternalErrorException;

	/**
	 * Operation findAdministradorsSeguretatOrganitzatiusFitxerByIdFitxer

	 * @param idFitxer 
	 * @return 
	 */
	java.util.Collection<com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer> findAdministradorsSeguretatOrganitzatiusFitxerByIdFitxer(
		java.lang.Long idFitxer)
			throws es.caib.seycon.ng.exception.InternalErrorException;

	/**
	 * Operation findResponsablesSeguretatOrganitzatiusFitxerByIdFitxer

	 * @param idFitxer 
	 * @return 
	 */
	java.util.Collection<com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer> findResponsablesSeguretatOrganitzatiusFitxerByIdFitxer(
		java.lang.Long idFitxer)
			throws es.caib.seycon.ng.exception.InternalErrorException;

	/**
	 * Operation create

	 * @param rolFitxer 
	 * @return 
	 */
	com.soffid.iam.addons.lopd.common.RolFitxer create(
		com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer)
			throws es.caib.seycon.ng.exception.InternalErrorException;

	/**
	 * Operation delete

	 * @param rolFitxer 
	 */
	void delete(
		com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer)
			throws es.caib.seycon.ng.exception.InternalErrorException;

	/**
	 * Operation findRolsFitxersByIdFitxer

	 * @param idFitxer 
	 * @return 
	 */
	java.util.Collection<com.soffid.iam.addons.lopd.common.RolFitxer> findRolsFitxersByIdFitxer(
		java.lang.Long idFitxer)
			throws es.caib.seycon.ng.exception.InternalErrorException;

	/**
	 * Operation findRolFitxerByNomRolAndIdFitxer

	 * @param nomRol 
	 * @param idFitxer 
	 * @return 
	 */
	com.soffid.iam.addons.lopd.common.RolFitxer findRolFitxerByNomRolAndIdFitxer(
		java.lang.String nomRol, 
		java.lang.Long idFitxer)
			throws es.caib.seycon.ng.exception.InternalErrorException;

}
