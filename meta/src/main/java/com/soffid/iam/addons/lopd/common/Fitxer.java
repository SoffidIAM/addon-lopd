//
// (C) 2013 Soffid
// 
// This file is licensed by Soffid under GPL v3 license
//

package com.soffid.iam.addons.lopd.common;
import com.soffid.mda.annotation.*;

@ValueObject 
public abstract class Fitxer {

	@Nullable
	public java.lang.Long id;

	public java.lang.String nom;

	@Nullable
	public java.lang.String responsable;

	@Nullable
	public java.lang.String finalitat;

	public java.lang.String nivell;

	@Nullable
	public java.lang.String sistema;

	@Nullable
	public java.lang.Boolean registratAPD;

	@Nullable
	public java.lang.String nomRegistreAPD;

	@Nullable
	public java.util.Calendar dataRegistre;

	@Nullable
	public java.lang.String disposicioLegal;

	@Nullable
	public java.lang.String dadesIdentificatives;

	@Nullable
	public java.lang.String dadesPersonals;

	@Nullable
	public java.lang.String dadesSocials;

	@Nullable
	public java.lang.String dadesAcademiquesProfessionals;

	@Nullable
	public java.lang.String dadesLaborals;

	@Nullable
	public java.lang.String dadesComercials;

	@Nullable
	public java.lang.String dadesFinanceres;

	@Nullable
	public java.lang.String dadesTransaccionals;

	@Nullable
	public java.lang.String dadesInfraccions;

	@Nullable
	public java.lang.String conselleria;

	@Nullable
	public java.lang.String responsableSeguretatTecnic;

	@Nullable
	public java.lang.String codiRegistreAPD;

	@Nullable
	public java.lang.String observacions;

	@Nullable
	public java.lang.String motiuBaixa;

	@Nullable
	public java.util.Calendar dataBaixaAPD;

	@Nullable
	public java.lang.String direccioGeneral;

}
