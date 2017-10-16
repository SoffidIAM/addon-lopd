//
// (C) 2013 Soffid
// 
// This file is licensed by Soffid under GPL v3 license
//

package com.soffid.iam.addons.lopd.model;
import com.soffid.mda.annotation.*;

@Entity (table="SCL_FITXER" )
@Depends ({com.soffid.iam.addons.lopd.common.Fitxer.class,
	es.caib.seycon.ng.model.UsuariEntity.class,
	es.caib.seycon.ng.model.GrupEntity.class,
	es.caib.seycon.ng.model.AuditoriaEntity.class,
	com.soffid.iam.addons.lopd.model.RolFitxerEntity.class,
	com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity.class,
	com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity.class})
public abstract class FitxerEntity {

	@Column (name="FIT_ID")
	@Identifier
	public java.lang.Long id;

	@Column (name="FIT_NOM")
	public java.lang.String nom;

	@Column (name="FIT_FIN")
	@Nullable
	public java.lang.String finalitat;

	@Column (name="FIT_NIVEL")
	@Nullable
	public java.lang.String nivell;

	@Column (name="FIT_SIST")
	@Nullable
	public java.lang.String sistema;

	@Column (name="FIT_REGAPD")
	public java.lang.String registratAPD;

	@Column (name="FIT_NOMAPD")
	@Nullable
	public java.lang.String nomRegistreAPD;

	@Column (name="FIT_DATAPD")
	@Nullable
	public java.util.Date dataRegistreAPD;

	@Column (name="FIT_DISLEG")
	@Nullable
	public java.lang.String disposicioLegal;

	@Column (name="FIT_DCARID")
	@Nullable
	public java.lang.String dadesIdentificatives;

	@Column (name="FIT_DCARPE")
	@Nullable
	public java.lang.String dadesPersonals;

	@Column (name="FIT_DCIRSO")
	@Nullable
	public java.lang.String dadesSocials;

	@Column (name="FIT_DACPRO")
	@Nullable
	public java.lang.String dadesAcademiquesProfessionals;

	@Column (name="FIT_DEMPLE")
	@Nullable
	public java.lang.String dadesLaborals;

	@Column (name="FIT_DINCOR")
	@Nullable
	public java.lang.String dadesComercials;

	@Column (name="FIT_DECFIN")
	@Nullable
	public java.lang.String dadesFinanceres;

	@Column (name="FIT_DTRANS")
	@Nullable
	public java.lang.String dadesTransaccionals;

	@Column (name="FIT_DCOMIN")
	@Nullable
	public java.lang.String dadesInfraccions;

	@Column (name="FIT_CODAPD")
	@Nullable
	public java.lang.String codiRegistreAPD;

	@Column (name="FIT_OBS")
	@Nullable
	public java.lang.String observacions;

	@Column (name="FIT_MOTBAI")
	@Nullable
	public java.lang.String motiuBaixa;

	@Column (name="FIT_DATBAI")
	@Nullable
	public java.util.Date dataBaixa;

	@Column (name="FIT_IDRESP")
	public es.caib.seycon.ng.model.UsuariEntity responsable;

	@Column (name="FIT_IDDG")
	@Nullable
	public es.caib.seycon.ng.model.GrupEntity direccioGeneral;

	@ForeignKey (foreignColumn="RLF_IDFIT")
	public java.util.Collection<com.soffid.iam.addons.lopd.model.RolFitxerEntity> rolFitxers;

	@Column (name="FIT_IDRSTEC")
	public es.caib.seycon.ng.model.UsuariEntity responsableSeguretatTecnic;

	@ForeignKey (foreignColumn="ASO_IDFIT")
	public java.util.Collection<com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity> administradorSeguretatOrganitzatiuUsuariFromFitxer;

	@ForeignKey (foreignColumn="RES_IDFIT")
	public java.util.Collection<com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity> responsableSeguretatOrganitzatiuUsuariFromFitxer;

	@DaoFinder
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> findByFiltre(
		com.soffid.iam.addons.lopd.common.FitxerSearchCriteria filtre) {
	 return null;
	}
	@DaoFinder
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> findByNom(
		java.lang.String nom) {
	 return null;
	}
	@DaoFinder("select fitxerEntity from com.soffid.iam.addons.lopd.model.FitxerEntity fitxerEntity\nleft join fitxerEntity.direccioGeneral as direccioGeneralEntity\nleft join direccioGeneralEntity.pare as conselleriaEntity\nleft join fitxerEntity.responsable as responsableEntity\nwhere  \n(:dataMax = :nullDate or fitxerEntity.dataRegistreAPD < :dataMax ) and\n(:dataMin = :nullDate or fitxerEntity.dataRegistreAPD > :dataMin ) and\n(:id is null or fitxerEntity.id like :id) and\n(:nom is null or fitxerEntity.nom like :nom) and\n(:nivell is null or fitxerEntity.nivell like :nivell) and\n(:conselleria is null or conselleriaEntity.codi like :conselleria) and\n(:dg is null or direccioGeneralEntity.codi like :dg) and\n(:responsable is null or responsableEntity.codi like :responsable)")
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> findFitxersByFiltre(
		java.lang.Long id, 
		java.lang.String nom, 
		java.lang.String responsable, 
		java.lang.String conselleria, 
		java.lang.String dg, 
		java.lang.String nivell, 
		java.util.Date nullDate, 
		java.util.Date dataMax, 
		java.util.Date dataMin) {
	 return null;
	}
	@DaoFinder
	public com.soffid.iam.addons.lopd.model.FitxerEntity findById(
		java.lang.Long id) {
	 return null;
	}
	@DaoFinder("select fitxerEntity from com.soffid.iam.addons.lopd.model.FitxerEntity fitxerEntity\nleft join fitxerEntity.direccioGeneral as direccioGeneralEntity\nleft join direccioGeneralEntity.pare as conselleriaEntity\nleft join fitxerEntity.responsable as responsableEntity\nwhere\n(:id is null or fitxerEntity.id like :id) and\n(:nom is null or fitxerEntity.nom like :nom) and\n(:nivell is null or fitxerEntity.nivell like :nivell) and\n(:conselleria is null or conselleriaEntity.codi like :conselleria) and\n(:dg is null or direccioGeneralEntity.codi like :dg) and\n(:responsable is null or responsableEntity.codi like :responsable)")
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> findFitxersByFiltre(
		java.lang.Long id, 
		java.lang.String nom, 
		java.lang.String responsable, 
		java.lang.String conselleria, 
		java.lang.String dg, 
		java.lang.String nivell) {
	 return null;
	}
	@DaoFinder
	public java.util.List<com.soffid.iam.addons.lopd.model.FitxerEntity> find(
		@Nullable java.util.Collection<es.caib.seycon.ng.model.Parameter> parameters) {
	 return null;
	}
	@DaoFinder("select fitxerEntity \nfrom com.soffid.iam.addons.lopd.model.FitxerEntity fitxerEntity \nleft join fitxerEntity.direccioGeneral direccioGeneral \nwhere \n(fitxerEntity.nom = :nom) and \n(\n    (direccioGeneral is null and :direccioGeneral is null) \n     or \n    (direccioGeneral is not null and direccioGeneral.codi =       :direccioGeneral) \n)")
	public com.soffid.iam.addons.lopd.model.FitxerEntity findByNomAndDireccioGeneral(
		java.lang.String nom, 
		java.lang.String direccioGeneral) {
	 return null;
	}
}
