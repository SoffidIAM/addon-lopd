//
// (C) 2013 Soffid
//
//

package com.soffid.iam.addons.lopd.model;
/**
 * DAO for Entity RolFitxerEntity
 */
public interface RolFitxerEntityDao
{
	/**
	 * Operation findByIdFitxerAndNomRol

	 * @param idFitxer 
	 * @param nomRol 
	 * @return 
	 */
	public com.soffid.iam.addons.lopd.model.RolFitxerEntity findByIdFitxerAndNomRol(
		java.lang.Long idFitxer, 
		java.lang.String nomRol)  ;

	/**
	 * CriteriaSearchConfiguration finder
	 */
	public com.soffid.iam.addons.lopd.model.RolFitxerEntity findByIdFitxerAndNomRol(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long idFitxer, java.lang.String nomRol)
	;
	/**
	 * Operation findRolsByIdFitxer

	 * @param idFitxer 
	 * @return 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> findRolsByIdFitxer(
		java.lang.Long idFitxer)  ;

	/**
	 * CriteriaSearchConfiguration finder
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> findRolsByIdFitxer(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long idFitxer)
	;
	/**
	 * Operation findFitxersByNomRol

	 * @param nomRol 
	 * @return 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> findFitxersByNomRol(
		java.lang.String nomRol)  ;

	/**
	 * CriteriaSearchConfiguration finder
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> findFitxersByNomRol(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.String nomRol)
	;
	/**
	 * Operation findByIdFitxer

	 * @param idFitxer 
	 * @return 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> findByIdFitxer(
		java.lang.Long idFitxer)  ;

	/**
	 * CriteriaSearchConfiguration finder
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> findByIdFitxer(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long idFitxer)
	;
	/**
	 * Operation find

	 * @param parameters 
	 * @return 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> find(
		java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters)  ;

	/**
	 * CriteriaSearchConfiguration finder
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> find(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters)
	;
	/**
	 *  Copy data to {@link com.soffid.iam.addons.lopd.common.RolFitxer} object 
	 */
	public void toRolFitxer(com.soffid.iam.addons.lopd.model.RolFitxerEntity source, com.soffid.iam.addons.lopd.common.RolFitxer target) ;

	/**
	 *  Transforms to {@link com.soffid.iam.addons.lopd.common.RolFitxer} object 
	 */
	public com.soffid.iam.addons.lopd.common.RolFitxer toRolFitxer(com.soffid.iam.addons.lopd.model.RolFitxerEntity entity) ;

	/**
	 *  Transforms to {@link com.soffid.iam.addons.lopd.common.RolFitxer} list 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.common.RolFitxer> toRolFitxerList (java.util.Collection<com.soffid.iam.addons.lopd.model.RolFitxerEntity> entities) ;

	/**
	 *  Copy data from {@link com.soffid.iam.addons.lopd.common.RolFitxer} object 
	 */
	public void rolFitxerToEntity (com.soffid.iam.addons.lopd.common.RolFitxer source, com.soffid.iam.addons.lopd.model.RolFitxerEntity target, boolean copyIfNull) ;

	/**
	 *  Transforms from {@link com.soffid.iam.addons.lopd.common.RolFitxer} object 
	 */
	public com.soffid.iam.addons.lopd.model.RolFitxerEntity rolFitxerToEntity (com.soffid.iam.addons.lopd.common.RolFitxer instance) ;

	/**
	 *  Transforms from {@link com.soffid.iam.addons.lopd.common.RolFitxer} list 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity>  rolFitxerToEntityList (java.util.Collection<com.soffid.iam.addons.lopd.common.RolFitxer> instances) ;

	/**
	 * Creates an instance of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} .
	 */
	public com.soffid.iam.addons.lopd.model.RolFitxerEntity newRolFitxerEntity();

	/**
	 * Adds an instance of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} andto the persistent store.
	 */
	public void create (com.soffid.iam.addons.lopd.model.RolFitxerEntity entity);

	/**
	 * Updates an instance of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} at the persistent store.
	 */
	public void update (com.soffid.iam.addons.lopd.model.RolFitxerEntity entity);

	/**
	 * Removes an instance of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} from the persistent store.
	 */
	public void remove (com.soffid.iam.addons.lopd.model.RolFitxerEntity entity);

	/**
	 * Loads an instance of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} from the persistent store.
	 */
	public com.soffid.iam.addons.lopd.model.RolFitxerEntity load(java.lang.Long id);

	/**
	 * Loads all instances of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} from the persistent store.
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> loadAll();

	/**
	 * Creates a collection of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} and adds it to the persistent store.
	 */
	public void create (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.RolFitxerEntity> entities);

	/**
	 * Updates a collection of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} in the persistent store.
	 */
	public void update (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.RolFitxerEntity> entities);

	/**
	 * Removes a collection of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} from the persistent store.
	 */
	public void remove (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.RolFitxerEntity> entities);

	/**
	 * Removes an instance of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} from the persistent store.
	 */
	public void remove (java.lang.Long id);

	/**
	 * Query of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} from the persistent store.
	 * parameter query HQL Query String
	 * parameter parameters HQL Parameters
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> query (String query, es.caib.seycon.ng.model.Parameter[] parameters);

	/**
	 * Query of {@link com.soffid.iam.addons.lopd.model.RolFitxerEntity} from the persistent store.
	 * parameter query HQL Query String
	 * parameter parameters HQL Parameters
	 * parameter maxResults max number of rows to return
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> query (String query, es.caib.seycon.ng.model.Parameter[] parameters, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria);

}
