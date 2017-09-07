//
// (C) 2013 Soffid
//
//

package com.soffid.iam.addons.lopd.common;
/**
 * ValueObject ResponsableSeguretatOrganitzatiuFitxer
 */
public class ResponsableSeguretatOrganitzatiuFitxer
		implements java.io.Serializable
 {

	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = 1;
	/**
	 * Attribute idFitxer

	 */
	private java.lang.Long idFitxer;

	/**
	 * Attribute codiUsuari

	 */
	private java.lang.String codiUsuari;

	/**
	 * Attribute nomFitxer

	 */
	private java.lang.String nomFitxer;

	/**
	 * Attribute nomComplertUsuari

	 */
	private java.lang.String nomComplertUsuari;

	/**
	 * Attribute id

	 */
	private java.lang.Long id;

	/**
	 * Attribute direccioGeneralFitxer

	 */
	private java.lang.String direccioGeneralFitxer;

	public ResponsableSeguretatOrganitzatiuFitxer()
	{
	}

	public ResponsableSeguretatOrganitzatiuFitxer(java.lang.Long idFitxer, java.lang.String codiUsuari, java.lang.String nomFitxer, java.lang.String nomComplertUsuari, java.lang.Long id, java.lang.String direccioGeneralFitxer)
	{
		super();
		this.idFitxer = idFitxer;
		this.codiUsuari = codiUsuari;
		this.nomFitxer = nomFitxer;
		this.nomComplertUsuari = nomComplertUsuari;
		this.id = id;
		this.direccioGeneralFitxer = direccioGeneralFitxer;
	}

	public ResponsableSeguretatOrganitzatiuFitxer(java.lang.String codiUsuari)
	{
		super();
		this.codiUsuari = codiUsuari;
	}

	public ResponsableSeguretatOrganitzatiuFitxer(ResponsableSeguretatOrganitzatiuFitxer otherBean)
	{
		this(otherBean.idFitxer, otherBean.codiUsuari, otherBean.nomFitxer, otherBean.nomComplertUsuari, otherBean.id, otherBean.direccioGeneralFitxer);
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
	 * Gets value for attribute codiUsuari
	 */
	public java.lang.String getCodiUsuari() {
		return this.codiUsuari;
	}

	/**
	 * Sets value for attribute codiUsuari
	 */
	public void setCodiUsuari(java.lang.String codiUsuari) {
		this.codiUsuari = codiUsuari;
	}

	/**
	 * Gets value for attribute nomFitxer
	 */
	public java.lang.String getNomFitxer() {
		return this.nomFitxer;
	}

	/**
	 * Sets value for attribute nomFitxer
	 */
	public void setNomFitxer(java.lang.String nomFitxer) {
		this.nomFitxer = nomFitxer;
	}

	/**
	 * Gets value for attribute nomComplertUsuari
	 */
	public java.lang.String getNomComplertUsuari() {
		return this.nomComplertUsuari;
	}

	/**
	 * Sets value for attribute nomComplertUsuari
	 */
	public void setNomComplertUsuari(java.lang.String nomComplertUsuari) {
		this.nomComplertUsuari = nomComplertUsuari;
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
	 * Gets value for attribute direccioGeneralFitxer
	 */
	public java.lang.String getDireccioGeneralFitxer() {
		return this.direccioGeneralFitxer;
	}

	/**
	 * Sets value for attribute direccioGeneralFitxer
	 */
	public void setDireccioGeneralFitxer(java.lang.String direccioGeneralFitxer) {
		this.direccioGeneralFitxer = direccioGeneralFitxer;
	}

	/**
	 * Returns a string representation of the value object.
	 */
	public String toString()
	{
		StringBuffer b = new StringBuffer();
		b.append (getClass().getName());
		b.append ("[idFitxer: ");
		b.append (this.idFitxer);
		b.append (", codiUsuari: ");
		b.append (this.codiUsuari);
		b.append (", nomFitxer: ");
		b.append (this.nomFitxer);
		b.append (", nomComplertUsuari: ");
		b.append (this.nomComplertUsuari);
		b.append (", id: ");
		b.append (this.id);
		b.append (", direccioGeneralFitxer: ");
		b.append (this.direccioGeneralFitxer);
		b.append ("]");
		return b.toString();
	}

}
