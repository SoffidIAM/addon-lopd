//
// (C) 2013 Soffid
//
//

package com.soffid.iam.addons.lopd.model;
/**
 * DAO Base for Entity RolFitxerEntity
 */
public abstract class RolFitxerEntityDaoBase
	extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
	implements com.soffid.iam.addons.lopd.model.RolFitxerEntityDao
{
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

	es.caib.seycon.ng.model.RolEntityDao rolEntityDao;

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

	es.caib.seycon.ng.model.DispatcherEntityDao dispatcherEntityDao;

	/**
	 * Sets reference to <code>dispatcherEntityDao</code>.
	 */
	public void setDispatcherEntityDao (es.caib.seycon.ng.model.DispatcherEntityDao dispatcherEntityDao) {
		this.dispatcherEntityDao = dispatcherEntityDao;
	}

	/**
	 * Gets reference to <code>dispatcherEntityDao</code>.
	 */
	public es.caib.seycon.ng.model.DispatcherEntityDao getDispatcherEntityDao () {
		return dispatcherEntityDao;
	}


	/**
	 * Operation findByIdFitxerAndNomRol

	 * @param idFitxer 
	 * @param nomRol 
	 * @return 
	 */
	public com.soffid.iam.addons.lopd.model.RolFitxerEntity findByIdFitxerAndNomRol(
		java.lang.Long idFitxer, 
		java.lang.String nomRol) 
	{
		return findByIdFitxerAndNomRol((com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration) null			, idFitxer, nomRol);
	}
	/**
	 * CriteriaSearchConfiguration implementation
	 */
	public com.soffid.iam.addons.lopd.model.RolFitxerEntity findByIdFitxerAndNomRol(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long idFitxer, java.lang.String nomRol)
	
	{
		return findByIdFitxerAndNomRol("from com.soffid.iam.addons.lopd.model.RolFitxerEntity rolFitxer where rolFitxer.fitxer.id = :idFitxer and rolFitxer.rol.nom = :nomRol",
			criteria, idFitxer, nomRol);
	}
	/**
	 * Internal implementation
	 */
	public com.soffid.iam.addons.lopd.model.RolFitxerEntity findByIdFitxerAndNomRol(final java.lang.String queryString, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long idFitxer, java.lang.String nomRol)
	
	{
		try
		{
			org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("idFitxer", idFitxer);
			queryObject.setParameter("nomRol", nomRol);
			if (criteria != null && criteria.getMaximumResultSize () != null) {
				queryObject.setMaxResults (criteria.getMaximumResultSize ().intValue()); 
			}
			java.util.Set results = new java.util.LinkedHashSet(queryObject.list());
			com.soffid.iam.addons.lopd.model.RolFitxerEntity result = null;
			if (results.size() > 1) {
				throw new org.springframework.dao.InvalidDataAccessResourceUsageException(
					"More than one instance of 'com.soffid.iam.addons.lopd.model.RolFitxerEntity' was found when executing query --> '" + queryString + "'");
			}
			else if (results.size() == 1)
			{
				result = (com.soffid.iam.addons.lopd.model.RolFitxerEntity) results.iterator().next();
			}
			return result;
		}
		catch (org.hibernate.HibernateException ex) 
		{
			throw super.convertHibernateAccessException(ex);
		}
	}
	/**
	 * Operation findRolsByIdFitxer

	 * @param idFitxer 
	 * @return 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> findRolsByIdFitxer(
		java.lang.Long idFitxer) 
	{
		return findRolsByIdFitxer((com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration) null			, idFitxer);
	}
	/**
	 * CriteriaSearchConfiguration implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> findRolsByIdFitxer(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long idFitxer)
	
	{
		return findRolsByIdFitxer("select rolFitxer.rol from com.soffid.iam.addons.lopd.model.RolFitxerEntity rolFitxer where rolFitxer.fitxer.id = :idFitxer",
			criteria, idFitxer);
	}
	/**
	 * Internal implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> findRolsByIdFitxer(final java.lang.String queryString, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long idFitxer)
	
	{
		try
		{
			org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("idFitxer", idFitxer);
			if (criteria != null && criteria.getMaximumResultSize () != null) {
				queryObject.setMaxResults (criteria.getMaximumResultSize ().intValue()); 
			}
			java.util.List results = queryObject.list();
			return (java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity>) results;
		}
		catch (org.hibernate.HibernateException ex) 
		{
			throw super.convertHibernateAccessException(ex);
		}
	}
	/**
	 * Operation findFitxersByNomRol

	 * @param nomRol 
	 * @return 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> findFitxersByNomRol(
		java.lang.String nomRol) 
	{
		return findFitxersByNomRol((com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration) null			, nomRol);
	}
	/**
	 * CriteriaSearchConfiguration implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> findFitxersByNomRol(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.String nomRol)
	
	{
		return findFitxersByNomRol("select rolFitxer.fitxer from com.soffid.iam.addons.lopd.model.RolFitxerEntity rolFitxer where rolFitxer.rol.nom = :nomRol",
			criteria, nomRol);
	}
	/**
	 * Internal implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> findFitxersByNomRol(final java.lang.String queryString, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.String nomRol)
	
	{
		try
		{
			org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("nomRol", nomRol);
			if (criteria != null && criteria.getMaximumResultSize () != null) {
				queryObject.setMaxResults (criteria.getMaximumResultSize ().intValue()); 
			}
			java.util.List results = queryObject.list();
			return (java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity>) results;
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
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> findByIdFitxer(
		java.lang.Long idFitxer) 
	{
		return findByIdFitxer((com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration) null			, idFitxer);
	}
	/**
	 * CriteriaSearchConfiguration implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> findByIdFitxer(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long idFitxer)
	
	{
		return findByIdFitxer("select rolFitxer from com.soffid.iam.addons.lopd.model.RolFitxerEntity rolFitxer where rolFitxer.fitxer.id = :idFitxer",
			criteria, idFitxer);
	}
	/**
	 * Internal implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> findByIdFitxer(final java.lang.String queryString, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long idFitxer)
	
	{
		try
		{
			org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("idFitxer", idFitxer);
			if (criteria != null && criteria.getMaximumResultSize () != null) {
				queryObject.setMaxResults (criteria.getMaximumResultSize ().intValue()); 
			}
			java.util.List results = queryObject.list();
			return (java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity>) results;
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
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> find(
		java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters) 
	{
		return find((com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration) null			, parameters);
	}
	/**
	 * CriteriaSearchConfiguration implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> find(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters)
	
	{
		return find("from com.soffid.iam.addons.lopd.model.RolFitxerEntity where parameters=:parameters",
			criteria, parameters);
	}
	/**
	 * Internal implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> find(final java.lang.String queryString, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters)
	
	{
		try
		{
			org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("parameters", parameters);
			if (criteria != null && criteria.getMaximumResultSize () != null) {
				queryObject.setMaxResults (criteria.getMaximumResultSize ().intValue()); 
			}
			java.util.List results = queryObject.list();
			return (java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity>) results;
		}
		catch (org.hibernate.HibernateException ex) 
		{
			throw super.convertHibernateAccessException(ex);
		}
	}
	/**
	 *  Copy data to {@link com.soffid.iam.addons.lopd.common.RolFitxer} object 
	 */
	public void toRolFitxer(com.soffid.iam.addons.lopd.model.RolFitxerEntity source, com.soffid.iam.addons.lopd.common.RolFitxer target) {
		// Attributes for RolFitxer
		// Missing attribute codiAplicacioRol on entity
		// Missing attribute codiBaseDeDades on entity
		target.setId(source.getId());
		// Missing attribute idFitxer on entity
		// Missing attribute nomRol on entity
	}

	/**
	 *  Transforms to {@link com.soffid.iam.addons.lopd.common.RolFitxer} object 
	 */
	public com.soffid.iam.addons.lopd.common.RolFitxer toRolFitxer(com.soffid.iam.addons.lopd.model.RolFitxerEntity entity) {
		final com.soffid.iam.addons.lopd.common.RolFitxer target = new com.soffid.iam.addons.lopd.common.RolFitxer();
		this.toRolFitxer(entity, target);
		return target;
	}

	/**
	 *  Transforms to {@link com.soffid.iam.addons.lopd.common.RolFitxer} list 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.common.RolFitxer> toRolFitxerList (java.util.Collection<com.soffid.iam.addons.lopd.model.RolFitxerEntity> instances) {
		if (instances == null)
			return null;
		else {
			java.util.LinkedList<com.soffid.iam.addons.lopd.common.RolFitxer> list =
				new java.util.LinkedList<com.soffid.iam.addons.lopd.common.RolFitxer>();
			for (final com.soffid.iam.addons.lopd.model.RolFitxerEntity instance: instances)
			{
				list.add( toRolFitxer(instance));
			}
			return list;
		}
	}
	/**
	 *  Copy data from {@link com.soffid.iam.addons.lopd.common.RolFitxer} object 
	 */
	public void rolFitxerToEntity (com.soffid.iam.addons.lopd.common.RolFitxer source, com.soffid.iam.addons.lopd.model.RolFitxerEntity target, boolean copyIfNull) {
		// Attributes for RolFitxerEntity
		// Missing attribute fitxer on entity
		// Missing attribute rol on entity
	}

	/**
	 *  Transforms from {@link com.soffid.iam.addons.lopd.common.RolFitxer} object 
	 */
	public com.soffid.iam.addons.lopd.model.RolFitxerEntity rolFitxerToEntity (com.soffid.iam.addons.lopd.common.RolFitxer instance) {
		com.soffid.iam.addons.lopd.model.RolFitxerEntity entity;
		if (instance.getId() == null) 
			entity = newRolFitxerEntity();
		else
			entity = load(instance.getId());
		rolFitxerToEntity(instance, entity, true);
		return entity;
	}

	/**
	 *  Transforms from {@link com.soffid.iam.addons.lopd.common.RolFitxer} list 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity>  rolFitxerToEntityList (java.util.Collection<com.soffid.iam.addons.lopd.common.RolFitxer> instances) 
	{
		if (instances == null)
			return null;
		java.util.LinkedList<com.soffid.iam.addons.lopd.model.RolFitxerEntity> list =
			new java.util.LinkedList<com.soffid.iam.addons.lopd.model.RolFitxerEntity>();
		for (com.soffid.iam.addons.lopd.common.RolFitxer instance: instances)
		{
			list.add (rolFitxerToEntity(instance));
		}
		return list;
	}

	/**
	 * Creates an instance of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} .
	 */
	public com.soffid.iam.addons.lopd.model.RolFitxerEntity newRolFitxerEntity()
	{
		return new com.soffid.iam.addons.lopd.model.RolFitxerEntityImpl();
	}

	/**
	 * Loads an instance of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} from the persistent store.
	 */
	public com.soffid.iam.addons.lopd.model.RolFitxerEntity load(java.lang.Long id) {
		if (id == null) {
			throw new IllegalArgumentException("id cannot be null");
		}
		return (com.soffid.iam.addons.lopd.model.RolFitxerEntity) this.getHibernateTemplate().get(com.soffid.iam.addons.lopd.model.RolFitxerEntityImpl.class, id);
	}
	/**
	 * Loads all instances of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} from the persistent store.
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> loadAll() {
		return (java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity>)
			this.getHibernateTemplate().loadAll(com.soffid.iam.addons.lopd.model.RolFitxerEntityImpl.class);
	};

	/**
	 * Adds an instance of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} andto the persistent store.
	 */
	public void create (com.soffid.iam.addons.lopd.model.RolFitxerEntity entity)
	{
		if (entity == null)
		{
			throw new IllegalArgumentException(
				"RolFitxerEntityDao.create - 'entity' can not be null");
		}
		this.getHibernateTemplate().save(entity);
		this.getHibernateTemplate().flush();
	}

	/**
	 * Updates an instance of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} at the persistent store.
	 */
	public void update (com.soffid.iam.addons.lopd.model.RolFitxerEntity entity)
	{
		if (entity == null)
		{
			throw new IllegalArgumentException(
				"RolFitxerEntityDao.update - 'entity' can not be null");
		}
		this.getHibernateTemplate().update(entity);
		this.getHibernateTemplate().flush();
	}

	/**
	 * Removes an instance of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} from the persistent store.
	 */
	public void remove (com.soffid.iam.addons.lopd.model.RolFitxerEntity entity)
	{
		if (entity == null)
		{
			throw new IllegalArgumentException(
				"RolFitxerEntityDao.remove - 'entity' can not be null");
		}
		this.getHibernateTemplate().delete(entity);
		this.getHibernateTemplate().flush();
	}

	/**
	 * Creates a collection of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} and adds it to the persistent store.
	 */
	public void create (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.RolFitxerEntity> entities) {
		if (entities == null)
		{
			throw new IllegalArgumentException(
				"RolFitxerEntityDao.create - 'entities' cannot be null");
		}
		for (com.soffid.iam.addons.lopd.model.RolFitxerEntity entity: entities) { 
			create(entity);
		}
	}

	/**
	 * Updates a collection of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} in the persistent store.
	 */
	public void update (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.RolFitxerEntity> entities) {
		if (entities == null)
		{
			throw new IllegalArgumentException(
				"RolFitxerEntityDao.update - 'entities' cannot be null");
		}
		for (com.soffid.iam.addons.lopd.model.RolFitxerEntity entity: entities) { 
			update(entity);
		}
	}

	/**
	 * Removes a collection of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} from the persistent store.
	 */
	public void remove (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.RolFitxerEntity> entities) {
		if (entities == null)
		{
			throw new IllegalArgumentException(
				"RolFitxerEntityDao.remove - 'entities' cannot be null");
		}
		for (com.soffid.iam.addons.lopd.model.RolFitxerEntity entity: entities) { 
			remove(entity);
		}
	}

	/**
	 * Removes an instance of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} from the persistent store.
	 */
	public void remove (java.lang.Long id)
	{
		if (id == null) 
		{
			throw new IllegalArgumentException(
				"RolFitxerEntityDao.remove - 'id' can not be null");
		}
		com.soffid.iam.addons.lopd.model.RolFitxerEntity entity = this.load(id);
		if (entity != null)
			this.remove(entity);
	}

	/**
	 * Query of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} from the persistent store.
	 * parameter query HQL Query String
	 * parameter parameters HQL Parameters
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> query (String queryString, es.caib.seycon.ng.model.Parameter[] parameters)
	{
		try {
			java.util.List results = new es.caib.seycon.ng.model.QueryBuilder().query(this,
				queryString, parameters);
			return (java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity>) results;
		} catch (org.hibernate.HibernateException ex) {
			throw super.convertHibernateAccessException(ex);
		}
	}

	/**
	 * Query of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} from the persistent store.
	 * parameter query HQL Query String
	 * parameter parameters HQL Parameters
	 * parameter maxResults max number of rows to return
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> query (String queryString, es.caib.seycon.ng.model.Parameter[] parameters, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria)
	{
		try {
			java.util.List results = new es.caib.seycon.ng.model.QueryBuilder().query(this,
				queryString, parameters, criteria.getMaximumResultSize());
			return (java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity>) results;
		} catch (org.hibernate.HibernateException ex) {
			throw super.convertHibernateAccessException(ex);
		}
	}

}
