//
// (C) 2013 Soffid
//
//

package com.soffid.iam.addons.lopd.service;
import org.springframework.transaction.annotation.Transactional;
/**
 * <p> 
 * Spring Service base class for <code>com.soffid.iam.addons.lopd.service.LopdService</code>,
 * provides access to all services and entities referenced by this service. 
 * </p>
 * 
 * see com.soffid.iam.addons.lopd.service.LopdService
 */
public abstract class LopdServiceBase	implements com.soffid.iam.addons.lopd.service.LopdService
 {
	private com.soffid.iam.addons.lopd.model.FitxerEntityDao fitxerEntityDao;

	/**
	 * Sets reference to <code>fitxerEntityDao</code>.
	 */
	public void setFitxerEntityDao (com.soffid.iam.addons.lopd.model.FitxerEntityDao fitxerEntityDao) {
		this.fitxerEntityDao = fitxerEntityDao;
	}

	/**
	 * Gets reference to <code>fitxerEntityDao</code>.
	 */
	public com.soffid.iam.addons.lopd.model.FitxerEntityDao getFitxerEntityDao () {
		return fitxerEntityDao;
	}

	private es.caib.seycon.ng.model.RolEntityDao rolEntityDao;

	/**
	 * Sets reference to <code>rolEntityDao</code>.
	 */
	public void setRolEntityDao (es.caib.seycon.ng.model.RolEntityDao rolEntityDao) {
		this.rolEntityDao = rolEntityDao;
	}

	/**
	 * Gets reference to <code>rolEntityDao</code>.
	 */
	public es.caib.seycon.ng.model.RolEntityDao getRolEntityDao () {
		return rolEntityDao;
	}

	private com.soffid.iam.addons.lopd.model.RolFitxerEntityDao rolFitxerEntityDao;

	/**
	 * Sets reference to <code>rolFitxerEntityDao</code>.
	 */
	public void setRolFitxerEntityDao (com.soffid.iam.addons.lopd.model.RolFitxerEntityDao rolFitxerEntityDao) {
		this.rolFitxerEntityDao = rolFitxerEntityDao;
	}

	/**
	 * Gets reference to <code>rolFitxerEntityDao</code>.
	 */
	public com.soffid.iam.addons.lopd.model.RolFitxerEntityDao getRolFitxerEntityDao () {
		return rolFitxerEntityDao;
	}

	private com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntityDao responsableSeguretatOrganitzatiuFitxerEntityDao;

	/**
	 * Sets reference to <code>responsableSeguretatOrganitzatiuFitxerEntityDao</code>.
	 */
	public void setResponsableSeguretatOrganitzatiuFitxerEntityDao (com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntityDao responsableSeguretatOrganitzatiuFitxerEntityDao) {
		this.responsableSeguretatOrganitzatiuFitxerEntityDao = responsableSeguretatOrganitzatiuFitxerEntityDao;
	}

	/**
	 * Gets reference to <code>responsableSeguretatOrganitzatiuFitxerEntityDao</code>.
	 */
	public com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntityDao getResponsableSeguretatOrganitzatiuFitxerEntityDao () {
		return responsableSeguretatOrganitzatiuFitxerEntityDao;
	}

	private com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntityDao administradorSeguretatOrganitzatiuFitxerEntityDao;

	/**
	 * Sets reference to <code>administradorSeguretatOrganitzatiuFitxerEntityDao</code>.
	 */
	public void setAdministradorSeguretatOrganitzatiuFitxerEntityDao (com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntityDao administradorSeguretatOrganitzatiuFitxerEntityDao) {
		this.administradorSeguretatOrganitzatiuFitxerEntityDao = administradorSeguretatOrganitzatiuFitxerEntityDao;
	}

	/**
	 * Gets reference to <code>administradorSeguretatOrganitzatiuFitxerEntityDao</code>.
	 */
	public com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntityDao getAdministradorSeguretatOrganitzatiuFitxerEntityDao () {
		return administradorSeguretatOrganitzatiuFitxerEntityDao;
	}


	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> getFitxers()
	 */
	@Transactional(rollbackFor={java.lang.Exception.class})
	public java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> getFitxers()
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		try
		{
			return handleGetFitxers();
		}
		catch (es.caib.seycon.ng.exception.InternalErrorException __internalException)
		{
			throw __internalException;
		}
		catch (Throwable th)
		{
			org.apache.commons.logging.LogFactory.getLog(com.soffid.iam.addons.lopd.service.LopdService.class).
				warn ("Error on LopdService.getFitxers", th);
			throw new es.caib.seycon.ng.exception.InternalErrorException(
				"Error on LopdService.getFitxers: "+th.toString(), th);
		}
	}

	protected abstract java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> handleGetFitxers() throws Exception;

	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#com.soffid.iam.addons.lopd.common.Fitxer create(com.soffid.iam.addons.lopd.common.Fitxer fitxer)
	 */
	@Transactional(rollbackFor={java.lang.Exception.class})
	public com.soffid.iam.addons.lopd.common.Fitxer create(
		com.soffid.iam.addons.lopd.common.Fitxer fitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		if (fitxer == null) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.Fitxer com.soffid.iam.addons.lopd.service.LopdService.create(com.soffid.iam.addons.lopd.common.Fitxer fitxer) - fitxer cannot be null");
		}
		if (fitxer.getNom() == null || fitxer.getNom().trim().length() == 0) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.Fitxer com.soffid.iam.addons.lopd.service.LopdService.create(com.soffid.iam.addons.lopd.common.Fitxer fitxer) - fitxer.nom cannot be null");
		}
		if (fitxer.getNivell() == null || fitxer.getNivell().trim().length() == 0) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.Fitxer com.soffid.iam.addons.lopd.service.LopdService.create(com.soffid.iam.addons.lopd.common.Fitxer fitxer) - fitxer.nivell cannot be null");
		}
		try
		{
			return handleCreate(fitxer);
		}
		catch (es.caib.seycon.ng.exception.InternalErrorException __internalException)
		{
			throw __internalException;
		}
		catch (Throwable th)
		{
			org.apache.commons.logging.LogFactory.getLog(com.soffid.iam.addons.lopd.service.LopdService.class).
				warn ("Error on LopdService.create", th);
			throw new es.caib.seycon.ng.exception.InternalErrorException(
				"Error on LopdService.create: "+th.toString(), th);
		}
	}

	protected abstract com.soffid.iam.addons.lopd.common.Fitxer handleCreate(com.soffid.iam.addons.lopd.common.Fitxer fitxer) throws Exception;

	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#com.soffid.iam.addons.lopd.common.Fitxer update(com.soffid.iam.addons.lopd.common.Fitxer fitxer)
	 */
	@Transactional(rollbackFor={java.lang.Exception.class})
	public com.soffid.iam.addons.lopd.common.Fitxer update(
		com.soffid.iam.addons.lopd.common.Fitxer fitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		if (fitxer == null) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.Fitxer com.soffid.iam.addons.lopd.service.LopdService.update(com.soffid.iam.addons.lopd.common.Fitxer fitxer) - fitxer cannot be null");
		}
		if (fitxer.getNom() == null || fitxer.getNom().trim().length() == 0) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.Fitxer com.soffid.iam.addons.lopd.service.LopdService.update(com.soffid.iam.addons.lopd.common.Fitxer fitxer) - fitxer.nom cannot be null");
		}
		if (fitxer.getNivell() == null || fitxer.getNivell().trim().length() == 0) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.Fitxer com.soffid.iam.addons.lopd.service.LopdService.update(com.soffid.iam.addons.lopd.common.Fitxer fitxer) - fitxer.nivell cannot be null");
		}
		try
		{
			return handleUpdate(fitxer);
		}
		catch (es.caib.seycon.ng.exception.InternalErrorException __internalException)
		{
			throw __internalException;
		}
		catch (Throwable th)
		{
			org.apache.commons.logging.LogFactory.getLog(com.soffid.iam.addons.lopd.service.LopdService.class).
				warn ("Error on LopdService.update", th);
			throw new es.caib.seycon.ng.exception.InternalErrorException(
				"Error on LopdService.update: "+th.toString(), th);
		}
	}

	protected abstract com.soffid.iam.addons.lopd.common.Fitxer handleUpdate(com.soffid.iam.addons.lopd.common.Fitxer fitxer) throws Exception;

	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#void delete(com.soffid.iam.addons.lopd.common.Fitxer fitxer)
	 */
	@Transactional(rollbackFor={java.lang.Exception.class})
	public void delete(
		com.soffid.iam.addons.lopd.common.Fitxer fitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		if (fitxer == null) {
			throw new IllegalArgumentException("void com.soffid.iam.addons.lopd.service.LopdService.delete(com.soffid.iam.addons.lopd.common.Fitxer fitxer) - fitxer cannot be null");
		}
		if (fitxer.getNom() == null || fitxer.getNom().trim().length() == 0) {
			throw new IllegalArgumentException("void com.soffid.iam.addons.lopd.service.LopdService.delete(com.soffid.iam.addons.lopd.common.Fitxer fitxer) - fitxer.nom cannot be null");
		}
		if (fitxer.getNivell() == null || fitxer.getNivell().trim().length() == 0) {
			throw new IllegalArgumentException("void com.soffid.iam.addons.lopd.service.LopdService.delete(com.soffid.iam.addons.lopd.common.Fitxer fitxer) - fitxer.nivell cannot be null");
		}
		try
		{
			handleDelete(fitxer);
		}
		catch (es.caib.seycon.ng.exception.InternalErrorException __internalException)
		{
			throw __internalException;
		}
		catch (Throwable th)
		{
			org.apache.commons.logging.LogFactory.getLog(com.soffid.iam.addons.lopd.service.LopdService.class).
				warn ("Error on LopdService.delete", th);
			throw new es.caib.seycon.ng.exception.InternalErrorException(
				"Error on LopdService.delete: "+th.toString(), th);
		}
	}

	protected abstract void handleDelete(com.soffid.iam.addons.lopd.common.Fitxer fitxer) throws Exception;

	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#java.util.Collection<es.caib.seycon.ng.comu.Rol> findRolesByIdFitxer(java.lang.Long idFitxer)
	 */
	@Transactional(rollbackFor={java.lang.Exception.class})
	public java.util.Collection<es.caib.seycon.ng.comu.Rol> findRolesByIdFitxer(
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		if (idFitxer == null) {
			throw new IllegalArgumentException("java.util.Collection<es.caib.seycon.ng.comu.Rol> com.soffid.iam.addons.lopd.service.LopdService.findRolesByIdFitxer(java.lang.Long idFitxer) - idFitxer cannot be null");
		}
		try
		{
			return handleFindRolesByIdFitxer(idFitxer);
		}
		catch (es.caib.seycon.ng.exception.InternalErrorException __internalException)
		{
			throw __internalException;
		}
		catch (Throwable th)
		{
			org.apache.commons.logging.LogFactory.getLog(com.soffid.iam.addons.lopd.service.LopdService.class).
				warn ("Error on LopdService.findRolesByIdFitxer", th);
			throw new es.caib.seycon.ng.exception.InternalErrorException(
				"Error on LopdService.findRolesByIdFitxer: "+th.toString(), th);
		}
	}

	protected abstract java.util.Collection<es.caib.seycon.ng.comu.Rol> handleFindRolesByIdFitxer(java.lang.Long idFitxer) throws Exception;

	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> findFitxersByFiltre(java.lang.String id, java.lang.String nom, java.lang.String responsable, java.lang.String conselleria, java.lang.String dg, java.lang.String nivell, java.lang.String registrat)
	 */
	@Transactional(rollbackFor={java.lang.Exception.class})
	public java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> findFitxersByFiltre(
		java.lang.String id, 
		java.lang.String nom, 
		java.lang.String responsable, 
		java.lang.String conselleria, 
		java.lang.String dg, 
		java.lang.String nivell, 
		java.lang.String registrat)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		try
		{
			return handleFindFitxersByFiltre(id, nom, responsable, conselleria, dg, nivell, registrat);
		}
		catch (es.caib.seycon.ng.exception.InternalErrorException __internalException)
		{
			throw __internalException;
		}
		catch (Throwable th)
		{
			org.apache.commons.logging.LogFactory.getLog(com.soffid.iam.addons.lopd.service.LopdService.class).
				warn ("Error on LopdService.findFitxersByFiltre", th);
			throw new es.caib.seycon.ng.exception.InternalErrorException(
				"Error on LopdService.findFitxersByFiltre: "+th.toString(), th);
		}
	}

	protected abstract java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> handleFindFitxersByFiltre(java.lang.String id, java.lang.String nom, java.lang.String responsable, java.lang.String conselleria, java.lang.String dg, java.lang.String nivell, java.lang.String registrat) throws Exception;

	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> findFitxersByNomFitxer(java.lang.String nomFitxer)
	 */
	@Transactional(rollbackFor={java.lang.Exception.class})
	public java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> findFitxersByNomFitxer(
		java.lang.String nomFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		try
		{
			return handleFindFitxersByNomFitxer(nomFitxer);
		}
		catch (es.caib.seycon.ng.exception.InternalErrorException __internalException)
		{
			throw __internalException;
		}
		catch (Throwable th)
		{
			org.apache.commons.logging.LogFactory.getLog(com.soffid.iam.addons.lopd.service.LopdService.class).
				warn ("Error on LopdService.findFitxersByNomFitxer", th);
			throw new es.caib.seycon.ng.exception.InternalErrorException(
				"Error on LopdService.findFitxersByNomFitxer: "+th.toString(), th);
		}
	}

	protected abstract java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> handleFindFitxersByNomFitxer(java.lang.String nomFitxer) throws Exception;

	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#com.soffid.iam.addons.lopd.common.Fitxer findFitxerById(java.lang.Long idFitxer)
	 */
	@Transactional(rollbackFor={java.lang.Exception.class})
	public com.soffid.iam.addons.lopd.common.Fitxer findFitxerById(
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		if (idFitxer == null) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.Fitxer com.soffid.iam.addons.lopd.service.LopdService.findFitxerById(java.lang.Long idFitxer) - idFitxer cannot be null");
		}
		try
		{
			return handleFindFitxerById(idFitxer);
		}
		catch (es.caib.seycon.ng.exception.InternalErrorException __internalException)
		{
			throw __internalException;
		}
		catch (Throwable th)
		{
			org.apache.commons.logging.LogFactory.getLog(com.soffid.iam.addons.lopd.service.LopdService.class).
				warn ("Error on LopdService.findFitxerById", th);
			throw new es.caib.seycon.ng.exception.InternalErrorException(
				"Error on LopdService.findFitxerById: "+th.toString(), th);
		}
	}

	protected abstract com.soffid.iam.addons.lopd.common.Fitxer handleFindFitxerById(java.lang.Long idFitxer) throws Exception;

	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer create(com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer)
	 */
	@Transactional(rollbackFor={java.lang.Exception.class})
	public com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer create(
		com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		if (responsableSeguretatOrganitzatiuFitxer == null) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer com.soffid.iam.addons.lopd.service.LopdService.create(com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer) - responsableSeguretatOrganitzatiuFitxer cannot be null");
		}
		if (responsableSeguretatOrganitzatiuFitxer.getCodiUsuari() == null || responsableSeguretatOrganitzatiuFitxer.getCodiUsuari().trim().length() == 0) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer com.soffid.iam.addons.lopd.service.LopdService.create(com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer) - responsableSeguretatOrganitzatiuFitxer.codiUsuari cannot be null");
		}
		try
		{
			return handleCreate(responsableSeguretatOrganitzatiuFitxer);
		}
		catch (es.caib.seycon.ng.exception.InternalErrorException __internalException)
		{
			throw __internalException;
		}
		catch (Throwable th)
		{
			org.apache.commons.logging.LogFactory.getLog(com.soffid.iam.addons.lopd.service.LopdService.class).
				warn ("Error on LopdService.create", th);
			throw new es.caib.seycon.ng.exception.InternalErrorException(
				"Error on LopdService.create: "+th.toString(), th);
		}
	}

	protected abstract com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer handleCreate(com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer) throws Exception;

	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#void delete(com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer)
	 */
	@Transactional(rollbackFor={java.lang.Exception.class})
	public void delete(
		com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		if (responsableSeguretatOrganitzatiuFitxer == null) {
			throw new IllegalArgumentException("void com.soffid.iam.addons.lopd.service.LopdService.delete(com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer) - responsableSeguretatOrganitzatiuFitxer cannot be null");
		}
		if (responsableSeguretatOrganitzatiuFitxer.getCodiUsuari() == null || responsableSeguretatOrganitzatiuFitxer.getCodiUsuari().trim().length() == 0) {
			throw new IllegalArgumentException("void com.soffid.iam.addons.lopd.service.LopdService.delete(com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer) - responsableSeguretatOrganitzatiuFitxer.codiUsuari cannot be null");
		}
		try
		{
			handleDelete(responsableSeguretatOrganitzatiuFitxer);
		}
		catch (es.caib.seycon.ng.exception.InternalErrorException __internalException)
		{
			throw __internalException;
		}
		catch (Throwable th)
		{
			org.apache.commons.logging.LogFactory.getLog(com.soffid.iam.addons.lopd.service.LopdService.class).
				warn ("Error on LopdService.delete", th);
			throw new es.caib.seycon.ng.exception.InternalErrorException(
				"Error on LopdService.delete: "+th.toString(), th);
		}
	}

	protected abstract void handleDelete(com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer) throws Exception;

	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer create(com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer)
	 */
	@Transactional(rollbackFor={java.lang.Exception.class})
	public com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer create(
		com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		if (administradorSeguretatOrganitzatiuFitxer == null) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer com.soffid.iam.addons.lopd.service.LopdService.create(com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer) - administradorSeguretatOrganitzatiuFitxer cannot be null");
		}
		if (administradorSeguretatOrganitzatiuFitxer.getCodiUsuari() == null || administradorSeguretatOrganitzatiuFitxer.getCodiUsuari().trim().length() == 0) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer com.soffid.iam.addons.lopd.service.LopdService.create(com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer) - administradorSeguretatOrganitzatiuFitxer.codiUsuari cannot be null");
		}
		try
		{
			return handleCreate(administradorSeguretatOrganitzatiuFitxer);
		}
		catch (es.caib.seycon.ng.exception.InternalErrorException __internalException)
		{
			throw __internalException;
		}
		catch (Throwable th)
		{
			org.apache.commons.logging.LogFactory.getLog(com.soffid.iam.addons.lopd.service.LopdService.class).
				warn ("Error on LopdService.create", th);
			throw new es.caib.seycon.ng.exception.InternalErrorException(
				"Error on LopdService.create: "+th.toString(), th);
		}
	}

	protected abstract com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer handleCreate(com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer) throws Exception;

	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#void delete(com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer)
	 */
	@Transactional(rollbackFor={java.lang.Exception.class})
	public void delete(
		com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		if (administradorSeguretatOrganitzatiuFitxer == null) {
			throw new IllegalArgumentException("void com.soffid.iam.addons.lopd.service.LopdService.delete(com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer) - administradorSeguretatOrganitzatiuFitxer cannot be null");
		}
		if (administradorSeguretatOrganitzatiuFitxer.getCodiUsuari() == null || administradorSeguretatOrganitzatiuFitxer.getCodiUsuari().trim().length() == 0) {
			throw new IllegalArgumentException("void com.soffid.iam.addons.lopd.service.LopdService.delete(com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer) - administradorSeguretatOrganitzatiuFitxer.codiUsuari cannot be null");
		}
		try
		{
			handleDelete(administradorSeguretatOrganitzatiuFitxer);
		}
		catch (es.caib.seycon.ng.exception.InternalErrorException __internalException)
		{
			throw __internalException;
		}
		catch (Throwable th)
		{
			org.apache.commons.logging.LogFactory.getLog(com.soffid.iam.addons.lopd.service.LopdService.class).
				warn ("Error on LopdService.delete", th);
			throw new es.caib.seycon.ng.exception.InternalErrorException(
				"Error on LopdService.delete: "+th.toString(), th);
		}
	}

	protected abstract void handleDelete(com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer) throws Exception;

	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer findAdministradorSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(java.lang.String codiUsuari, java.lang.Long idFitxer)
	 */
	@Transactional(rollbackFor={java.lang.Exception.class})
	public com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer findAdministradorSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(
		java.lang.String codiUsuari, 
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		if (codiUsuari == null || codiUsuari.trim().length() == 0) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer com.soffid.iam.addons.lopd.service.LopdService.findAdministradorSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(java.lang.String codiUsuari, java.lang.Long idFitxer) - codiUsuari cannot be null");
		}
		if (idFitxer == null) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer com.soffid.iam.addons.lopd.service.LopdService.findAdministradorSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(java.lang.String codiUsuari, java.lang.Long idFitxer) - idFitxer cannot be null");
		}
		try
		{
			return handleFindAdministradorSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(codiUsuari, idFitxer);
		}
		catch (es.caib.seycon.ng.exception.InternalErrorException __internalException)
		{
			throw __internalException;
		}
		catch (Throwable th)
		{
			org.apache.commons.logging.LogFactory.getLog(com.soffid.iam.addons.lopd.service.LopdService.class).
				warn ("Error on LopdService.findAdministradorSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer", th);
			throw new es.caib.seycon.ng.exception.InternalErrorException(
				"Error on LopdService.findAdministradorSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer: "+th.toString(), th);
		}
	}

	protected abstract com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer handleFindAdministradorSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(java.lang.String codiUsuari, java.lang.Long idFitxer) throws Exception;

	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer findResponsableSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(java.lang.String codiUsuari, java.lang.Long idFitxer)
	 */
	@Transactional(rollbackFor={java.lang.Exception.class})
	public com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer findResponsableSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(
		java.lang.String codiUsuari, 
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		if (codiUsuari == null || codiUsuari.trim().length() == 0) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer com.soffid.iam.addons.lopd.service.LopdService.findResponsableSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(java.lang.String codiUsuari, java.lang.Long idFitxer) - codiUsuari cannot be null");
		}
		if (idFitxer == null) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer com.soffid.iam.addons.lopd.service.LopdService.findResponsableSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(java.lang.String codiUsuari, java.lang.Long idFitxer) - idFitxer cannot be null");
		}
		try
		{
			return handleFindResponsableSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(codiUsuari, idFitxer);
		}
		catch (es.caib.seycon.ng.exception.InternalErrorException __internalException)
		{
			throw __internalException;
		}
		catch (Throwable th)
		{
			org.apache.commons.logging.LogFactory.getLog(com.soffid.iam.addons.lopd.service.LopdService.class).
				warn ("Error on LopdService.findResponsableSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer", th);
			throw new es.caib.seycon.ng.exception.InternalErrorException(
				"Error on LopdService.findResponsableSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer: "+th.toString(), th);
		}
	}

	protected abstract com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer handleFindResponsableSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(java.lang.String codiUsuari, java.lang.Long idFitxer) throws Exception;

	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#java.util.Collection<com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer> findAdministradorsSeguretatOrganitzatiusFitxerByIdFitxer(java.lang.Long idFitxer)
	 */
	@Transactional(rollbackFor={java.lang.Exception.class})
	public java.util.Collection<com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer> findAdministradorsSeguretatOrganitzatiusFitxerByIdFitxer(
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		if (idFitxer == null) {
			throw new IllegalArgumentException("java.util.Collection<com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer> com.soffid.iam.addons.lopd.service.LopdService.findAdministradorsSeguretatOrganitzatiusFitxerByIdFitxer(java.lang.Long idFitxer) - idFitxer cannot be null");
		}
		try
		{
			return handleFindAdministradorsSeguretatOrganitzatiusFitxerByIdFitxer(idFitxer);
		}
		catch (es.caib.seycon.ng.exception.InternalErrorException __internalException)
		{
			throw __internalException;
		}
		catch (Throwable th)
		{
			org.apache.commons.logging.LogFactory.getLog(com.soffid.iam.addons.lopd.service.LopdService.class).
				warn ("Error on LopdService.findAdministradorsSeguretatOrganitzatiusFitxerByIdFitxer", th);
			throw new es.caib.seycon.ng.exception.InternalErrorException(
				"Error on LopdService.findAdministradorsSeguretatOrganitzatiusFitxerByIdFitxer: "+th.toString(), th);
		}
	}

	protected abstract java.util.Collection<com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer> handleFindAdministradorsSeguretatOrganitzatiusFitxerByIdFitxer(java.lang.Long idFitxer) throws Exception;

	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#java.util.Collection<com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer> findResponsablesSeguretatOrganitzatiusFitxerByIdFitxer(java.lang.Long idFitxer)
	 */
	@Transactional(rollbackFor={java.lang.Exception.class})
	public java.util.Collection<com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer> findResponsablesSeguretatOrganitzatiusFitxerByIdFitxer(
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		if (idFitxer == null) {
			throw new IllegalArgumentException("java.util.Collection<com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer> com.soffid.iam.addons.lopd.service.LopdService.findResponsablesSeguretatOrganitzatiusFitxerByIdFitxer(java.lang.Long idFitxer) - idFitxer cannot be null");
		}
		try
		{
			return handleFindResponsablesSeguretatOrganitzatiusFitxerByIdFitxer(idFitxer);
		}
		catch (es.caib.seycon.ng.exception.InternalErrorException __internalException)
		{
			throw __internalException;
		}
		catch (Throwable th)
		{
			org.apache.commons.logging.LogFactory.getLog(com.soffid.iam.addons.lopd.service.LopdService.class).
				warn ("Error on LopdService.findResponsablesSeguretatOrganitzatiusFitxerByIdFitxer", th);
			throw new es.caib.seycon.ng.exception.InternalErrorException(
				"Error on LopdService.findResponsablesSeguretatOrganitzatiusFitxerByIdFitxer: "+th.toString(), th);
		}
	}

	protected abstract java.util.Collection<com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer> handleFindResponsablesSeguretatOrganitzatiusFitxerByIdFitxer(java.lang.Long idFitxer) throws Exception;

	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#com.soffid.iam.addons.lopd.common.RolFitxer create(com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer)
	 */
	@Transactional(rollbackFor={java.lang.Exception.class})
	public com.soffid.iam.addons.lopd.common.RolFitxer create(
		com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		if (rolFitxer == null) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.RolFitxer com.soffid.iam.addons.lopd.service.LopdService.create(com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer) - rolFitxer cannot be null");
		}
		if (rolFitxer.getCodiAplicacioRol() == null || rolFitxer.getCodiAplicacioRol().trim().length() == 0) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.RolFitxer com.soffid.iam.addons.lopd.service.LopdService.create(com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer) - rolFitxer.codiAplicacioRol cannot be null");
		}
		if (rolFitxer.getCodiBaseDeDades() == null || rolFitxer.getCodiBaseDeDades().trim().length() == 0) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.RolFitxer com.soffid.iam.addons.lopd.service.LopdService.create(com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer) - rolFitxer.codiBaseDeDades cannot be null");
		}
		if (rolFitxer.getIdFitxer() == null ) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.RolFitxer com.soffid.iam.addons.lopd.service.LopdService.create(com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer) - rolFitxer.idFitxer cannot be null");
		}
		if (rolFitxer.getNomRol() == null || rolFitxer.getNomRol().trim().length() == 0) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.RolFitxer com.soffid.iam.addons.lopd.service.LopdService.create(com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer) - rolFitxer.nomRol cannot be null");
		}
		try
		{
			return handleCreate(rolFitxer);
		}
		catch (es.caib.seycon.ng.exception.InternalErrorException __internalException)
		{
			throw __internalException;
		}
		catch (Throwable th)
		{
			org.apache.commons.logging.LogFactory.getLog(com.soffid.iam.addons.lopd.service.LopdService.class).
				warn ("Error on LopdService.create", th);
			throw new es.caib.seycon.ng.exception.InternalErrorException(
				"Error on LopdService.create: "+th.toString(), th);
		}
	}

	protected abstract com.soffid.iam.addons.lopd.common.RolFitxer handleCreate(com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer) throws Exception;

	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#void delete(com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer)
	 */
	@Transactional(rollbackFor={java.lang.Exception.class})
	public void delete(
		com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		if (rolFitxer == null) {
			throw new IllegalArgumentException("void com.soffid.iam.addons.lopd.service.LopdService.delete(com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer) - rolFitxer cannot be null");
		}
		if (rolFitxer.getCodiAplicacioRol() == null || rolFitxer.getCodiAplicacioRol().trim().length() == 0) {
			throw new IllegalArgumentException("void com.soffid.iam.addons.lopd.service.LopdService.delete(com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer) - rolFitxer.codiAplicacioRol cannot be null");
		}
		if (rolFitxer.getCodiBaseDeDades() == null || rolFitxer.getCodiBaseDeDades().trim().length() == 0) {
			throw new IllegalArgumentException("void com.soffid.iam.addons.lopd.service.LopdService.delete(com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer) - rolFitxer.codiBaseDeDades cannot be null");
		}
		if (rolFitxer.getIdFitxer() == null ) {
			throw new IllegalArgumentException("void com.soffid.iam.addons.lopd.service.LopdService.delete(com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer) - rolFitxer.idFitxer cannot be null");
		}
		if (rolFitxer.getNomRol() == null || rolFitxer.getNomRol().trim().length() == 0) {
			throw new IllegalArgumentException("void com.soffid.iam.addons.lopd.service.LopdService.delete(com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer) - rolFitxer.nomRol cannot be null");
		}
		try
		{
			handleDelete(rolFitxer);
		}
		catch (es.caib.seycon.ng.exception.InternalErrorException __internalException)
		{
			throw __internalException;
		}
		catch (Throwable th)
		{
			org.apache.commons.logging.LogFactory.getLog(com.soffid.iam.addons.lopd.service.LopdService.class).
				warn ("Error on LopdService.delete", th);
			throw new es.caib.seycon.ng.exception.InternalErrorException(
				"Error on LopdService.delete: "+th.toString(), th);
		}
	}

	protected abstract void handleDelete(com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer) throws Exception;

	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#java.util.Collection<com.soffid.iam.addons.lopd.common.RolFitxer> findRolsFitxersByIdFitxer(java.lang.Long idFitxer)
	 */
	@Transactional(rollbackFor={java.lang.Exception.class})
	public java.util.Collection<com.soffid.iam.addons.lopd.common.RolFitxer> findRolsFitxersByIdFitxer(
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		if (idFitxer == null) {
			throw new IllegalArgumentException("java.util.Collection<com.soffid.iam.addons.lopd.common.RolFitxer> com.soffid.iam.addons.lopd.service.LopdService.findRolsFitxersByIdFitxer(java.lang.Long idFitxer) - idFitxer cannot be null");
		}
		try
		{
			return handleFindRolsFitxersByIdFitxer(idFitxer);
		}
		catch (es.caib.seycon.ng.exception.InternalErrorException __internalException)
		{
			throw __internalException;
		}
		catch (Throwable th)
		{
			org.apache.commons.logging.LogFactory.getLog(com.soffid.iam.addons.lopd.service.LopdService.class).
				warn ("Error on LopdService.findRolsFitxersByIdFitxer", th);
			throw new es.caib.seycon.ng.exception.InternalErrorException(
				"Error on LopdService.findRolsFitxersByIdFitxer: "+th.toString(), th);
		}
	}

	protected abstract java.util.Collection<com.soffid.iam.addons.lopd.common.RolFitxer> handleFindRolsFitxersByIdFitxer(java.lang.Long idFitxer) throws Exception;

	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#com.soffid.iam.addons.lopd.common.RolFitxer findRolFitxerByNomRolAndIdFitxer(java.lang.String nomRol, java.lang.Long idFitxer)
	 */
	@Transactional(rollbackFor={java.lang.Exception.class})
	public com.soffid.iam.addons.lopd.common.RolFitxer findRolFitxerByNomRolAndIdFitxer(
		java.lang.String nomRol, 
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		if (nomRol == null || nomRol.trim().length() == 0) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.RolFitxer com.soffid.iam.addons.lopd.service.LopdService.findRolFitxerByNomRolAndIdFitxer(java.lang.String nomRol, java.lang.Long idFitxer) - nomRol cannot be null");
		}
		if (idFitxer == null) {
			throw new IllegalArgumentException("com.soffid.iam.addons.lopd.common.RolFitxer com.soffid.iam.addons.lopd.service.LopdService.findRolFitxerByNomRolAndIdFitxer(java.lang.String nomRol, java.lang.Long idFitxer) - idFitxer cannot be null");
		}
		try
		{
			return handleFindRolFitxerByNomRolAndIdFitxer(nomRol, idFitxer);
		}
		catch (es.caib.seycon.ng.exception.InternalErrorException __internalException)
		{
			throw __internalException;
		}
		catch (Throwable th)
		{
			org.apache.commons.logging.LogFactory.getLog(com.soffid.iam.addons.lopd.service.LopdService.class).
				warn ("Error on LopdService.findRolFitxerByNomRolAndIdFitxer", th);
			throw new es.caib.seycon.ng.exception.InternalErrorException(
				"Error on LopdService.findRolFitxerByNomRolAndIdFitxer: "+th.toString(), th);
		}
	}

	protected abstract com.soffid.iam.addons.lopd.common.RolFitxer handleFindRolFitxerByNomRolAndIdFitxer(java.lang.String nomRol, java.lang.Long idFitxer) throws Exception;

	/**
	 * Gets the current <code>principal</code> if one has been set,
	 * otherwise returns <code>null</code>.
	 *
	 * @return the current principal
	 */
	protected java.security.Principal getPrincipal()
	{
		return es.caib.seycon.ng.PrincipalStore.get();
	}
}
