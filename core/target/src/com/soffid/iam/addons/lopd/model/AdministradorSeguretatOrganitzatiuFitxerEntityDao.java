//
// (C) 2013 Soffid
//
//

package com.soffid.iam.addons.lopd.model;
/**
 * DAO for Entity AdministradorSeguretatOrganitzatiuFitxerEntity
 */
public interface AdministradorSeguretatOrganitzatiuFitxerEntityDao
{
	/**
	 * Operation findById

	 * @param id 
	 * @return 
	 */
	public com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity findById(
		java.lang.Long id)  ;

	/**
	 * CriteriaSearchConfiguration finder
	 */
	public com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity findById(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long id)
	;
	/**
	 * Operation findByCodiUsuariAndIdFitxer

	 * @param codiUsuari 
	 * @param idFitxer 
	 * @return 
	 */
	public com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity findByCodiUsuariAndIdFitxer(
		java.lang.String codiUsuari, 
		java.lang.Long idFitxer)  ;

	/**
	 * CriteriaSearchConfiguration finder
	 */
	public com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity findByCodiUsuariAndIdFitxer(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.String codiUsuari, java.lang.Long idFitxer)
	;
	/**
	 * Operation findByIdFitxer

	 * @param idFitxer 
	 * @return 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> findByIdFitxer(
		java.lang.Long idFitxer)  ;

	/**
	 * CriteriaSearchConfiguration finder
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> findByIdFitxer(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long idFitxer)
	;
	/**
	 * Operation find

	 * @param parameters 
	 * @return 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> find(
		java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters)  ;

	/**
	 * CriteriaSearchConfiguration finder
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> find(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters)
	;
	/**
	 *  Copy data to {@link com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer} object 
	 */
	public void toAdministradorSeguretatOrganitzatiuFitxer(com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity source, com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer target) ;

	/**
	 *  Transforms to {@link com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer} object 
	 */
	public com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer toAdministradorSeguretatOrganitzatiuFitxer(com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity entity) ;

	/**
	 *  Transforms to {@link com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer} list 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer> toAdministradorSeguretatOrganitzatiuFitxerList (java.util.Collection<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> entities) ;

	/**
	 *  Copy data from {@link com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer} object 
	 */
	public void administradorSeguretatOrganitzatiuFitxerToEntity (com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer source, com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity target, boolean copyIfNull) ;

	/**
	 *  Transforms from {@link com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer} object 
	 */
	public com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity administradorSeguretatOrganitzatiuFitxerToEntity (com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer instance) ;

	/**
	 *  Transforms from {@link com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer} list 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity>  administradorSeguretatOrganitzatiuFitxerToEntityList (java.util.Collection<com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer> instances) ;

	/**
	 * Creates an instance of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} .
	 */
	public com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity newAdministradorSeguretatOrganitzatiuFitxerEntity();

	/**
	 * Adds an instance of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} andto the persistent store.
	 */
	public void create (com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity entity);

	/**
	 * Updates an instance of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} at the persistent store.
	 */
	public void update (com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity entity);

	/**
	 * Removes an instance of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 */
	public void remove (com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity entity);

	/**
	 * Loads an instance of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 */
	public com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity load(java.lang.Long id);

	/**
	 * Loads all instances of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> loadAll();

	/**
	 * Creates a collection of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} and adds it to the persistent store.
	 */
	public void create (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> entities);

	/**
	 * Updates a collection of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} in the persistent store.
	 */
	public void update (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> entities);

	/**
	 * Removes a collection of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 */
	public void remove (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> entities);

	/**
	 * Removes an instance of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 */
	public void remove (java.lang.Long id);

	/**
	 * Query of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 * parameter query HQL Query String
	 * parameter parameters HQL Parameters
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> query (String query, es.caib.seycon.ng.model.Parameter[] parameters);

	/**
	 * Query of {@link com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity} from the persistent store.
	 * parameter query HQL Query String
	 * parameter parameters HQL Parameters
	 * parameter maxResults max number of rows to return
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> query (String query, es.caib.seycon.ng.model.Parameter[] parameters, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria);

}
