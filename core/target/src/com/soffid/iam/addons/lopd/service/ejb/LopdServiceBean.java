//
// (C) 2013 Soffid
//
//

package com.soffid.iam.addons.lopd.service.ejb;
/**
 * @see <code>com.soffid.iam.addons.lopd.service.LopdService</code>,
 */
public class LopdServiceBean extends org.springframework.ejb.support.AbstractStatelessSessionBean
{
	private com.soffid.iam.addons.lopd.service.LopdService lopdService;

	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> getFitxers()
	 */
	public java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> getFitxers()
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		es.caib.seycon.ng.PrincipalStore.set(super.getSessionContext().getCallerPrincipal());
		try
		{
			return this.lopdService.getFitxers(); 
		}
		catch (Exception exception)
		{
			final Throwable cause = getRootCause(exception);
			if (cause instanceof Exception)
				throw new javax.ejb.EJBException ((Exception)cause);
			throw new javax.ejb.EJBException (exception);
		}
	}
	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#com.soffid.iam.addons.lopd.common.Fitxer create(com.soffid.iam.addons.lopd.common.Fitxer fitxer)
	 */
	public com.soffid.iam.addons.lopd.common.Fitxer create(
		com.soffid.iam.addons.lopd.common.Fitxer fitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		es.caib.seycon.ng.PrincipalStore.set(super.getSessionContext().getCallerPrincipal());
		try
		{
			return this.lopdService.create(fitxer); 
		}
		catch (Exception exception)
		{
			final Throwable cause = getRootCause(exception);
			if (cause instanceof Exception)
				throw new javax.ejb.EJBException ((Exception)cause);
			throw new javax.ejb.EJBException (exception);
		}
	}
	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#com.soffid.iam.addons.lopd.common.Fitxer update(com.soffid.iam.addons.lopd.common.Fitxer fitxer)
	 */
	public com.soffid.iam.addons.lopd.common.Fitxer update(
		com.soffid.iam.addons.lopd.common.Fitxer fitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		es.caib.seycon.ng.PrincipalStore.set(super.getSessionContext().getCallerPrincipal());
		try
		{
			return this.lopdService.update(fitxer); 
		}
		catch (Exception exception)
		{
			final Throwable cause = getRootCause(exception);
			if (cause instanceof Exception)
				throw new javax.ejb.EJBException ((Exception)cause);
			throw new javax.ejb.EJBException (exception);
		}
	}
	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#void delete(com.soffid.iam.addons.lopd.common.Fitxer fitxer)
	 */
	public void delete(
		com.soffid.iam.addons.lopd.common.Fitxer fitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		es.caib.seycon.ng.PrincipalStore.set(super.getSessionContext().getCallerPrincipal());
		try
		{
			this.lopdService.delete(fitxer); 
		}
		catch (Exception exception)
		{
			final Throwable cause = getRootCause(exception);
			if (cause instanceof Exception)
				throw new javax.ejb.EJBException ((Exception)cause);
			throw new javax.ejb.EJBException (exception);
		}
	}
	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#java.util.Collection<es.caib.seycon.ng.comu.Rol> findRolesByIdFitxer(java.lang.Long idFitxer)
	 */
	public java.util.Collection<es.caib.seycon.ng.comu.Rol> findRolesByIdFitxer(
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		es.caib.seycon.ng.PrincipalStore.set(super.getSessionContext().getCallerPrincipal());
		try
		{
			return this.lopdService.findRolesByIdFitxer(idFitxer); 
		}
		catch (Exception exception)
		{
			final Throwable cause = getRootCause(exception);
			if (cause instanceof Exception)
				throw new javax.ejb.EJBException ((Exception)cause);
			throw new javax.ejb.EJBException (exception);
		}
	}
	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> findFitxersByFiltre(java.lang.String id, java.lang.String nom, java.lang.String responsable, java.lang.String conselleria, java.lang.String dg, java.lang.String nivell, java.lang.String registrat)
	 */
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
		es.caib.seycon.ng.PrincipalStore.set(super.getSessionContext().getCallerPrincipal());
		try
		{
			return this.lopdService.findFitxersByFiltre(id, nom, responsable, conselleria, dg, nivell, registrat); 
		}
		catch (Exception exception)
		{
			final Throwable cause = getRootCause(exception);
			if (cause instanceof Exception)
				throw new javax.ejb.EJBException ((Exception)cause);
			throw new javax.ejb.EJBException (exception);
		}
	}
	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> findFitxersByNomFitxer(java.lang.String nomFitxer)
	 */
	public java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> findFitxersByNomFitxer(
		java.lang.String nomFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		es.caib.seycon.ng.PrincipalStore.set(super.getSessionContext().getCallerPrincipal());
		try
		{
			return this.lopdService.findFitxersByNomFitxer(nomFitxer); 
		}
		catch (Exception exception)
		{
			final Throwable cause = getRootCause(exception);
			if (cause instanceof Exception)
				throw new javax.ejb.EJBException ((Exception)cause);
			throw new javax.ejb.EJBException (exception);
		}
	}
	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#com.soffid.iam.addons.lopd.common.Fitxer findFitxerById(java.lang.Long idFitxer)
	 */
	public com.soffid.iam.addons.lopd.common.Fitxer findFitxerById(
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		es.caib.seycon.ng.PrincipalStore.set(super.getSessionContext().getCallerPrincipal());
		try
		{
			return this.lopdService.findFitxerById(idFitxer); 
		}
		catch (Exception exception)
		{
			final Throwable cause = getRootCause(exception);
			if (cause instanceof Exception)
				throw new javax.ejb.EJBException ((Exception)cause);
			throw new javax.ejb.EJBException (exception);
		}
	}
	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer create(com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer)
	 */
	public com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer create(
		com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		es.caib.seycon.ng.PrincipalStore.set(super.getSessionContext().getCallerPrincipal());
		try
		{
			return this.lopdService.create(responsableSeguretatOrganitzatiuFitxer); 
		}
		catch (Exception exception)
		{
			final Throwable cause = getRootCause(exception);
			if (cause instanceof Exception)
				throw new javax.ejb.EJBException ((Exception)cause);
			throw new javax.ejb.EJBException (exception);
		}
	}
	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#void delete(com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer)
	 */
	public void delete(
		com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		es.caib.seycon.ng.PrincipalStore.set(super.getSessionContext().getCallerPrincipal());
		try
		{
			this.lopdService.delete(responsableSeguretatOrganitzatiuFitxer); 
		}
		catch (Exception exception)
		{
			final Throwable cause = getRootCause(exception);
			if (cause instanceof Exception)
				throw new javax.ejb.EJBException ((Exception)cause);
			throw new javax.ejb.EJBException (exception);
		}
	}
	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer create(com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer)
	 */
	public com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer create(
		com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		es.caib.seycon.ng.PrincipalStore.set(super.getSessionContext().getCallerPrincipal());
		try
		{
			return this.lopdService.create(administradorSeguretatOrganitzatiuFitxer); 
		}
		catch (Exception exception)
		{
			final Throwable cause = getRootCause(exception);
			if (cause instanceof Exception)
				throw new javax.ejb.EJBException ((Exception)cause);
			throw new javax.ejb.EJBException (exception);
		}
	}
	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#void delete(com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer)
	 */
	public void delete(
		com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		es.caib.seycon.ng.PrincipalStore.set(super.getSessionContext().getCallerPrincipal());
		try
		{
			this.lopdService.delete(administradorSeguretatOrganitzatiuFitxer); 
		}
		catch (Exception exception)
		{
			final Throwable cause = getRootCause(exception);
			if (cause instanceof Exception)
				throw new javax.ejb.EJBException ((Exception)cause);
			throw new javax.ejb.EJBException (exception);
		}
	}
	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer findAdministradorSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(java.lang.String codiUsuari, java.lang.Long idFitxer)
	 */
	public com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer findAdministradorSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(
		java.lang.String codiUsuari, 
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		es.caib.seycon.ng.PrincipalStore.set(super.getSessionContext().getCallerPrincipal());
		try
		{
			return this.lopdService.findAdministradorSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(codiUsuari, idFitxer); 
		}
		catch (Exception exception)
		{
			final Throwable cause = getRootCause(exception);
			if (cause instanceof Exception)
				throw new javax.ejb.EJBException ((Exception)cause);
			throw new javax.ejb.EJBException (exception);
		}
	}
	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer findResponsableSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(java.lang.String codiUsuari, java.lang.Long idFitxer)
	 */
	public com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer findResponsableSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(
		java.lang.String codiUsuari, 
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		es.caib.seycon.ng.PrincipalStore.set(super.getSessionContext().getCallerPrincipal());
		try
		{
			return this.lopdService.findResponsableSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(codiUsuari, idFitxer); 
		}
		catch (Exception exception)
		{
			final Throwable cause = getRootCause(exception);
			if (cause instanceof Exception)
				throw new javax.ejb.EJBException ((Exception)cause);
			throw new javax.ejb.EJBException (exception);
		}
	}
	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#java.util.Collection<com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer> findAdministradorsSeguretatOrganitzatiusFitxerByIdFitxer(java.lang.Long idFitxer)
	 */
	public java.util.Collection<com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer> findAdministradorsSeguretatOrganitzatiusFitxerByIdFitxer(
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		es.caib.seycon.ng.PrincipalStore.set(super.getSessionContext().getCallerPrincipal());
		try
		{
			return this.lopdService.findAdministradorsSeguretatOrganitzatiusFitxerByIdFitxer(idFitxer); 
		}
		catch (Exception exception)
		{
			final Throwable cause = getRootCause(exception);
			if (cause instanceof Exception)
				throw new javax.ejb.EJBException ((Exception)cause);
			throw new javax.ejb.EJBException (exception);
		}
	}
	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#java.util.Collection<com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer> findResponsablesSeguretatOrganitzatiusFitxerByIdFitxer(java.lang.Long idFitxer)
	 */
	public java.util.Collection<com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer> findResponsablesSeguretatOrganitzatiusFitxerByIdFitxer(
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		es.caib.seycon.ng.PrincipalStore.set(super.getSessionContext().getCallerPrincipal());
		try
		{
			return this.lopdService.findResponsablesSeguretatOrganitzatiusFitxerByIdFitxer(idFitxer); 
		}
		catch (Exception exception)
		{
			final Throwable cause = getRootCause(exception);
			if (cause instanceof Exception)
				throw new javax.ejb.EJBException ((Exception)cause);
			throw new javax.ejb.EJBException (exception);
		}
	}
	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#com.soffid.iam.addons.lopd.common.RolFitxer create(com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer)
	 */
	public com.soffid.iam.addons.lopd.common.RolFitxer create(
		com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		es.caib.seycon.ng.PrincipalStore.set(super.getSessionContext().getCallerPrincipal());
		try
		{
			return this.lopdService.create(rolFitxer); 
		}
		catch (Exception exception)
		{
			final Throwable cause = getRootCause(exception);
			if (cause instanceof Exception)
				throw new javax.ejb.EJBException ((Exception)cause);
			throw new javax.ejb.EJBException (exception);
		}
	}
	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#void delete(com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer)
	 */
	public void delete(
		com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		es.caib.seycon.ng.PrincipalStore.set(super.getSessionContext().getCallerPrincipal());
		try
		{
			this.lopdService.delete(rolFitxer); 
		}
		catch (Exception exception)
		{
			final Throwable cause = getRootCause(exception);
			if (cause instanceof Exception)
				throw new javax.ejb.EJBException ((Exception)cause);
			throw new javax.ejb.EJBException (exception);
		}
	}
	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#java.util.Collection<com.soffid.iam.addons.lopd.common.RolFitxer> findRolsFitxersByIdFitxer(java.lang.Long idFitxer)
	 */
	public java.util.Collection<com.soffid.iam.addons.lopd.common.RolFitxer> findRolsFitxersByIdFitxer(
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		es.caib.seycon.ng.PrincipalStore.set(super.getSessionContext().getCallerPrincipal());
		try
		{
			return this.lopdService.findRolsFitxersByIdFitxer(idFitxer); 
		}
		catch (Exception exception)
		{
			final Throwable cause = getRootCause(exception);
			if (cause instanceof Exception)
				throw new javax.ejb.EJBException ((Exception)cause);
			throw new javax.ejb.EJBException (exception);
		}
	}
	/**
	 * @see com.soffid.iam.addons.lopd.service.LopdService#com.soffid.iam.addons.lopd.common.RolFitxer findRolFitxerByNomRolAndIdFitxer(java.lang.String nomRol, java.lang.Long idFitxer)
	 */
	public com.soffid.iam.addons.lopd.common.RolFitxer findRolFitxerByNomRolAndIdFitxer(
		java.lang.String nomRol, 
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException
	{
		es.caib.seycon.ng.PrincipalStore.set(super.getSessionContext().getCallerPrincipal());
		try
		{
			return this.lopdService.findRolFitxerByNomRolAndIdFitxer(nomRol, idFitxer); 
		}
		catch (Exception exception)
		{
			final Throwable cause = getRootCause(exception);
			if (cause instanceof Exception)
				throw new javax.ejb.EJBException ((Exception)cause);
			throw new javax.ejb.EJBException (exception);
		}
	}
	/**
	 * Every Spring Session EJB needs to
	 * call this to instantiate the Spring
	 * Business Object.
	 *
	 * @see org.springframework.ejb.support.AbstractStatelessSessionBean#onEjbCreate()
	 */
	protected void onEjbCreate()
	{
		this.lopdService = (com.soffid.iam.addons.lopd.service.LopdService)
		getBeanFactory().getBean("lopd-lopdService");
	}
	
	/**
	 * Override default BeanFactoryLocator implementation to
	 * provide singleton loading of the application context Bean factory.
	 *
	 * @see javax.ejb.SessionBean#setSessionContext(javax.ejb.SessionContext)
	 */
	public void setSessionContext(javax.ejb.SessionContext sessionContext)
	{
		super.setSessionContext(sessionContext);
		super.setBeanFactoryLocator(
		org.springframework.context.access.ContextSingletonBeanFactoryLocator.getInstance("beanRefFactory.xml"));
		super.setBeanFactoryLocatorKey("beanRefFactory");
	}

	org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog (getClass());
	/**
	 * Finds the root cause of the parent exception
	 * by traveling up the exception tree.
	 */
	private static Throwable getRootCause(Throwable throwable)
	{
		if (throwable != null)
		{
			// Reflectively get any exception causes.
			try
			{
				Throwable targetException = null;
				// java.lang.reflect.InvocationTargetException
				String exceptionProperty = "targetException";
				if (org.apache.commons.beanutils.PropertyUtils.isReadable(throwable, exceptionProperty))
				{
					targetException = (Throwable)org.apache.commons.beanutils.PropertyUtils.getProperty(throwable, exceptionProperty);
				}
				else
				{
					exceptionProperty = "causedByException";
					//javax.ejb.EJBException
					if (org.apache.commons.beanutils.PropertyUtils.isReadable(throwable, exceptionProperty))
					{
						targetException = (Throwable)org.apache.commons.beanutils.PropertyUtils.getProperty(throwable, exceptionProperty);
					}
				}
				if (targetException != null)
				{
					throwable = targetException;
				}
			}
			catch (Exception exception)
			{
				// just print the exception and continue
				exception.printStackTrace();
			}
			if (throwable.getCause() != null)
			{
				throwable = throwable.getCause();
				throwable = getRootCause(throwable);
			}
		}
		return throwable;
	}
}
