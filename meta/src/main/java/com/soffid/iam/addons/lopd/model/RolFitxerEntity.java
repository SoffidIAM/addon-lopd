//
// (C) 2013 Soffid
// 
// This file is licensed by Soffid under GPL v3 license
//

package com.soffid.iam.addons.lopd.model;
import com.soffid.mda.annotation.*;

@Entity (table="SCL_ROLFIT" )
@Depends ({com.soffid.iam.addons.lopd.model.FitxerEntity.class,
	es.caib.seycon.ng.model.RolEntity.class,
	es.caib.seycon.ng.model.AuditoriaEntity.class,
	com.soffid.iam.addons.lopd.common.RolFitxer.class,
	es.caib.seycon.ng.model.DispatcherEntity.class})
public abstract class RolFitxerEntity {

	@Column (name="RLF_ID")
	@Identifier
	public java.lang.Long id;

	@Column (name="RLF_IDFIT")
	public com.soffid.iam.addons.lopd.model.FitxerEntity fitxer;

	@Column (name="RLF_IDROL")
	public es.caib.seycon.ng.model.RolEntity rol;

	@DaoFinder("from com.soffid.iam.addons.lopd.model.RolFitxerEntity rolFitxer where rolFitxer.fitxer.id = :idFitxer and rolFitxer.rol.nom = :nomRol")
	public com.soffid.iam.addons.lopd.model.RolFitxerEntity findByIdFitxerAndNomRol(
		java.lang.Long idFitxer, 
		java.lang.String nomRol) {
	 return null;
	}
	@DaoFinder("select rolFitxer.rol from com.soffid.iam.addons.lopd.model.RolFitxerEntity rolFitxer where rolFitxer.fitxer.id = :idFitxer")
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> findRolsByIdFitxer(
		java.lang.Long idFitxer) {
	 return null;
	}
	@DaoFinder("select rolFitxer.fitxer from com.soffid.iam.addons.lopd.model.RolFitxerEntity rolFitxer where rolFitxer.rol.nom = :nomRol")
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> findFitxersByNomRol(
		java.lang.String nomRol) {
	 return null;
	}
	@DaoFinder("select rolFitxer from com.soffid.iam.addons.lopd.model.RolFitxerEntity rolFitxer where rolFitxer.fitxer.id = :idFitxer")
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> findByIdFitxer(
		java.lang.Long idFitxer) {
	 return null;
	}
	@DaoFinder
	public java.util.List<com.soffid.iam.addons.lopd.model.RolFitxerEntity> find(
		@Nullable java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters) {
	 return null;
	}
}
