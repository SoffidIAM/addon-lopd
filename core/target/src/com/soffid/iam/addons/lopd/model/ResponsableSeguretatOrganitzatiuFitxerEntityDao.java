//
// (C) 2013 Soffid
//
//

package com.soffid.iam.addons.lopd.model;
/**
 * DAO for Entity ResponsableSeguretatOrganitzatiuFitxerEntity
 */
public interface ResponsableSeguretatOrganitzatiuFitxerEntityDao
{
	/**
	 * Operation findById

	 * @param id 
	 * @return 
	 */
	public com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity findById(
		java.lang.Long id)  ;

	/**
	 * CriteriaSearchConfiguration finder
	 */
	public com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity findById(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long id)
	;
	/**
	 * Operation findByCodiUsuariAndIdFitxer

	 * @param codiUsuari 
	 * @param idFitxer 
	 * @return 
	 */
	public com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity findByCodiUsuariAndIdFitxer(
		java.lang.String codiUsuari, 
		java.lang.Long idFitxer)  ;

	/**
	 * CriteriaSearchConfiguration finder
	 */
	public com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity findByCodiUsuariAndIdFitxer(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.String codiUsuari, java.lang.Long idFitxer)
	;
	/**
	 * Operation findByIdFitxer

	 * @param idFitxer 
	 * @return 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> findByIdFitxer(
		java.lang.Long idFitxer)  ;

	/**
	 * CriteriaSearchConfiguration finder
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> findByIdFitxer(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long idFitxer)
	;
	/**
	 * Operation find

	 * @param parameters 
	 * @return 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> find(
		java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters)  ;

	/**
	 * CriteriaSearchConfiguration finder
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> find(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters)
	;
	/**
	 *  Copy data to {@link com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer} object 
	 */
	public void toResponsableSeguretatOrganitzatiuFitxer(com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity source, com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer target) ;

	/**
	 *  Transforms to {@link com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer} object 
	 */
	public com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer toResponsableSeguretatOrganitzatiuFitxer(com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity entity) ;

	/**
	 *  Transforms to {@link com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer} list 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer> toResponsableSeguretatOrganitzatiuFitxerList (java.util.Collection<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> entities) ;

	/**
	 *  Copy data from {@link com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer} object 
	 */
	public void responsableSeguretatOrganitzatiuFitxerToEntity (com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer source, com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity target, boolean copyIfNull) ;

	/**
	 *  Transforms from {@link com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer} object 
	 */
	public com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity responsableSeguretatOrganitzatiuFitxerToEntity (com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer instance) ;

	/**
	 *  Transforms from {@link com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer} list 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity>  responsableSeguretatOrganitzatiuFitxerToEntityList (java.util.Collection<com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer> instances) ;

	/**
	 * Creates an instance of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} .
	 */
	public com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity newResponsableSeguretatOrganitzatiuFitxerEntity();

	/**
	 * Adds an instance of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} andto the persistent store.
	 */
	public void create (com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity entity);

	/**
	 * Updates an instance of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} at the persistent store.
	 */
	public void update (com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity entity);

	/**
	 * Removes an instance of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 */
	public void remove (com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity entity);

	/**
	 * Loads an instance of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 */
	public com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity load(java.lang.Long id);

	/**
	 * Loads all instances of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> loadAll();

	/**
	 * Creates a collection of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} and adds it to the persistent store.
	 */
	public void create (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> entities);

	/**
	 * Updates a collection of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} in the persistent store.
	 */
	public void update (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> entities);

	/**
	 * Removes a collection of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 */
	public void remove (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> entities);

	/**
	 * Removes an instance of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 */
	public void remove (java.lang.Long id);

	/**
	 * Query of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 * parameter query HQL Query String
	 * parameter parameters HQL Parameters
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> query (String query, es.caib.seycon.ng.model.Parameter[] parameters);

	/**
	 * Query of {@link com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 * parameter query HQL Query String
	 * parameter parameters HQL Parameters
	 * parameter maxResults max number of rows to return
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> query (String query, es.caib.seycon.ng.model.Parameter[] parameters, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria);

}
