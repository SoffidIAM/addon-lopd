//
// (C) 2013 Soffid
//
//

package com.soffid.iam.addons.lopd.model;
/**
 * Entity ResponsableSeguretatOrganitzatiuFitxerEntity
 */
public abstract class ResponsableSeguretatOrganitzatiuFitxerEntity {

	/**
	 * The serial version UID of this class. Needed for serialization.
	 */
	private static final long serialVersionUID = 1;
	/**
	 * Attribute fitxer

	 */
	private com.soffid.iam.addons.lopd.model.FitxerEntity fitxer;

	/**
	 * Gets value for attribute fitxer
	 */
	public com.soffid.iam.addons.lopd.model.FitxerEntity getFitxer() {
		return this.fitxer;
	}

	/**
	 * Sets value for attribute fitxer
	 */
	public void setFitxer(com.soffid.iam.addons.lopd.model.FitxerEntity fitxer) {
		this.fitxer = fitxer;
	}

	/**
	 * Attribute responsableSeguretatOrganitzatiu

	 */
	private es.caib.seycon.ng.model.UsuariEntity responsableSeguretatOrganitzatiu;

	/**
	 * Gets value for attribute responsableSeguretatOrganitzatiu
	 */
	public es.caib.seycon.ng.model.UsuariEntity getResponsableSeguretatOrganitzatiu() {
		return this.responsableSeguretatOrganitzatiu;
	}

	/**
	 * Sets value for attribute responsableSeguretatOrganitzatiu
	 */
	public void setResponsableSeguretatOrganitzatiu(es.caib.seycon.ng.model.UsuariEntity responsableSeguretatOrganitzatiu) {
		this.responsableSeguretatOrganitzatiu = responsableSeguretatOrganitzatiu;
	}

	/**
	 * Attribute id

	 */
	private java.lang.Long id;

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
	 * Returns <code>true</code> if the argument is an ResponsableSeguretatOrganitzatiuFitxerEntity instance and all identifiers for this entity 
	 * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
	 */
	public boolean equals(Object object)
	{
		if (this == object)
		{
			return true;
		}
		if (!(object instanceof ResponsableSeguretatOrganitzatiuFitxerEntity))
		{
			return false;
		}
		final ResponsableSeguretatOrganitzatiuFitxerEntity that = (ResponsableSeguretatOrganitzatiuFitxerEntity)object;
		if (this.id == null || that.getId() == null || !this.id.equals(that.getId())) 
		{
			return false;
		}
		return true;
	}
	/**
	 * Returns a hash code based on this entity's identifiers.
	 */
	public int hashCode()
	{
		int hashCode = 0;
		hashCode = 29 * hashCode + (id == null ? 0 : id.hashCode());
		return hashCode;
	}
}
