//
// (C) 2013 Soffid
// 
// This file is licensed by Soffid under GPL v3 license
//

package com.soffid.iam.addons.lopd.model;
import com.soffid.mda.annotation.*;

@Entity (table="SCL_ASOFIT" )
@Depends ({com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer.class,
	es.caib.seycon.ng.model.UsuariEntity.class,
	com.soffid.iam.addons.lopd.model.FitxerEntity.class,
	es.caib.seycon.ng.model.UsuariGrupEntity.class,
	es.caib.seycon.ng.model.AuditoriaEntity.class})
public abstract class AdministradorSeguretatOrganitzatiuFitxerEntity {

	@Column (name="ASO_IDFIT")
	public com.soffid.iam.addons.lopd.model.FitxerEntity fitxer;

	@Column (name="ASO_IDUSU")
	public es.caib.seycon.ng.model.UsuariEntity administradorDeSeguretatOrganitzatiu;

	@Column (name="ASO_ID")
	@Identifier
	public java.lang.Long id;

	@DaoFinder
	public com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity findById(
		java.lang.Long id) {
	 return null;
	}
	@DaoFinder("from com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity administradorFitxer where administradorFitxer.fitxer.id = :idFitxer and administradorFitxer.administradorDeSeguretatOrganitzatiu.codi = :codiUsuari")
	public com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity findByCodiUsuariAndIdFitxer(
		java.lang.String codiUsuari, 
		java.lang.Long idFitxer) {
	 return null;
	}
	@DaoFinder("select administradorSeguretat\nfrom com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity administradorSeguretat where administradorSeguretat.fitxer.id = :idFitxer")
	public java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> findByIdFitxer(
		java.lang.Long idFitxer) {
	 return null;
	}
	@DaoFinder
	public java.util.List<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> find(
		@Nullable java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters) {
	 return null;
	}
}
