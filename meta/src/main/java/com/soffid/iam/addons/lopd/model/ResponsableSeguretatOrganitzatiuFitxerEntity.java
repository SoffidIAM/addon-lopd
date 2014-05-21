//
// (C) 2013 Soffid
// 
// This file is licensed by Soffid under GPL v3 license
//

package com.soffid.iam.addons.lopd.model;
import com.soffid.mda.annotation.*;

@Entity (table="SCL_RSOFIT" )
@Depends ({com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer.class,
	com.soffid.iam.addons.lopd.model.FitxerEntity.class,
	es.caib.seycon.ng.model.UsuariEntity.class,
	es.caib.seycon.ng.model.UsuariGrupEntity.class,
	es.caib.seycon.ng.model.AuditoriaEntity.class})
public abstract class ResponsableSeguretatOrganitzatiuFitxerEntity {

	@Column (name="RES_IDFIT")
	public com.soffid.iam.addons.lopd.model.FitxerEntity fitxer;

	@Column (name="RES_IDUSU")
	public es.caib.seycon.ng.model.UsuariEntity responsableSeguretatOrganitzatiu;

	@Column (name="RES_ID")
	@Identifier
	public java.lang.Long id;

	@DaoFinder
	public com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity findById(
		java.lang.Long id) {
	 return null;
	}
	@DaoFinder("from com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity responsableFitxer where  responsableFitxer.fitxer.id = :idFitxer and responsableFitxer.responsableSeguretatOrganitzatiu.codi = :codiUsuari")
	public com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity findByCodiUsuariAndIdFitxer(
		java.lang.String codiUsuari, 
		java.lang.Long idFitxer) {
	 return null;
	}
	@DaoFinder("select responsableSeguretat\nfrom com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity responsableSeguretat where responsableSeguretat.fitxer.id = :idFitxer")
	public java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> findByIdFitxer(
		java.lang.Long idFitxer) {
	 return null;
	}
	@DaoFinder
	public java.util.List<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> find(
		@Nullable java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters) {
	 return null;
	}
}
