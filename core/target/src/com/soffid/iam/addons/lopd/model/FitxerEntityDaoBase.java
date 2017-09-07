//
// (C) 2013 Soffid
//
//

package com.soffid.iam.addons.lopd.model;
/**
 * DAO Base for Entity FitxerEntity
 */
public abstract class FitxerEntityDaoBase
	extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
	implements com.soffid.iam.addons.lopd.model.FitxerEntityDao
{
	es.caib.seycon.ng.model.UsuariEntityDao usuariEntityDao;

	/**
	 * Sets reference to <code>usuariEntityDao</code>.
	 */
	public void setUsuariEntityDao (es.caib.seycon.ng.model.UsuariEntityDao usuariEntityDao) {
		this.usuariEntityDao = usuariEntityDao;
	}

	/**
	 * Gets reference to <code>usuariEntityDao</code>.
	 */
	public es.caib.seycon.ng.model.UsuariEntityDao getUsuariEntityDao () {
		return usuariEntityDao;
	}

	es.caib.seycon.ng.model.GrupEntityDao grupEntityDao;

	/**
	 * Sets reference to <code>grupEntityDao</code>.
	 */
	public void setGrupEntityDao (es.caib.seycon.ng.model.GrupEntityDao grupEntityDao) {
		this.grupEntityDao = grupEntityDao;
	}

	/**
	 * Gets reference to <code>grupEntityDao</code>.
	 */
	public es.caib.seycon.ng.model.GrupEntityDao getGrupEntityDao () {
		return grupEntityDao;
	}

	es.caib.seycon.ng.model.AuditoriaEntityDao auditoriaEntityDao;

	/**
	 * Sets reference to <code>auditoriaEntityDao</code>.
	 */
	public void setAuditoriaEntityDao (es.caib.seycon.ng.model.AuditoriaEntityDao auditoriaEntityDao) {
		this.auditoriaEntityDao = auditoriaEntityDao;
	}

	/**
	 * Gets reference to <code>auditoriaEntityDao</code>.
	 */
	public es.caib.seycon.ng.model.AuditoriaEntityDao getAuditoriaEntityDao () {
		return auditoriaEntityDao;
	}

	com.soffid.iam.addons.lopd.model.RolFitxerEntityDao rolFitxerEntityDao;

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

	com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntityDao administradorSeguretatOrganitzatiuFitxerEntityDao;

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

	com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntityDao responsableSeguretatOrganitzatiuFitxerEntityDao;

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


	/**
	 * Operation findByFiltre

	 * @param filtre 
	 * @return 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> findByFiltre(
		com.soffid.iam.addons.lopd.common.FitxerSearchCriteria filtre) 
	{
		try {
			com.soffid.iam.addons.lopd.model.criteria.CriteriaSearch criteriaSearch = new com.soffid.iam.addons.lopd.model.criteria.CriteriaSearch(
				super.getSession(false), com.soffid.iam.addons.lopd.model.FitxerEntity.class);
			criteriaSearch.getConfiguration().setFirstResult(filtre.getFirstResult());
			criteriaSearch.getConfiguration().setFetchSize(filtre.getFetchSize());
			criteriaSearch.getConfiguration().setMaximumResultSize(filtre.getMaximumResultSize());
			if (filtre.getNom() != null) {
				com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchParameter param1 =
					new com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchParameter(
						filtre.getNom(),
						"nom", com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchParameter.LIKE_COMPARATOR);
				criteriaSearch.addParameter(param1);
			}
			if (filtre.getNivell() != null) {
				com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchParameter param2 =
					new com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchParameter(
						filtre.getNivell(),
						"nivell", com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchParameter.LIKE_COMPARATOR);
				criteriaSearch.addParameter(param2);
			}
			if (filtre.getRegistratAPD() != null) {
				com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchParameter param3 =
					new com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchParameter(
						filtre.getRegistratAPD(),
						"registratAPD", com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchParameter.LIKE_COMPARATOR);
				criteriaSearch.addParameter(param3);
			}
			if (filtre.getId() != null) {
				com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchParameter param4 =
					new com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchParameter(
						filtre.getId(),
						"id", com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchParameter.LIKE_COMPARATOR);
				criteriaSearch.addParameter(param4);
			}
			java.util.List results = criteriaSearch.executeAsList();
			return (java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity>) results;
		}
		catch (org.hibernate.HibernateException ex)
		{
			throw super.convertHibernateAccessException(ex);
		}
	}
	/**
	 * Operation findByNom

	 * @param nom 
	 * @return 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> findByNom(
		java.lang.String nom) 
	{
		return findByNom((com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration) null			, nom);
	}
	/**
	 * CriteriaSearchConfiguration implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> findByNom(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.String nom)
	
	{
		return findByNom("from com.soffid.iam.addons.lopd.model.FitxerEntity where nom=:nom",
			criteria, nom);
	}
	/**
	 * Internal implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> findByNom(final java.lang.String queryString, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.String nom)
	
	{
		try
		{
			org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("nom", nom);
			if (criteria != null && criteria.getMaximumResultSize () != null) {
				queryObject.setMaxResults (criteria.getMaximumResultSize ().intValue()); 
			}
			java.util.List results = queryObject.list();
			return (java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity>) results;
		}
		catch (org.hibernate.HibernateException ex) 
		{
			throw super.convertHibernateAccessException(ex);
		}
	}
	/**
	 * Operation findFitxersByFiltre

	 * @param id 
	 * @param nom 
	 * @param responsable 
	 * @param conselleria 
	 * @param dg 
	 * @param nivell 
	 * @param nullDate 
	 * @param dataMax 
	 * @param dataMin 
	 * @return 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> findFitxersByFiltre(
		java.lang.Long id, 
		java.lang.String nom, 
		java.lang.String responsable, 
		java.lang.String conselleria, 
		java.lang.String dg, 
		java.lang.String nivell, 
		java.util.Date nullDate, 
		java.util.Date dataMax, 
		java.util.Date dataMin) 
	{
		return findFitxersByFiltre((com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration) null			, id, nom, responsable, conselleria, dg, nivell, nullDate, dataMax, dataMin);
	}
	/**
	 * CriteriaSearchConfiguration implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> findFitxersByFiltre(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long id, java.lang.String nom, java.lang.String responsable, java.lang.String conselleria, java.lang.String dg, java.lang.String nivell, java.util.Date nullDate, java.util.Date dataMax, java.util.Date dataMin)
	
	{
		return findFitxersByFiltre("select fitxerEntity from com.soffid.iam.addons.lopd.model.FitxerEntity fitxerEntity\nleft join fitxerEntity.direccioGeneral as direccioGeneralEntity\nleft join direccioGeneralEntity.pare as conselleriaEntity\nleft join fitxerEntity.responsable as responsableEntity\nwhere  \n(:dataMax = :nullDate or fitxerEntity.dataRegistreAPD < :dataMax ) and\n(:dataMin = :nullDate or fitxerEntity.dataRegistreAPD > :dataMin ) and\n(:id is null or fitxerEntity.id like :id) and\n(:nom is null or fitxerEntity.nom like :nom) and\n(:nivell is null or fitxerEntity.nivell like :nivell) and\n(:conselleria is null or conselleriaEntity.codi like :conselleria) and\n(:dg is null or direccioGeneralEntity.codi like :dg) and\n(:responsable is null or responsableEntity.codi like :responsable)",
			criteria, id, nom, responsable, conselleria, dg, nivell, nullDate, dataMax, dataMin);
	}
	/**
	 * Internal implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> findFitxersByFiltre(final java.lang.String queryString, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long id, java.lang.String nom, java.lang.String responsable, java.lang.String conselleria, java.lang.String dg, java.lang.String nivell, java.util.Date nullDate, java.util.Date dataMax, java.util.Date dataMin)
	
	{
		try
		{
			org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("id", id);
			queryObject.setParameter("nom", nom);
			queryObject.setParameter("responsable", responsable);
			queryObject.setParameter("conselleria", conselleria);
			queryObject.setParameter("dg", dg);
			queryObject.setParameter("nivell", nivell);
			queryObject.setParameter("nullDate", nullDate);
			queryObject.setParameter("dataMax", dataMax);
			queryObject.setParameter("dataMin", dataMin);
			if (criteria != null && criteria.getMaximumResultSize () != null) {
				queryObject.setMaxResults (criteria.getMaximumResultSize ().intValue()); 
			}
			java.util.List results = queryObject.list();
			return (java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity>) results;
		}
		catch (org.hibernate.HibernateException ex) 
		{
			throw super.convertHibernateAccessException(ex);
		}
	}
	/**
	 * Operation findById

	 * @param id 
	 * @return 
	 */
	public com.soffid.iam.addons.lopd.model.FitxerEntity findById(
		java.lang.Long id) 
	{
		return findById((com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration) null			, id);
	}
	/**
	 * CriteriaSearchConfiguration implementation
	 */
	public com.soffid.iam.addons.lopd.model.FitxerEntity findById(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long id)
	
	{
		return findById("from com.soffid.iam.addons.lopd.model.FitxerEntity where id=:id",
			criteria, id);
	}
	/**
	 * Internal implementation
	 */
	public com.soffid.iam.addons.lopd.model.FitxerEntity findById(final java.lang.String queryString, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long id)
	
	{
		try
		{
			org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("id", id);
			if (criteria != null && criteria.getMaximumResultSize () != null) {
				queryObject.setMaxResults (criteria.getMaximumResultSize ().intValue()); 
			}
			java.util.Set results = new java.util.LinkedHashSet(queryObject.list());
			com.soffid.iam.addons.lopd.model.FitxerEntity result = null;
			if (results.size() > 1) {
				throw new org.springframework.dao.InvalidDataAccessResourceUsageException(
					"More than one instance of 'com.soffid.iam.addons.lopd.model.FitxerEntity' was found when executing query --> '" + queryString + "'");
			}
			else if (results.size() == 1)
			{
				result = (com.soffid.iam.addons.lopd.model.FitxerEntity) results.iterator().next();
			}
			return result;
		}
		catch (org.hibernate.HibernateException ex) 
		{
			throw super.convertHibernateAccessException(ex);
		}
	}
	/**
	 * Operation findFitxersByFiltre

	 * @param id 
	 * @param nom 
	 * @param responsable 
	 * @param conselleria 
	 * @param dg 
	 * @param nivell 
	 * @return 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> findFitxersByFiltre(
		java.lang.Long id, 
		java.lang.String nom, 
		java.lang.String responsable, 
		java.lang.String conselleria, 
		java.lang.String dg, 
		java.lang.String nivell) 
	{
		return findFitxersByFiltre((com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration) null			, id, nom, responsable, conselleria, dg, nivell);
	}
	/**
	 * CriteriaSearchConfiguration implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> findFitxersByFiltre(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long id, java.lang.String nom, java.lang.String responsable, java.lang.String conselleria, java.lang.String dg, java.lang.String nivell)
	
	{
		return findFitxersByFiltre("select fitxerEntity from com.soffid.iam.addons.lopd.model.FitxerEntity fitxerEntity\nleft join fitxerEntity.direccioGeneral as direccioGeneralEntity\nleft join direccioGeneralEntity.pare as conselleriaEntity\nleft join fitxerEntity.responsable as responsableEntity\nwhere\n(:id is null or fitxerEntity.id like :id) and\n(:nom is null or fitxerEntity.nom like :nom) and\n(:nivell is null or fitxerEntity.nivell like :nivell) and\n(:conselleria is null or conselleriaEntity.codi like :conselleria) and\n(:dg is null or direccioGeneralEntity.codi like :dg) and\n(:responsable is null or responsableEntity.codi like :responsable)",
			criteria, id, nom, responsable, conselleria, dg, nivell);
	}
	/**
	 * Internal implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> findFitxersByFiltre(final java.lang.String queryString, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long id, java.lang.String nom, java.lang.String responsable, java.lang.String conselleria, java.lang.String dg, java.lang.String nivell)
	
	{
		try
		{
			org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("id", id);
			queryObject.setParameter("nom", nom);
			queryObject.setParameter("responsable", responsable);
			queryObject.setParameter("conselleria", conselleria);
			queryObject.setParameter("dg", dg);
			queryObject.setParameter("nivell", nivell);
			if (criteria != null && criteria.getMaximumResultSize () != null) {
				queryObject.setMaxResults (criteria.getMaximumResultSize ().intValue()); 
			}
			java.util.List results = queryObject.list();
			return (java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity>) results;
		}
		catch (org.hibernate.HibernateException ex) 
		{
			throw super.convertHibernateAccessException(ex);
		}
	}
	/**
	 * Operation find

	 * @param parameters 
	 * @return 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> find(
		java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters) 
	{
		return find((com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration) null			, parameters);
	}
	/**
	 * CriteriaSearchConfiguration implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> find(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters)
	
	{
		return find("from com.soffid.iam.addons.lopd.model.FitxerEntity where parameters=:parameters",
			criteria, parameters);
	}
	/**
	 * Internal implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> find(final java.lang.String queryString, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters)
	
	{
		try
		{
			org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("parameters", parameters);
			if (criteria != null && criteria.getMaximumResultSize () != null) {
				queryObject.setMaxResults (criteria.getMaximumResultSize ().intValue()); 
			}
			java.util.List results = queryObject.list();
			return (java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity>) results;
		}
		catch (org.hibernate.HibernateException ex) 
		{
			throw super.convertHibernateAccessException(ex);
		}
	}
	/**
	 * Operation findByNomAndDireccioGeneral

	 * @param nom 
	 * @param direccioGeneral 
	 * @return 
	 */
	public com.soffid.iam.addons.lopd.model.FitxerEntity findByNomAndDireccioGeneral(
		java.lang.String nom, 
		java.lang.String direccioGeneral) 
	{
		return findByNomAndDireccioGeneral((com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration) null			, nom, direccioGeneral);
	}
	/**
	 * CriteriaSearchConfiguration implementation
	 */
	public com.soffid.iam.addons.lopd.model.FitxerEntity findByNomAndDireccioGeneral(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.String nom, java.lang.String direccioGeneral)
	
	{
		return findByNomAndDireccioGeneral("select fitxerEntity \nfrom com.soffid.iam.addons.lopd.model.FitxerEntity fitxerEntity \nleft join fitxerEntity.direccioGeneral direccioGeneral \nwhere \n(fitxerEntity.nom = :nom) and \n(\n    (direccioGeneral is null and :direccioGeneral is null) \n     or \n    (direccioGeneral is not null and direccioGeneral.codi =       :direccioGeneral) \n)",
			criteria, nom, direccioGeneral);
	}
	/**
	 * Internal implementation
	 */
	public com.soffid.iam.addons.lopd.model.FitxerEntity findByNomAndDireccioGeneral(final java.lang.String queryString, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.String nom, java.lang.String direccioGeneral)
	
	{
		try
		{
			org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("nom", nom);
			queryObject.setParameter("direccioGeneral", direccioGeneral);
			if (criteria != null && criteria.getMaximumResultSize () != null) {
				queryObject.setMaxResults (criteria.getMaximumResultSize ().intValue()); 
			}
			java.util.Set results = new java.util.LinkedHashSet(queryObject.list());
			com.soffid.iam.addons.lopd.model.FitxerEntity result = null;
			if (results.size() > 1) {
				throw new org.springframework.dao.InvalidDataAccessResourceUsageException(
					"More than one instance of 'com.soffid.iam.addons.lopd.model.FitxerEntity' was found when executing query --> '" + queryString + "'");
			}
			else if (results.size() == 1)
			{
				result = (com.soffid.iam.addons.lopd.model.FitxerEntity) results.iterator().next();
			}
			return result;
		}
		catch (org.hibernate.HibernateException ex) 
		{
			throw super.convertHibernateAccessException(ex);
		}
	}
	/**
	 *  Copy data to {@link com.soffid.iam.addons.lopd.common.Fitxer} object 
	 */
	public void toFitxer(com.soffid.iam.addons.lopd.model.FitxerEntity source, com.soffid.iam.addons.lopd.common.Fitxer target) {
		// Attributes for Fitxer
		target.setId(source.getId());
		target.setNom(source.getNom());
		// Incompatible types source.responsable and target.responsable
		target.setFinalitat(source.getFinalitat());
		target.setNivell(source.getNivell());
		target.setSistema(source.getSistema());
		// Incompatible types source.registratAPD and target.registratAPD
		target.setNomRegistreAPD(source.getNomRegistreAPD());
		// Missing attribute dataRegistre on entity
		target.setDisposicioLegal(source.getDisposicioLegal());
		target.setDadesIdentificatives(source.getDadesIdentificatives());
		target.setDadesPersonals(source.getDadesPersonals());
		target.setDadesSocials(source.getDadesSocials());
		target.setDadesAcademiquesProfessionals(source.getDadesAcademiquesProfessionals());
		target.setDadesLaborals(source.getDadesLaborals());
		target.setDadesComercials(source.getDadesComercials());
		target.setDadesFinanceres(source.getDadesFinanceres());
		target.setDadesTransaccionals(source.getDadesTransaccionals());
		target.setDadesInfraccions(source.getDadesInfraccions());
		// Missing attribute conselleria on entity
		// Incompatible types source.responsableSeguretatTecnic and target.responsableSeguretatTecnic
		target.setCodiRegistreAPD(source.getCodiRegistreAPD());
		target.setObservacions(source.getObservacions());
		target.setMotiuBaixa(source.getMotiuBaixa());
		// Missing attribute dataBaixaAPD on entity
		// Incompatible types source.direccioGeneral and target.direccioGeneral
	}

	/**
	 *  Transforms to {@link com.soffid.iam.addons.lopd.common.Fitxer} object 
	 */
	public com.soffid.iam.addons.lopd.common.Fitxer toFitxer(com.soffid.iam.addons.lopd.model.FitxerEntity entity) {
		final com.soffid.iam.addons.lopd.common.Fitxer target = new com.soffid.iam.addons.lopd.common.Fitxer();
		this.toFitxer(entity, target);
		return target;
	}

	/**
	 *  Transforms to {@link com.soffid.iam.addons.lopd.common.Fitxer} list 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.common.Fitxer> toFitxerList (java.util.Collection<com.soffid.iam.addons.lopd.model.FitxerEntity> instances) {
		if (instances == null)
			return null;
		else {
			java.util.LinkedList<com.soffid.iam.addons.lopd.common.Fitxer> list =
				new java.util.LinkedList<com.soffid.iam.addons.lopd.common.Fitxer>();
			for (final com.soffid.iam.addons.lopd.model.FitxerEntity instance: instances)
			{
				list.add( toFitxer(instance));
			}
			return list;
		}
	}
	/**
	 *  Copy data from {@link com.soffid.iam.addons.lopd.common.Fitxer} object 
	 */
	public void fitxerToEntity (com.soffid.iam.addons.lopd.common.Fitxer source, com.soffid.iam.addons.lopd.model.FitxerEntity target, boolean copyIfNull) {
		// Attributes for FitxerEntity
		if (copyIfNull || source.getNom() != null)
		{
			target.setNom(source.getNom());
		}
		if (copyIfNull || source.getFinalitat() != null)
		{
			target.setFinalitat(source.getFinalitat());
		}
		if (copyIfNull || source.getNivell() != null)
		{
			target.setNivell(source.getNivell());
		}
		if (copyIfNull || source.getSistema() != null)
		{
			target.setSistema(source.getSistema());
		}
		if (copyIfNull || source.getRegistratAPD() != null)
		{
			// Incompatible types source.registratAPD and target.registratAPD
		}
		if (copyIfNull || source.getNomRegistreAPD() != null)
		{
			target.setNomRegistreAPD(source.getNomRegistreAPD());
		}
		// Missing attribute dataRegistreAPD on entity
		if (copyIfNull || source.getDisposicioLegal() != null)
		{
			target.setDisposicioLegal(source.getDisposicioLegal());
		}
		if (copyIfNull || source.getDadesIdentificatives() != null)
		{
			target.setDadesIdentificatives(source.getDadesIdentificatives());
		}
		if (copyIfNull || source.getDadesPersonals() != null)
		{
			target.setDadesPersonals(source.getDadesPersonals());
		}
		if (copyIfNull || source.getDadesSocials() != null)
		{
			target.setDadesSocials(source.getDadesSocials());
		}
		if (copyIfNull || source.getDadesAcademiquesProfessionals() != null)
		{
			target.setDadesAcademiquesProfessionals(source.getDadesAcademiquesProfessionals());
		}
		if (copyIfNull || source.getDadesLaborals() != null)
		{
			target.setDadesLaborals(source.getDadesLaborals());
		}
		if (copyIfNull || source.getDadesComercials() != null)
		{
			target.setDadesComercials(source.getDadesComercials());
		}
		if (copyIfNull || source.getDadesFinanceres() != null)
		{
			target.setDadesFinanceres(source.getDadesFinanceres());
		}
		if (copyIfNull || source.getDadesTransaccionals() != null)
		{
			target.setDadesTransaccionals(source.getDadesTransaccionals());
		}
		if (copyIfNull || source.getDadesInfraccions() != null)
		{
			target.setDadesInfraccions(source.getDadesInfraccions());
		}
		if (copyIfNull || source.getCodiRegistreAPD() != null)
		{
			target.setCodiRegistreAPD(source.getCodiRegistreAPD());
		}
		if (copyIfNull || source.getObservacions() != null)
		{
			target.setObservacions(source.getObservacions());
		}
		if (copyIfNull || source.getMotiuBaixa() != null)
		{
			target.setMotiuBaixa(source.getMotiuBaixa());
		}
		// Missing attribute dataBaixa on entity
		if (copyIfNull || source.getResponsable() != null)
		{
			// Incompatible types source.responsable and target.responsable
		}
		if (copyIfNull || source.getDireccioGeneral() != null)
		{
			// Incompatible types source.direccioGeneral and target.direccioGeneral
		}
		// Missing attribute rolFitxers on entity
		if (copyIfNull || source.getResponsableSeguretatTecnic() != null)
		{
			// Incompatible types source.responsableSeguretatTecnic and target.responsableSeguretatTecnic
		}
		// Missing attribute administradorSeguretatOrganitzatiuUsuariFromFitxer on entity
		// Missing attribute responsableSeguretatOrganitzatiuUsuariFromFitxer on entity
	}

	/**
	 *  Transforms from {@link com.soffid.iam.addons.lopd.common.Fitxer} object 
	 */
	public com.soffid.iam.addons.lopd.model.FitxerEntity fitxerToEntity (com.soffid.iam.addons.lopd.common.Fitxer instance) {
		com.soffid.iam.addons.lopd.model.FitxerEntity entity;
		if (instance.getId() == null) 
			entity = newFitxerEntity();
		else
			entity = load(instance.getId());
		fitxerToEntity(instance, entity, true);
		return entity;
	}

	/**
	 *  Transforms from {@link com.soffid.iam.addons.lopd.common.Fitxer} list 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity>  fitxerToEntityList (java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> instances) 
	{
		if (instances == null)
			return null;
		java.util.LinkedList<com.soffid.iam.addons.lopd.model.FitxerEntity> list =
			new java.util.LinkedList<com.soffid.iam.addons.lopd.model.FitxerEntity>();
		for (com.soffid.iam.addons.lopd.common.Fitxer instance: instances)
		{
			list.add (fitxerToEntity(instance));
		}
		return list;
	}

	/**
	 * Creates an instance of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} .
	 */
	public com.soffid.iam.addons.lopd.model.FitxerEntity newFitxerEntity()
	{
		return new com.soffid.iam.addons.lopd.model.FitxerEntityImpl();
	}

	/**
	 * Loads an instance of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} from the persistent store.
	 */
	public com.soffid.iam.addons.lopd.model.FitxerEntity load(java.lang.Long id) {
		if (id == null) {
			throw new IllegalArgumentException("id cannot be null");
		}
		return (com.soffid.iam.addons.lopd.model.FitxerEntity) this.getHibernateTemplate().get(com.soffid.iam.addons.lopd.model.FitxerEntityImpl.class, id);
	}
	/**
	 * Loads all instances of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} from the persistent store.
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> loadAll() {
		return (java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity>)
			this.getHibernateTemplate().loadAll(com.soffid.iam.addons.lopd.model.FitxerEntityImpl.class);
	};

	/**
	 * Adds an instance of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} andto the persistent store.
	 */
	public void create (com.soffid.iam.addons.lopd.model.FitxerEntity entity)
	{
		if (entity == null)
		{
			throw new IllegalArgumentException(
				"FitxerEntityDao.create - 'entity' can not be null");
		}
		this.getHibernateTemplate().save(entity);
		this.getHibernateTemplate().flush();
	}

	/**
	 * Updates an instance of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} at the persistent store.
	 */
	public void update (com.soffid.iam.addons.lopd.model.FitxerEntity entity)
	{
		if (entity == null)
		{
			throw new IllegalArgumentException(
				"FitxerEntityDao.update - 'entity' can not be null");
		}
		this.getHibernateTemplate().update(entity);
		this.getHibernateTemplate().flush();
	}

	/**
	 * Removes an instance of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} from the persistent store.
	 */
	public void remove (com.soffid.iam.addons.lopd.model.FitxerEntity entity)
	{
		if (entity == null)
		{
			throw new IllegalArgumentException(
				"FitxerEntityDao.remove - 'entity' can not be null");
		}
		this.getHibernateTemplate().delete(entity);
		this.getHibernateTemplate().flush();
	}

	/**
	 * Creates a collection of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} and adds it to the persistent store.
	 */
	public void create (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.FitxerEntity> entities) {
		if (entities == null)
		{
			throw new IllegalArgumentException(
				"FitxerEntityDao.create - 'entities' cannot be null");
		}
		for (com.soffid.iam.addons.lopd.model.FitxerEntity entity: entities) { 
			create(entity);
		}
	}

	/**
	 * Updates a collection of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} in the persistent store.
	 */
	public void update (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.FitxerEntity> entities) {
		if (entities == null)
		{
			throw new IllegalArgumentException(
				"FitxerEntityDao.update - 'entities' cannot be null");
		}
		for (com.soffid.iam.addons.lopd.model.FitxerEntity entity: entities) { 
			update(entity);
		}
	}

	/**
	 * Removes a collection of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} from the persistent store.
	 */
	public void remove (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.FitxerEntity> entities) {
		if (entities == null)
		{
			throw new IllegalArgumentException(
				"FitxerEntityDao.remove - 'entities' cannot be null");
		}
		for (com.soffid.iam.addons.lopd.model.FitxerEntity entity: entities) { 
			remove(entity);
		}
	}

	/**
	 * Removes an instance of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} from the persistent store.
	 */
	public void remove (java.lang.Long id)
	{
		if (id == null) 
		{
			throw new IllegalArgumentException(
				"FitxerEntityDao.remove - 'id' can not be null");
		}
		com.soffid.iam.addons.lopd.model.FitxerEntity entity = this.load(id);
		if (entity != null)
			this.remove(entity);
	}

	/**
	 * Query of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} from the persistent store.
	 * parameter query HQL Query String
	 * parameter parameters HQL Parameters
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> query (String queryString, es.caib.seycon.ng.model.Parameter[] parameters)
	{
		try {
			java.util.List results = new es.caib.seycon.ng.model.QueryBuilder().query(this,
				queryString, parameters);
			return (java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity>) results;
		} catch (org.hibernate.HibernateException ex) {
			throw super.convertHibernateAccessException(ex);
		}
	}

	/**
	 * Query of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} from the persistent store.
	 * parameter query HQL Query String
	 * parameter parameters HQL Parameters
	 * parameter maxResults max number of rows to return
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> query (String queryString, es.caib.seycon.ng.model.Parameter[] parameters, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria)
	{
		try {
			java.util.List results = new es.caib.seycon.ng.model.QueryBuilder().query(this,
				queryString, parameters, criteria.getMaximumResultSize());
			return (java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity>) results;
		} catch (org.hibernate.HibernateException ex) {
			throw super.convertHibernateAccessException(ex);
		}
	}

}
