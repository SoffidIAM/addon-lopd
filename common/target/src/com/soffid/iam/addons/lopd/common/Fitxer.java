//
// (C) 2013 Soffid
//
//

package com.soffid.iam.addons.lopd.common;
/**
 * ValueObject Fitxer
 */
public class Fitxer
		implements java.io.Serializable
 {

	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = 1;
	/**
	 * Attribute id

	 */
	private java.lang.Long id;

	/**
	 * Attribute nom

	 */
	private java.lang.String nom;

	/**
	 * Attribute responsable

	 */
	private java.lang.String responsable;

	/**
	 * Attribute finalitat

	 */
	private java.lang.String finalitat;

	/**
	 * Attribute nivell

	 */
	private java.lang.String nivell;

	/**
	 * Attribute sistema

	 */
	private java.lang.String sistema;

	/**
	 * Attribute registratAPD

	 */
	private java.lang.Boolean registratAPD;

	/**
	 * Attribute nomRegistreAPD

	 */
	private java.lang.String nomRegistreAPD;

	/**
	 * Attribute dataRegistre

	 */
	private java.util.Calendar dataRegistre;

	/**
	 * Attribute disposicioLegal

	 */
	private java.lang.String disposicioLegal;

	/**
	 * Attribute dadesIdentificatives

	 */
	private java.lang.String dadesIdentificatives;

	/**
	 * Attribute dadesPersonals

	 */
	private java.lang.String dadesPersonals;

	/**
	 * Attribute dadesSocials

	 */
	private java.lang.String dadesSocials;

	/**
	 * Attribute dadesAcademiquesProfessionals

	 */
	private java.lang.String dadesAcademiquesProfessionals;

	/**
	 * Attribute dadesLaborals

	 */
	private java.lang.String dadesLaborals;

	/**
	 * Attribute dadesComercials

	 */
	private java.lang.String dadesComercials;

	/**
	 * Attribute dadesFinanceres

	 */
	private java.lang.String dadesFinanceres;

	/**
	 * Attribute dadesTransaccionals

	 */
	private java.lang.String dadesTransaccionals;

	/**
	 * Attribute dadesInfraccions

	 */
	private java.lang.String dadesInfraccions;

	/**
	 * Attribute conselleria

	 */
	private java.lang.String conselleria;

	/**
	 * Attribute responsableSeguretatTecnic

	 */
	private java.lang.String responsableSeguretatTecnic;

	/**
	 * Attribute codiRegistreAPD

	 */
	private java.lang.String codiRegistreAPD;

	/**
	 * Attribute observacions

	 */
	private java.lang.String observacions;

	/**
	 * Attribute motiuBaixa

	 */
	private java.lang.String motiuBaixa;

	/**
	 * Attribute dataBaixaAPD

	 */
	private java.util.Calendar dataBaixaAPD;

	/**
	 * Attribute direccioGeneral

	 */
	private java.lang.String direccioGeneral;

	public Fitxer()
	{
	}

	public Fitxer(java.lang.Long id, java.lang.String nom, java.lang.String responsable, java.lang.String finalitat, java.lang.String nivell, java.lang.String sistema, java.lang.Boolean registratAPD, java.lang.String nomRegistreAPD, java.util.Calendar dataRegistre, java.lang.String disposicioLegal, java.lang.String dadesIdentificatives, java.lang.String dadesPersonals, java.lang.String dadesSocials, java.lang.String dadesAcademiquesProfessionals, java.lang.String dadesLaborals, java.lang.String dadesComercials, java.lang.String dadesFinanceres, java.lang.String dadesTransaccionals, java.lang.String dadesInfraccions, java.lang.String conselleria, java.lang.String responsableSeguretatTecnic, java.lang.String codiRegistreAPD, java.lang.String observacions, java.lang.String motiuBaixa, java.util.Calendar dataBaixaAPD, java.lang.String direccioGeneral)
	{
		super();
		this.id = id;
		this.nom = nom;
		this.responsable = responsable;
		this.finalitat = finalitat;
		this.nivell = nivell;
		this.sistema = sistema;
		this.registratAPD = registratAPD;
		this.nomRegistreAPD = nomRegistreAPD;
		this.dataRegistre = dataRegistre;
		this.disposicioLegal = disposicioLegal;
		this.dadesIdentificatives = dadesIdentificatives;
		this.dadesPersonals = dadesPersonals;
		this.dadesSocials = dadesSocials;
		this.dadesAcademiquesProfessionals = dadesAcademiquesProfessionals;
		this.dadesLaborals = dadesLaborals;
		this.dadesComercials = dadesComercials;
		this.dadesFinanceres = dadesFinanceres;
		this.dadesTransaccionals = dadesTransaccionals;
		this.dadesInfraccions = dadesInfraccions;
		this.conselleria = conselleria;
		this.responsableSeguretatTecnic = responsableSeguretatTecnic;
		this.codiRegistreAPD = codiRegistreAPD;
		this.observacions = observacions;
		this.motiuBaixa = motiuBaixa;
		this.dataBaixaAPD = dataBaixaAPD;
		this.direccioGeneral = direccioGeneral;
	}

	public Fitxer(java.lang.String nom, java.lang.String nivell)
	{
		super();
		this.nom = nom;
		this.nivell = nivell;
	}

	public Fitxer(Fitxer otherBean)
	{
		this(otherBean.id, otherBean.nom, otherBean.responsable, otherBean.finalitat, otherBean.nivell, otherBean.sistema, otherBean.registratAPD, otherBean.nomRegistreAPD, otherBean.dataRegistre, otherBean.disposicioLegal, otherBean.dadesIdentificatives, otherBean.dadesPersonals, otherBean.dadesSocials, otherBean.dadesAcademiquesProfessionals, otherBean.dadesLaborals, otherBean.dadesComercials, otherBean.dadesFinanceres, otherBean.dadesTransaccionals, otherBean.dadesInfraccions, otherBean.conselleria, otherBean.responsableSeguretatTecnic, otherBean.codiRegistreAPD, otherBean.observacions, otherBean.motiuBaixa, otherBean.dataBaixaAPD, otherBean.direccioGeneral);
	}

	/**
	 * Gets value for attribute id
	 */
	public java.lang.Long getId() {
		return this.id;
	}

	/**
	 * Sets value for attribute id
	 */
	public void setId(java.lang.Long id) {
		this.id = id;
	}

	/**
	 * Gets value for attribute nom
	 */
	public java.lang.String getNom() {
		return this.nom;
	}

	/**
	 * Sets value for attribute nom
	 */
	public void setNom(java.lang.String nom) {
		this.nom = nom;
	}

	/**
	 * Gets value for attribute responsable
	 */
	public java.lang.String getResponsable() {
		return this.responsable;
	}

	/**
	 * Sets value for attribute responsable
	 */
	public void setResponsable(java.lang.String responsable) {
		this.responsable = responsable;
	}

	/**
	 * Gets value for attribute finalitat
	 */
	public java.lang.String getFinalitat() {
		return this.finalitat;
	}

	/**
	 * Sets value for attribute finalitat
	 */
	public void setFinalitat(java.lang.String finalitat) {
		this.finalitat = finalitat;
	}

	/**
	 * Gets value for attribute nivell
	 */
	public java.lang.String getNivell() {
		return this.nivell;
	}

	/**
	 * Sets value for attribute nivell
	 */
	public void setNivell(java.lang.String nivell) {
		this.nivell = nivell;
	}

	/**
	 * Gets value for attribute sistema
	 */
	public java.lang.String getSistema() {
		return this.sistema;
	}

	/**
	 * Sets value for attribute sistema
	 */
	public void setSistema(java.lang.String sistema) {
		this.sistema = sistema;
	}

	/**
	 * Gets value for attribute registratAPD
	 */
	public java.lang.Boolean getRegistratAPD() {
		return this.registratAPD;
	}

	/**
	 * Sets value for attribute registratAPD
	 */
	public void setRegistratAPD(java.lang.Boolean registratAPD) {
		this.registratAPD = registratAPD;
	}

	/**
	 * Gets value for attribute nomRegistreAPD
	 */
	public java.lang.String getNomRegistreAPD() {
		return this.nomRegistreAPD;
	}

	/**
	 * Sets value for attribute nomRegistreAPD
	 */
	public void setNomRegistreAPD(java.lang.String nomRegistreAPD) {
		this.nomRegistreAPD = nomRegistreAPD;
	}

	/**
	 * Gets value for attribute dataRegistre
	 */
	public java.util.Calendar getDataRegistre() {
		return this.dataRegistre;
	}

	/**
	 * Sets value for attribute dataRegistre
	 */
	public void setDataRegistre(java.util.Calendar dataRegistre) {
		this.dataRegistre = dataRegistre;
	}

	/**
	 * Gets value for attribute disposicioLegal
	 */
	public java.lang.String getDisposicioLegal() {
		return this.disposicioLegal;
	}

	/**
	 * Sets value for attribute disposicioLegal
	 */
	public void setDisposicioLegal(java.lang.String disposicioLegal) {
		this.disposicioLegal = disposicioLegal;
	}

	/**
	 * Gets value for attribute dadesIdentificatives
	 */
	public java.lang.String getDadesIdentificatives() {
		return this.dadesIdentificatives;
	}

	/**
	 * Sets value for attribute dadesIdentificatives
	 */
	public void setDadesIdentificatives(java.lang.String dadesIdentificatives) {
		this.dadesIdentificatives = dadesIdentificatives;
	}

	/**
	 * Gets value for attribute dadesPersonals
	 */
	public java.lang.String getDadesPersonals() {
		return this.dadesPersonals;
	}

	/**
	 * Sets value for attribute dadesPersonals
	 */
	public void setDadesPersonals(java.lang.String dadesPersonals) {
		this.dadesPersonals = dadesPersonals;
	}

	/**
	 * Gets value for attribute dadesSocials
	 */
	public java.lang.String getDadesSocials() {
		return this.dadesSocials;
	}

	/**
	 * Sets value for attribute dadesSocials
	 */
	public void setDadesSocials(java.lang.String dadesSocials) {
		this.dadesSocials = dadesSocials;
	}

	/**
	 * Gets value for attribute dadesAcademiquesProfessionals
	 */
	public java.lang.String getDadesAcademiquesProfessionals() {
		return this.dadesAcademiquesProfessionals;
	}

	/**
	 * Sets value for attribute dadesAcademiquesProfessionals
	 */
	public void setDadesAcademiquesProfessionals(java.lang.String dadesAcademiquesProfessionals) {
		this.dadesAcademiquesProfessionals = dadesAcademiquesProfessionals;
	}

	/**
	 * Gets value for attribute dadesLaborals
	 */
	public java.lang.String getDadesLaborals() {
		return this.dadesLaborals;
	}

	/**
	 * Sets value for attribute dadesLaborals
	 */
	public void setDadesLaborals(java.lang.String dadesLaborals) {
		this.dadesLaborals = dadesLaborals;
	}

	/**
	 * Gets value for attribute dadesComercials
	 */
	public java.lang.String getDadesComercials() {
		return this.dadesComercials;
	}

	/**
	 * Sets value for attribute dadesComercials
	 */
	public void setDadesComercials(java.lang.String dadesComercials) {
		this.dadesComercials = dadesComercials;
	}

	/**
	 * Gets value for attribute dadesFinanceres
	 */
	public java.lang.String getDadesFinanceres() {
		return this.dadesFinanceres;
	}

	/**
	 * Sets value for attribute dadesFinanceres
	 */
	public void setDadesFinanceres(java.lang.String dadesFinanceres) {
		this.dadesFinanceres = dadesFinanceres;
	}

	/**
	 * Gets value for attribute dadesTransaccionals
	 */
	public java.lang.String getDadesTransaccionals() {
		return this.dadesTransaccionals;
	}

	/**
	 * Sets value for attribute dadesTransaccionals
	 */
	public void setDadesTransaccionals(java.lang.String dadesTransaccionals) {
		this.dadesTransaccionals = dadesTransaccionals;
	}

	/**
	 * Gets value for attribute dadesInfraccions
	 */
	public java.lang.String getDadesInfraccions() {
		return this.dadesInfraccions;
	}

	/**
	 * Sets value for attribute dadesInfraccions
	 */
	public void setDadesInfraccions(java.lang.String dadesInfraccions) {
		this.dadesInfraccions = dadesInfraccions;
	}

	/**
	 * Gets value for attribute conselleria
	 */
	public java.lang.String getConselleria() {
		return this.conselleria;
	}

	/**
	 * Sets value for attribute conselleria
	 */
	public void setConselleria(java.lang.String conselleria) {
		this.conselleria = conselleria;
	}

	/**
	 * Gets value for attribute responsableSeguretatTecnic
	 */
	public java.lang.String getResponsableSeguretatTecnic() {
		return this.responsableSeguretatTecnic;
	}

	/**
	 * Sets value for attribute responsableSeguretatTecnic
	 */
	public void setResponsableSeguretatTecnic(java.lang.String responsableSeguretatTecnic) {
		this.responsableSeguretatTecnic = responsableSeguretatTecnic;
	}

	/**
	 * Gets value for attribute codiRegistreAPD
	 */
	public java.lang.String getCodiRegistreAPD() {
		return this.codiRegistreAPD;
	}

	/**
	 * Sets value for attribute codiRegistreAPD
	 */
	public void setCodiRegistreAPD(java.lang.String codiRegistreAPD) {
		this.codiRegistreAPD = codiRegistreAPD;
	}

	/**
	 * Gets value for attribute observacions
	 */
	public java.lang.String getObservacions() {
		return this.observacions;
	}

	/**
	 * Sets value for attribute observacions
	 */
	public void setObservacions(java.lang.String observacions) {
		this.observacions = observacions;
	}

	/**
	 * Gets value for attribute motiuBaixa
	 */
	public java.lang.String getMotiuBaixa() {
		return this.motiuBaixa;
	}

	/**
	 * Sets value for attribute motiuBaixa
	 */
	public void setMotiuBaixa(java.lang.String motiuBaixa) {
		this.motiuBaixa = motiuBaixa;
	}

	/**
	 * Gets value for attribute dataBaixaAPD
	 */
	public java.util.Calendar getDataBaixaAPD() {
		return this.dataBaixaAPD;
	}

	/**
	 * Sets value for attribute dataBaixaAPD
	 */
	public void setDataBaixaAPD(java.util.Calendar dataBaixaAPD) {
		this.dataBaixaAPD = dataBaixaAPD;
	}

	/**
	 * Gets value for attribute direccioGeneral
	 */
	public java.lang.String getDireccioGeneral() {
		return this.direccioGeneral;
	}

	/**
	 * Sets value for attribute direccioGeneral
	 */
	public void setDireccioGeneral(java.lang.String direccioGeneral) {
		this.direccioGeneral = direccioGeneral;
	}

	/**
	 * Returns a string representation of the value object.
	 */
	public String toString()
	{
		StringBuffer b = new StringBuffer();
		b.append (getClass().getName());
		b.append ("[id: ");
		b.append (this.id);
		b.append (", nom: ");
		b.append (this.nom);
		b.append (", responsable: ");
		b.append (this.responsable);
		b.append (", finalitat: ");
		b.append (this.finalitat);
		b.append (", nivell: ");
		b.append (this.nivell);
		b.append (", sistema: ");
		b.append (this.sistema);
		b.append (", registratAPD: ");
		b.append (this.registratAPD);
		b.append (", nomRegistreAPD: ");
		b.append (this.nomRegistreAPD);
		b.append (", dataRegistre: ");
		b.append (this.dataRegistre);
		b.append (", disposicioLegal: ");
		b.append (this.disposicioLegal);
		b.append (", dadesIdentificatives: ");
		b.append (this.dadesIdentificatives);
		b.append (", dadesPersonals: ");
		b.append (this.dadesPersonals);
		b.append (", dadesSocials: ");
		b.append (this.dadesSocials);
		b.append (", dadesAcademiquesProfessionals: ");
		b.append (this.dadesAcademiquesProfessionals);
		b.append (", dadesLaborals: ");
		b.append (this.dadesLaborals);
		b.append (", dadesComercials: ");
		b.append (this.dadesComercials);
		b.append (", dadesFinanceres: ");
		b.append (this.dadesFinanceres);
		b.append (", dadesTransaccionals: ");
		b.append (this.dadesTransaccionals);
		b.append (", dadesInfraccions: ");
		b.append (this.dadesInfraccions);
		b.append (", conselleria: ");
		b.append (this.conselleria);
		b.append (", responsableSeguretatTecnic: ");
		b.append (this.responsableSeguretatTecnic);
		b.append (", codiRegistreAPD: ");
		b.append (this.codiRegistreAPD);
		b.append (", observacions: ");
		b.append (this.observacions);
		b.append (", motiuBaixa: ");
		b.append (this.motiuBaixa);
		b.append (", dataBaixaAPD: ");
		b.append (this.dataBaixaAPD);
		b.append (", direccioGeneral: ");
		b.append (this.direccioGeneral);
		b.append ("]");
		return b.toString();
	}

}
