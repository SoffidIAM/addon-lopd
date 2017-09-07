//
// (C) 2013 Soffid
//
//

package com.soffid.iam.addons.lopd.model;
/**
 * DAO Base for Entity ResponsableSeguretatOrganitzatiuFitxerEntity
 */
public abstract class ResponsableSeguretatOrganitzatiuFitxerEntityDaoBase
	extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
	implements com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntityDao
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
	public com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity findById(
		java.lang.Long id) 
	{
		return findById((com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration) null			, id);
	}
	/**
	 * CriteriaSearchConfiguration implementation
	 */
	public com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity findById(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long id)
	
	{
		return findById("from com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity where id=:id",
			criteria, id);
	}
	/**
	 * Internal implementation
	 */
	public com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity findById(final java.lang.String queryString, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long id)
	
	{
		try
		{
			org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("id", id);
			if (criteria != null && criteria.getMaximumResultSize () != null) {
				queryObject.setMaxResults (criteria.getMaximumResultSize ().intValue()); 
			}
			java.util.Set results = new java.util.LinkedHashSet(queryObject.list());
			com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity result = null;
			if (results.size() > 1) {
				throw new org.springframework.dao.InvalidDataAccessResourceUsageException(
					"More than one instance of 'com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity' was found when executing query --> '" + queryString + "'");
			}
			else if (results.size() == 1)
			{
				result = (com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity) results.iterator().next();
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
	public com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity findByCodiUsuariAndIdFitxer(
		java.lang.String codiUsuari, 
		java.lang.Long idFitxer) 
	{
		return findByCodiUsuariAndIdFitxer((com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration) null			, codiUsuari, idFitxer);
	}
	/**
	 * CriteriaSearchConfiguration implementation
	 */
	public com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity findByCodiUsuariAndIdFitxer(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.String codiUsuari, java.lang.Long idFitxer)
	
	{
		return findByCodiUsuariAndIdFitxer("from com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity responsableFitxer where  responsableFitxer.fitxer.id = :idFitxer and responsableFitxer.responsableSeguretatOrganitzatiu.codi = :codiUsuari",
			criteria, codiUsuari, idFitxer);
	}
	/**
	 * Internal implementation
	 */
	public com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity findByCodiUsuariAndIdFitxer(final java.lang.String queryString, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.String codiUsuari, java.lang.Long idFitxer)
	
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
			com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity result = null;
			if (results.size() > 1) {
				throw new org.springframework.dao.InvalidDataAccessResourceUsageException(
					"More than one instance of 'com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity' was found when executing query --> '" + queryString + "'");
			}
			else if (results.size() == 1)
			{
				result = (com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity) results.iterator().next();
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
	public java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> findByIdFitxer(
		java.lang.Long idFitxer) 
	{
		return findByIdFitxer((com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration) null			, idFitxer);
	}
	/**
	 * CriteriaSearchConfiguration implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> findByIdFitxer(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long idFitxer)
	
	{
		return findByIdFitxer("select responsableSeguretat\nfrom com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity responsableSeguretat where responsableSeguretat.fitxer.id = :idFitxer",
			criteria, idFitxer);
	}
	/**
	 * Internal implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> findByIdFitxer(final java.lang.String queryString, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long idFitxer)
	
	{
		try
		{
			org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("idFitxer", idFitxer);
			if (criteria != null && criteria.getMaximumResultSize () != null) {
				queryObject.setMaxResults (criteria.getMaximumResultSize ().intValue()); 
			}
			java.util.List results = queryObject.list();
			return (java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity>) results;
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
	public java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> find(
		java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters) 
	{
		return find((com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration) null			, parameters);
	}
	/**
	 * CriteriaSearchConfiguration implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> find(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters)
	
	{
		return find("from com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity where parameters=:parameters",
			criteria, parameters);
	}
	/**
	 * Internal implementation
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> find(final java.lang.String queryString, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters)
	
	{
		try
		{
			org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
			queryObject.setParameter("parameters", parameters);
			if (criteria != null && criteria.getMaximumResultSize () != null) {
				queryObject.setMaxResults (criteria.getMaximumResultSize ().intValue()); 
			}
			java.util.List results = queryObject.list();
			return (java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity>) results;
		}
		catch (org.hibernate.HibernateException ex) 
		{
			throw super.convertHibernateAccessException(ex);
		}
	}
	/**
	 *  Copy data to {@link com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer} object 
	 */
	public void toResponsableSeguretatOrganitzatiuFitxer(com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity source, com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer target) {
		// Attributes for ResponsableSeguretatOrganitzatiuFitxer
		// Missing attribute idFitxer on entity
		// Missing attribute codiUsuari on entity
		// Missing attribute nomFitxer on entity
		// Missing attribute nomComplertUsuari on entity
		target.setId(source.getId());
		// Missing attribute direccioGeneralFitxer on entity
	}

	/**
	 *  Transforms to {@link com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer} object 
	 */
	public com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer toResponsableSeguretatOrganitzatiuFitxer(com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity entity) {
		final com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer target = new com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer();
		this.toResponsableSeguretatOrganitzatiuFitxer(entity, target);
		return target;
	}

	/**
	 *  Transforms to {@link com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer} list 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer> toResponsableSeguretatOrganitzatiuFitxerList (java.util.Collection<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> instances) {
		if (instances == null)
			return null;
		else {
			java.util.LinkedList<com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer> list =
				new java.util.LinkedList<com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer>();
			for (final com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity instance: instances)
			{
				list.add( toResponsableSeguretatOrganitzatiuFitxer(instance));
			}
			return list;
		}
	}
	/**
	 *  Copy data from {@link com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer} object 
	 */
	public void responsableSeguretatOrganitzatiuFitxerToEntity (com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer source, com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity target, boolean copyIfNull) {
		// Attributes for ResponsableSeguretatOrganitzatiuFitxerEntity
		// Missing attribute fitxer on entity
		// Missing attribute responsableSeguretatOrganitzatiu on entity
	}

	/**
	 *  Transforms from {@link com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer} object 
	 */
	public com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity responsableSeguretatOrganitzatiuFitxerToEntity (com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer instance) {
		com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity entity;
		if (instance.getId() == null) 
			entity = newResponsableSeguretatOrganitzatiuFitxerEntity();
		else
			entity = load(instance.getId());
		responsableSeguretatOrganitzatiuFitxerToEntity(instance, entity, true);
		return entity;
	}

	/**
	 *  Transforms from {@link com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer} list 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity>  responsableSeguretatOrganitzatiuFitxerToEntityList (java.util.Collection<com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer> instances) 
	{
		if (instances == null)
			return null;
		java.util.LinkedList<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> list =
			new java.util.LinkedList<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity>();
		for (com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer instance: instances)
		{
			list.add (responsableSeguretatOrganitzatiuFitxerToEntity(instance));
		}
		return list;
	}

	/**
	 * Creates an instance of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} .
	 */
	public com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity newResponsableSeguretatOrganitzatiuFitxerEntity()
	{
		return new com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntityImpl();
	}

	/**
	 * Loads an instance of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 */
	public com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity load(java.lang.Long id) {
		if (id == null) {
			throw new IllegalArgumentException("id cannot be null");
		}
		return (com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity) this.getHibernateTemplate().get(com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntityImpl.class, id);
	}
	/**
	 * Loads all instances of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> loadAll() {
		return (java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity>)
			this.getHibernateTemplate().loadAll(com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntityImpl.class);
	};

	/**
	 * Adds an instance of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} andto the persistent store.
	 */
	public void create (com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity entity)
	{
		if (entity == null)
		{
			throw new IllegalArgumentException(
				"ResponsableSeguretatOrganitzatiuFitxerEntityDao.create - 'entity' can not be null");
		}
		this.getHibernateTemplate().save(entity);
		this.getHibernateTemplate().flush();
	}

	/**
	 * Updates an instance of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} at the persistent store.
	 */
	public void update (com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity entity)
	{
		if (entity == null)
		{
			throw new IllegalArgumentException(
				"ResponsableSeguretatOrganitzatiuFitxerEntityDao.update - 'entity' can not be null");
		}
		this.getHibernateTemplate().update(entity);
		this.getHibernateTemplate().flush();
	}

	/**
	 * Removes an instance of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 */
	public void remove (com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity entity)
	{
		if (entity == null)
		{
			throw new IllegalArgumentException(
				"ResponsableSeguretatOrganitzatiuFitxerEntityDao.remove - 'entity' can not be null");
		}
		this.getHibernateTemplate().delete(entity);
		this.getHibernateTemplate().flush();
	}

	/**
	 * Creates a collection of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} and adds it to the persistent store.
	 */
	public void create (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> entities) {
		if (entities == null)
		{
			throw new IllegalArgumentException(
				"ResponsableSeguretatOrganitzatiuFitxerEntityDao.create - 'entities' cannot be null");
		}
		for (com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity entity: entities) { 
			create(entity);
		}
	}

	/**
	 * Updates a collection of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} in the persistent store.
	 */
	public void update (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> entities) {
		if (entities == null)
		{
			throw new IllegalArgumentException(
				"ResponsableSeguretatOrganitzatiuFitxerEntityDao.update - 'entities' cannot be null");
		}
		for (com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity entity: entities) { 
			update(entity);
		}
	}

	/**
	 * Removes a collection of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 */
	public void remove (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> entities) {
		if (entities == null)
		{
			throw new IllegalArgumentException(
				"ResponsableSeguretatOrganitzatiuFitxerEntityDao.remove - 'entities' cannot be null");
		}
		for (com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity entity: entities) { 
			remove(entity);
		}
	}

	/**
	 * Removes an instance of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 */
	public void remove (java.lang.Long id)
	{
		if (id == null) 
		{
			throw new IllegalArgumentException(
				"ResponsableSeguretatOrganitzatiuFitxerEntityDao.remove - 'id' can not be null");
		}
		com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity entity = this.load(id);
		if (entity != null)
			this.remove(entity);
	}

	/**
	 * Query of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 * parameter query HQL Query String
	 * parameter parameters HQL Parameters
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> query (String queryString, es.caib.seycon.ng.model.Parameter[] parameters)
	{
		try {
			java.util.List results = new es.caib.seycon.ng.model.QueryBuilder().query(this,
				queryString, parameters);
			return (java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity>) results;
		} catch (org.hibernate.HibernateException ex) {
			throw super.convertHibernateAccessException(ex);
		}
	}

	/**
	 * Query of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 * parameter query HQL Query String
	 * parameter parameters HQL Parameters
	 * parameter maxResults max number of rows to return
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> query (String queryString, es.caib.seycon.ng.model.Parameter[] parameters, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria)
	{
		try {
			java.util.List results = new es.caib.seycon.ng.model.QueryBuilder().query(this,
				queryString, parameters, criteria.getMaximumResultSize());
			return (java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity>) results;
		} catch (org.hibernate.HibernateException ex) {
			throw super.convertHibernateAccessException(ex);
		}
	}

}
