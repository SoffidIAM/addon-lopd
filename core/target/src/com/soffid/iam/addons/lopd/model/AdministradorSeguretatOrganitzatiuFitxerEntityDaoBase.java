//
// (C) 2013 Soffid
//
//

package com.soffid.iam.addons.lopd.model;
/**
 * DAO Base for Entity AdministradorSeguretatOrganitzatiuFitxerEntity
 */
public abstract class AdministradorSeguretatOrganitzatiuFitxerEntityDaoBase
	extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
	implements com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntityDao
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

	com.soffid.iam.addons.lopd.model.FitxerEntityDao fitxerEntityDao;

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

	es.caib.seycon.ng.model.UsuariGrupEntityDao usuariGrupEntityDao;

	/**
	 * Sets reference to <code>usuariGrupEntityDao</code>.
	 */
	public void setUsuariGrupEntityDao (es.caib.seycon.ng.model.UsuariGrupEntityDao usuariGrupEntityDao) {
		this.usuariGrupEntityDao = usuariGrupEntityDao;
	}

	/**
	 * Gets reference to <code>usuariGrupEntityDao</code>.
	 */
	public es.caib.seycon.ng.model.UsuariGrupEntityDao getUsuariGrupEntityDao () {
		return usuariGrupEntityDao;
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


	/**
	 * Operation findById

	 * @param id 
	 * @return 
	 */
	public com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity findById(
		java.lang.Long id) 
	{
		return findById((com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration) null			, id);
	}
	/**
	 * CriteriaSearchConfiguration implementation
	 */
	public com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity findById(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long id)
	
	{
		return findById("from com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity where id=:id",
			criteria, id);
	}
	/**
	 * Internal implementation
	 */
	public com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity findById(final java.lang.String queryString, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long id)
	
	{
		try
		{
			org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("id", id);
			if (criteria != null && criteria.getMaximumResultSize () != null) {
				queryObject.setMaxResults (criteria.getMaximumResultSize ().intValue()); 
			}
			java.util.Set results = new java.util.LinkedHashSet(queryObject.list());
			com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity result = null;
			if (results.size() > 1) {
				throw new org.springframework.dao.InvalidDataAccessResourceUsageException(
					"More than one instance of 'com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity' was found when executing query --> '" + queryString + "'");
			}
			else if (results.size() == 1)
			{
				result = (com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity) results.iterator().next();
			}
			return result;
		}
		catch (org.hibernate.HibernateException ex) 
		{
			throw super.convertHibernateAccessException(ex);
		}
	}
	/**
	 * Operation findByCodiUsuariAndIdFitxer

	 * @param codiUsuari 
	 * @param idFitxer 
	 * @return 
	 */
	public com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity findByCodiUsuariAndIdFitxer(
		java.lang.String codiUsuari, 
		java.lang.Long idFitxer) 
	{
		return findByCodiUsuariAndIdFitxer((com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration) null			, codiUsuari, idFitxer);
	}
	/**
	 * CriteriaSearchConfiguration implementation
	 */
	public com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity findByCodiUsuariAndIdFitxer(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.String codiUsuari, java.lang.Long idFitxer)
	
	{
		return findByCodiUsuariAndIdFitxer("from com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity administradorFitxer where administradorFitxer.fitxer.id = :idFitxer and administradorFitxer.administradorDeSeguretatOrganitzatiu.codi = :codiUsuari",
			criteria, codiUsuari, idFitxer);
	}
	/**
	 * Internal implementation
	 */
	public com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity findByCodiUsuariAndIdFitxer(final java.lang.String queryString, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.String codiUsuari, java.lang.Long idFitxer)
	
	{
		try
		{
			org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("codiUsuari", codiUsuari);
			queryObject.setParameter("idFitxer", idFitxer);
			if (criteria != null && criteria.getMaximumResultSize () != null) {
				queryObject.setMaxResults (criteria.getMaximumResultSize ().intValue()); 
			}
			java.util.Set results = new java.util.LinkedHashSet(queryObject.list());
			com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity result = null;
			if (results.size() > 1) {
				throw new org.springframework.dao.InvalidDataAccessResourceUsageException(
					"More than one instance of 'com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity' was found when executing query --> '" + queryString + "'");
			}
			else if (results.size() == 1)
			{
				result = (com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity) results.iterator().next();
			}
			return result;
		}
		catch (org.hibernate.HibernateException ex) 
		{
			throw super.convertHibernateAccessException(ex);
		}
	}
	/**
	 * Operation findByIdFitxer

	 * @param idFitxer 
	 * @return 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> findByIdFitxer(
		java.lang.Long idFitxer) 
	{
		return findByIdFitxer((com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration) null			, idFitxer);
	}
	/**
	 * CriteriaSearchConfiguration implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> findByIdFitxer(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long idFitxer)
	
	{
		return findByIdFitxer("select administradorSeguretat\nfrom com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity administradorSeguretat where administradorSeguretat.fitxer.id = :idFitxer",
			criteria, idFitxer);
	}
	/**
	 * Internal implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> findByIdFitxer(final java.lang.String queryString, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long idFitxer)
	
	{
		try
		{
			org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("idFitxer", idFitxer);
			if (criteria != null && criteria.getMaximumResultSize () != null) {
				queryObject.setMaxResults (criteria.getMaximumResultSize ().intValue()); 
			}
			java.util.List results = queryObject.list();
			return (java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity>) results;
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
	public java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> find(
		java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters) 
	{
		return find((com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration) null			, parameters);
	}
	/**
	 * CriteriaSearchConfiguration implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> find(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters)
	
	{
		return find("from com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity where parameters=:parameters",
			criteria, parameters);
	}
	/**
	 * Internal implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> find(final java.lang.String queryString, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters)
	
	{
		try
		{
			org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("parameters", parameters);
			if (criteria != null && criteria.getMaximumResultSize () != null) {
				queryObject.setMaxResults (criteria.getMaximumResultSize ().intValue()); 
			}
			java.util.List results = queryObject.list();
			return (java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity>) results;
		}
		catch (org.hibernate.HibernateException ex) 
		{
			throw super.convertHibernateAccessException(ex);
		}
	}
	/**
	 *  Copy data to {@link com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer} object 
	 */
	public void toAdministradorSeguretatOrganitzatiuFitxer(com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity source, com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer target) {
		// Attributes for AdministradorSeguretatOrganitzatiuFitxer
		// Missing attribute idFitxer on entity
		// Missing attribute codiUsuari on entity
		// Missing attribute nomComplertUsuari on entity
		// Missing attribute nomFitxer on entity
		target.setId(source.getId());
		// Missing attribute direccioGeneralFitxer on entity
	}

	/**
	 *  Transforms to {@link com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer} object 
	 */
	public com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer toAdministradorSeguretatOrganitzatiuFitxer(com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity entity) {
		final com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer target = new com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer();
		this.toAdministradorSeguretatOrganitzatiuFitxer(entity, target);
		return target;
	}

	/**
	 *  Transforms to {@link com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer} list 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer> toAdministradorSeguretatOrganitzatiuFitxerList (java.util.Collection<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> instances) {
		if (instances == null)
			return null;
		else {
			java.util.LinkedList<com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer> list =
				new java.util.LinkedList<com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer>();
			for (final com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity instance: instances)
			{
				list.add( toAdministradorSeguretatOrganitzatiuFitxer(instance));
			}
			return list;
		}
	}
	/**
	 *  Copy data from {@link com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer} object 
	 */
	public void administradorSeguretatOrganitzatiuFitxerToEntity (com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer source, com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity target, boolean copyIfNull) {
		// Attributes for AdministradorSeguretatOrganitzatiuFitxerEntity
		// Missing attribute fitxer on entity
		// Missing attribute administradorDeSeguretatOrganitzatiu on entity
	}

	/**
	 *  Transforms from {@link com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer} object 
	 */
	public com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity administradorSeguretatOrganitzatiuFitxerToEntity (com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer instance) {
		com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity entity;
		if (instance.getId() == null) 
			entity = newAdministradorSeguretatOrganitzatiuFitxerEntity();
		else
			entity = load(instance.getId());
		administradorSeguretatOrganitzatiuFitxerToEntity(instance, entity, true);
		return entity;
	}

	/**
	 *  Transforms from {@link com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer} list 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity>  administradorSeguretatOrganitzatiuFitxerToEntityList (java.util.Collection<com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer> instances) 
	{
		if (instances == null)
			return null;
		java.util.LinkedList<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> list =
			new java.util.LinkedList<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity>();
		for (com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer instance: instances)
		{
			list.add (administradorSeguretatOrganitzatiuFitxerToEntity(instance));
		}
		return list;
	}

	/**
	 * Creates an instance of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} .
	 */
	public com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity newAdministradorSeguretatOrganitzatiuFitxerEntity()
	{
		return new com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntityImpl();
	}

	/**
	 * Loads an instance of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 */
	public com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity load(java.lang.Long id) {
		if (id == null) {
			throw new IllegalArgumentException("id cannot be null");
		}
		return (com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity) this.getHibernateTemplate().get(com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntityImpl.class, id);
	}
	/**
	 * Loads all instances of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> loadAll() {
		return (java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity>)
			this.getHibernateTemplate().loadAll(com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntityImpl.class);
	};

	/**
	 * Adds an instance of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} andto the persistent store.
	 */
	public void create (com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity entity)
	{
		if (entity == null)
		{
			throw new IllegalArgumentException(
				"AdministradorSeguretatOrganitzatiuFitxerEntityDao.create - 'entity' can not be null");
		}
		this.getHibernateTemplate().save(entity);
		this.getHibernateTemplate().flush();
	}

	/**
	 * Updates an instance of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} at the persistent store.
	 */
	public void update (com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity entity)
	{
		if (entity == null)
		{
			throw new IllegalArgumentException(
				"AdministradorSeguretatOrganitzatiuFitxerEntityDao.update - 'entity' can not be null");
		}
		this.getHibernateTemplate().update(entity);
		this.getHibernateTemplate().flush();
	}

	/**
	 * Removes an instance of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 */
	public void remove (com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity entity)
	{
		if (entity == null)
		{
			throw new IllegalArgumentException(
				"AdministradorSeguretatOrganitzatiuFitxerEntityDao.remove - 'entity' can not be null");
		}
		this.getHibernateTemplate().delete(entity);
		this.getHibernateTemplate().flush();
	}

	/**
	 * Creates a collection of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} and adds it to the persistent store.
	 */
	public void create (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> entities) {
		if (entities == null)
		{
			throw new IllegalArgumentException(
				"AdministradorSeguretatOrganitzatiuFitxerEntityDao.create - 'entities' cannot be null");
		}
		for (com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity entity: entities) { 
			create(entity);
		}
	}

	/**
	 * Updates a collection of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} in the persistent store.
	 */
	public void update (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> entities) {
		if (entities == null)
		{
			throw new IllegalArgumentException(
				"AdministradorSeguretatOrganitzatiuFitxerEntityDao.update - 'entities' cannot be null");
		}
		for (com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity entity: entities) { 
			update(entity);
		}
	}

	/**
	 * Removes a collection of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 */
	public void remove (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> entities) {
		if (entities == null)
		{
			throw new IllegalArgumentException(
				"AdministradorSeguretatOrganitzatiuFitxerEntityDao.remove - 'entities' cannot be null");
		}
		for (com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity entity: entities) { 
			remove(entity);
		}
	}

	/**
	 * Removes an instance of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 */
	public void remove (java.lang.Long id)
	{
		if (id == null) 
		{
			throw new IllegalArgumentException(
				"AdministradorSeguretatOrganitzatiuFitxerEntityDao.remove - 'id' can not be null");
		}
		com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity entity = this.load(id);
		if (entity != null)
			this.remove(entity);
	}

	/**
	 * Query of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 * parameter query HQL Query String
	 * parameter parameters HQL Parameters
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> query (String queryString, es.caib.seycon.ng.model.Parameter[] parameters)
	{
		try {
			java.util.List results = new es.caib.seycon.ng.model.QueryBuilder().query(this,
				queryString, parameters);
			return (java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity>) results;
		} catch (org.hibernate.HibernateException ex) {
			throw super.convertHibernateAccessException(ex);
		}
	}

	/**
	 * Query of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 * parameter query HQL Query String
	 * parameter parameters HQL Parameters
	 * parameter maxResults max number of rows to return
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> query (String queryString, es.caib.seycon.ng.model.Parameter[] parameters, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria)
	{
		try {
			java.util.List results = new es.caib.seycon.ng.model.QueryBuilder().query(this,
				queryString, parameters, criteria.getMaximumResultSize());
			return (java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity>) results;
		} catch (org.hibernate.HibernateException ex) {
			throw super.convertHibernateAccessException(ex);
		}
	}

}
