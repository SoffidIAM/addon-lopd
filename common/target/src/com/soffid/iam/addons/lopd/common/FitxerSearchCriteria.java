//
// (C) 2013 Soffid
//
//

package com.soffid.iam.addons.lopd.common;
/**
 * ValueObject FitxerSearchCriteria
 */
public class FitxerSearchCriteria
		implements java.io.Serializable
 {

	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = 1;
	/**
	 * Attribute nom

	 */
	private java.lang.String nom;

	/**
	 * Attribute nivell

	 */
	private java.lang.String nivell;

	/**
	 * Attribute registratAPD

	 */
	private java.lang.String registratAPD;

	/**
	 * Attribute id

	 */
	private java.lang.String id;

	public FitxerSearchCriteria()
	{
	}

	public FitxerSearchCriteria(java.lang.String nom, java.lang.String nivell, java.lang.String registratAPD, java.lang.String id)
	{
		super();
		this.nom = nom;
		this.nivell = nivell;
		this.registratAPD = registratAPD;
		this.id = id;
	}

	public FitxerSearchCriteria(java.lang.String nom, java.lang.String id)
	{
		super();
		this.nom = nom;
		this.id = id;
	}

	public FitxerSearchCriteria(FitxerSearchCriteria otherBean)
	{
		this(otherBean.nom, otherBean.nivell, otherBean.registratAPD, otherBean.id);
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
	 * Gets value for attribute registratAPD
	 */
	public java.lang.String getRegistratAPD() {
		return this.registratAPD;
	}

	/**
	 * Sets value for attribute registratAPD
	 */
	public void setRegistratAPD(java.lang.String registratAPD) {
		this.registratAPD = registratAPD;
	}

	/**
	 * Gets value for attribute id
	 */
	public java.lang.String getId() {
		return this.id;
	}

	/**
	 * Sets value for attribute id
	 */
	public void setId(java.lang.String id) {
		this.id = id;
	}

	/**
	 * The first result to retrieve.
	 */
	private java.lang.Integer firstResult;

	/**
	 * Gets the first result to retrieve.
	 *
	 * @return the first result to retrieve
	 */
	public java.lang.Integer getFirstResult()
	{
		return this.firstResult;
	}

	/**
	 * Sets the first result to retrieve.
	 *
	 * @param firstResult the first result to retrieve
	 */
	public void setFirstResult(java.lang.Integer firstResult)
	{
		this.firstResult = firstResult;
	}

	/**
	 * The fetch size.
	 */
	private java.lang.Integer fetchSize;

	/**
	 * Gets the fetch size.
	 *
	 * @return the fetch size
	 */
	public java.lang.Integer getFetchSize()
	{
		return this.fetchSize;
	}

	/**
	 * Sets the fetch size.
	 *
	 * @param fetchSize the fetch size.
	 */
	public void setFetchSize(java.lang.Integer fetchSize)
	{
		this.fetchSize = fetchSize;
	}

	/**
	 * The maximum size of the result set.
	 */
	private java.lang.Integer maximumResultSize;

	/**
	 * Gets the maximum size of the result set.
	 *
	 * @return the maximum size of the result set
	 */
	public java.lang.Integer getMaximumResultSize()
	{
		return this.maximumResultSize;
	}

	/**
	 * Sets the maximum size of the result set.
	 *
	 * @param maximumResultSize the maximum size of the result set.
	 */
	public void setMaximumResultSize(java.lang.Integer maximumResultSize)
	{
		this.maximumResultSize = maximumResultSize;
	}

	/**
	 * Returns a string representation of the value object.
	 */
	public String toString()
	{
		StringBuffer b = new StringBuffer();
		b.append (getClass().getName());
		b.append ("[nom: ");
		b.append (this.nom);
		b.append (", nivell: ");
		b.append (this.nivell);
		b.append (", registratAPD: ");
		b.append (this.registratAPD);
		b.append (", id: ");
		b.append (this.id);
		b.append ("]");
		return b.toString();
	}

}
