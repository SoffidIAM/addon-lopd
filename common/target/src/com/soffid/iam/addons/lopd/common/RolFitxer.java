//
// (C) 2013 Soffid
//
//

package com.soffid.iam.addons.lopd.common;
/**
 * ValueObject RolFitxer
 */
public class RolFitxer
		implements java.io.Serializable
 {

	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = 1;
	/**
	 * Attribute codiAplicacioRol

	 */
	private java.lang.String codiAplicacioRol;

	/**
	 * Attribute codiBaseDeDades

	 */
	private java.lang.String codiBaseDeDades;

	/**
	 * Attribute id

	 */
	private java.lang.Long id;

	/**
	 * Attribute idFitxer

	 */
	private java.lang.Long idFitxer;

	/**
	 * Attribute nomRol

	 */
	private java.lang.String nomRol;

	public RolFitxer()
	{
	}

	public RolFitxer(java.lang.String codiAplicacioRol, java.lang.String codiBaseDeDades, java.lang.Long id, java.lang.Long idFitxer, java.lang.String nomRol)
	{
		super();
		this.codiAplicacioRol = codiAplicacioRol;
		this.codiBaseDeDades = codiBaseDeDades;
		this.id = id;
		this.idFitxer = idFitxer;
		this.nomRol = nomRol;
	}

	public RolFitxer(java.lang.String codiAplicacioRol, java.lang.String codiBaseDeDades, java.lang.Long idFitxer, java.lang.String nomRol)
	{
		super();
		this.codiAplicacioRol = codiAplicacioRol;
		this.codiBaseDeDades = codiBaseDeDades;
		this.idFitxer = idFitxer;
		this.nomRol = nomRol;
	}

	public RolFitxer(RolFitxer otherBean)
	{
		this(otherBean.codiAplicacioRol, otherBean.codiBaseDeDades, otherBean.id, otherBean.idFitxer, otherBean.nomRol);
	}

	/**
	 * Gets value for attribute codiAplicacioRol
	 */
	public java.lang.String getCodiAplicacioRol() {
		return this.codiAplicacioRol;
	}

	/**
	 * Sets value for attribute codiAplicacioRol
	 */
	public void setCodiAplicacioRol(java.lang.String codiAplicacioRol) {
		this.codiAplicacioRol = codiAplicacioRol;
	}

	/**
	 * Gets value for attribute codiBaseDeDades
	 */
	public java.lang.String getCodiBaseDeDades() {
		return this.codiBaseDeDades;
	}

	/**
	 * Sets value for attribute codiBaseDeDades
	 */
	public void setCodiBaseDeDades(java.lang.String codiBaseDeDades) {
		this.codiBaseDeDades = codiBaseDeDades;
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
	 * Gets value for attribute idFitxer
	 */
	public java.lang.Long getIdFitxer() {
		return this.idFitxer;
	}

	/**
	 * Sets value for attribute idFitxer
	 */
	public void setIdFitxer(java.lang.Long idFitxer) {
		this.idFitxer = idFitxer;
	}

	/**
	 * Gets value for attribute nomRol
	 */
	public java.lang.String getNomRol() {
		return this.nomRol;
	}

	/**
	 * Sets value for attribute nomRol
	 */
	public void setNomRol(java.lang.String nomRol) {
		this.nomRol = nomRol;
	}

	/**
	 * Returns a string representation of the value object.
	 */
	public String toString()
	{
		StringBuffer b = new StringBuffer();
		b.append (getClass().getName());
		b.append ("[codiAplicacioRol: ");
		b.append (this.codiAplicacioRol);
		b.append (", codiBaseDeDades: ");
		b.append (this.codiBaseDeDades);
		b.append (", id: ");
		b.append (this.id);
		b.append (", idFitxer: ");
		b.append (this.idFitxer);
		b.append (", nomRol: ");
		b.append (this.nomRol);
		b.append ("]");
		return b.toString();
	}

}
