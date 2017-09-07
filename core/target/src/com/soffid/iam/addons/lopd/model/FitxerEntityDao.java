//
// (C) 2013 Soffid
//
//

package com.soffid.iam.addons.lopd.model;
/**
 * DAO for Entity FitxerEntity
 */
public interface FitxerEntityDao
{
	/**
	 * Operation findByFiltre

	 * @param filtre 
	 * @return 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> findByFiltre(
		com.soffid.iam.addons.lopd.common.FitxerSearchCriteria filtre)  ;

	/**
	 * Operation findByNom

	 * @param nom 
	 * @return 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> findByNom(
		java.lang.String nom)  ;

	/**
	 * CriteriaSearchConfiguration finder
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> findByNom(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.String nom)
	;
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
		java.util.Date dataMin)  ;

	/**
	 * CriteriaSearchConfiguration finder
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> findFitxersByFiltre(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long id, java.lang.String nom, java.lang.String responsable, java.lang.String conselleria, java.lang.String dg, java.lang.String nivell, java.util.Date nullDate, java.util.Date dataMax, java.util.Date dataMin)
	;
	/**
	 * Operation findById

	 * @param id 
	 * @return 
	 */
	public com.soffid.iam.addons.lopd.model.FitxerEntity findById(
		java.lang.Long id)  ;

	/**
	 * CriteriaSearchConfiguration finder
	 */
	public com.soffid.iam.addons.lopd.model.FitxerEntity findById(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long id)
	;
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
		java.lang.String nivell)  ;

	/**
	 * CriteriaSearchConfiguration finder
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> findFitxersByFiltre(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.Long id, java.lang.String nom, java.lang.String responsable, java.lang.String conselleria, java.lang.String dg, java.lang.String nivell)
	;
	/**
	 * Operation find

	 * @param parameters 
	 * @return 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> find(
		java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters)  ;

	/**
	 * CriteriaSearchConfiguration finder
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> find(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters)
	;
	/**
	 * Operation findByNomAndDireccioGeneral

	 * @param nom 
	 * @param direccioGeneral 
	 * @return 
	 */
	public com.soffid.iam.addons.lopd.model.FitxerEntity findByNomAndDireccioGeneral(
		java.lang.String nom, 
		java.lang.String direccioGeneral)  ;

	/**
	 * CriteriaSearchConfiguration finder
	 */
	public com.soffid.iam.addons.lopd.model.FitxerEntity findByNomAndDireccioGeneral(final com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria, java.lang.String nom, java.lang.String direccioGeneral)
	;
	/**
	 *  Copy data to {@link com.soffid.iam.addons.lopd.common.Fitxer} object 
	 */
	public void toFitxer(com.soffid.iam.addons.lopd.model.FitxerEntity source, com.soffid.iam.addons.lopd.common.Fitxer target) ;

	/**
	 *  Transforms to {@link com.soffid.iam.addons.lopd.common.Fitxer} object 
	 */
	public com.soffid.iam.addons.lopd.common.Fitxer toFitxer(com.soffid.iam.addons.lopd.model.FitxerEntity entity) ;

	/**
	 *  Transforms to {@link com.soffid.iam.addons.lopd.common.Fitxer} list 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.common.Fitxer> toFitxerList (java.util.Collection<com.soffid.iam.addons.lopd.model.FitxerEntity> entities) ;

	/**
	 *  Copy data from {@link com.soffid.iam.addons.lopd.common.Fitxer} object 
	 */
	public void fitxerToEntity (com.soffid.iam.addons.lopd.common.Fitxer source, com.soffid.iam.addons.lopd.model.FitxerEntity target, boolean copyIfNull) ;

	/**
	 *  Transforms from {@link com.soffid.iam.addons.lopd.common.Fitxer} object 
	 */
	public com.soffid.iam.addons.lopd.model.FitxerEntity fitxerToEntity (com.soffid.iam.addons.lopd.common.Fitxer instance) ;

	/**
	 *  Transforms from {@link com.soffid.iam.addons.lopd.common.Fitxer} list 
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity>  fitxerToEntityList (java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> instances) ;

	/**
	 * Creates an instance of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} .
	 */
	public com.soffid.iam.addons.lopd.model.FitxerEntity newFitxerEntity();

	/**
	 * Adds an instance of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} andto the persistent store.
	 */
	public void create (com.soffid.iam.addons.lopd.model.FitxerEntity entity);

	/**
	 * Updates an instance of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} at the persistent store.
	 */
	public void update (com.soffid.iam.addons.lopd.model.FitxerEntity entity);

	/**
	 * Removes an instance of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} from the persistent store.
	 */
	public void remove (com.soffid.iam.addons.lopd.model.FitxerEntity entity);

	/**
	 * Loads an instance of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} from the persistent store.
	 */
	public com.soffid.iam.addons.lopd.model.FitxerEntity load(java.lang.Long id);

	/**
	 * Loads all instances of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} from the persistent store.
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> loadAll();

	/**
	 * Creates a collection of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} and adds it to the persistent store.
	 */
	public void create (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.FitxerEntity> entities);

	/**
	 * Updates a collection of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} in the persistent store.
	 */
	public void update (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.FitxerEntity> entities);

	/**
	 * Removes a collection of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} from the persistent store.
	 */
	public void remove (java.util.Collection<? extends com.soffid.iam.addons.lopd.model.FitxerEntity> entities);

	/**
	 * Removes an instance of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} from the persistent store.
	 */
	public void remove (java.lang.Long id);

	/**
	 * Query of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} from the persistent store.
	 * parameter query HQL Query String
	 * parameter parameters HQL Parameters
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> query (String query, es.caib.seycon.ng.model.Parameter[] parameters);

	/**
	 * Query of {@link com.soffid.iam.addons.lopd.model.FitxerEntity} from the persistent store.
	 * parameter query HQL Query String
	 * parameter parameters HQL Parameters
	 * parameter maxResults max number of rows to return
	 */
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> query (String query, es.caib.seycon.ng.model.Parameter[] parameters, com.soffid.iam.addons.lopd.model.criteria.CriteriaSearchConfiguration criteria);

}
