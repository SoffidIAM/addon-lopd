// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.soffid.iam.addons.lopd.service;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

import com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer;
import com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer;
import es.caib.seycon.ng.comu.Rol;
import com.soffid.iam.addons.lopd.common.RolFitxer;
import com.soffid.iam.addons.lopd.common.Fitxer;
import es.caib.seycon.ng.exception.SeyconException;
import es.caib.seycon.ng.model.RolEntity;
import com.soffid.iam.addons.lopd.model.RolFitxerEntity;
import com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity;
import com.soffid.iam.addons.lopd.model.FitxerEntity;
import com.soffid.iam.addons.lopd.model.FitxerEntityDao;
import com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity;
import com.soffid.iam.addons.lopd.service.LopdService;
import com.soffid.iam.addons.lopd.service.LopdServiceBase;
import com.soffid.iam.addons.lopd.service.Messages;
import es.caib.seycon.ng.utils.AutoritzacionsUsuari;
import es.caib.seycon.ng.utils.DateUtils;
import es.caib.seycon.ng.utils.LimitDates; 

/**
 * @see com.soffid.iam.addons.lopd.service.LopdService 
 */
public class LopdServiceImpl extends com.soffid.iam.addons.lopd.service.LopdServiceBase {

	protected java.util.Collection<Fitxer> handleGetFitxers() throws java.lang.Exception {
		return getFitxerEntityDao().toFitxerList(getFitxerEntityDao().loadAll());
	}

	protected com.soffid.iam.addons.lopd.common.Fitxer handleCreate(com.soffid.iam.addons.lopd.common.Fitxer fitxer) throws java.lang.Exception {
		if (AutoritzacionsUsuari.canCreateLopd()) {
			FitxerEntity fitxerEntity = getFitxerEntityDao().fitxerToEntity(fitxer);
			getFitxerEntityDao().create(fitxerEntity);
			fitxer.setId(fitxerEntity.getId());
			return (getFitxerEntityDao().toFitxer(fitxerEntity));
		}
		throw new SeyconException(Messages.getString("LopdServiceImpl.0")); //$NON-NLS-1$
	}

	protected Fitxer handleUpdate(com.soffid.iam.addons.lopd.common.Fitxer fitxer) throws java.lang.Exception {
		if (AutoritzacionsUsuari.canUpdateLopd()) {
			FitxerEntity fitxerEntity = getFitxerEntityDao().fitxerToEntity(fitxer);
			getFitxerEntityDao().update(fitxerEntity);
			return getFitxerEntityDao().toFitxer(fitxerEntity);
		}
		throw new SeyconException(Messages.getString("LopdServiceImpl.1")); //$NON-NLS-1$
	}

	protected void handleDelete(com.soffid.iam.addons.lopd.common.Fitxer fitxer) throws java.lang.Exception {
		if (AutoritzacionsUsuari.canDeleteLopd()) {
			getFitxerEntityDao().remove(getFitxerEntityDao().fitxerToEntity(fitxer));
		} else {
			throw new SeyconException(Messages.getString("LopdServiceImpl.2")); //$NON-NLS-1$
		}
	}

	protected Collection<Fitxer> handleFindFitxersByFiltre(String id, String nom, String responsable, String conselleria, String dg,
			String nivell, String registrat) throws Exception {
		LimitDates limitDates = null;
		if (registrat != null && registrat.trim().compareTo("") != 0 && registrat.trim().compareTo("%") != 0) { //$NON-NLS-1$ //$NON-NLS-2$
			registrat = registrat.trim();
			limitDates = DateUtils.getLimitDatesFromQuery(registrat);
		}

		Long actualId = null;
		if (id == null || id.trim().compareTo("") == 0 || id.trim().compareTo("%") == 0) { //$NON-NLS-1$ //$NON-NLS-2$
			actualId = null;
		} else {
			try {
				actualId = Long.decode(id);
			} catch (Exception e) {
				throw new SeyconException(String.format(Messages.getString("LopdServiceImpl.3"), id)); //$NON-NLS-1$
			}
		}

		if (nom != null && (nom.trim().compareTo("") == 0 || nom.trim().compareTo("%") == 0)) { //$NON-NLS-1$ //$NON-NLS-2$
			nom = null;
		}
		if (responsable != null && (responsable.trim().compareTo("") == 0 || responsable.trim().compareTo("%") == 0)) { //$NON-NLS-1$ //$NON-NLS-2$
			responsable = null;
		}
		if (conselleria != null && (conselleria.trim().compareTo("") == 0 || conselleria.trim().compareTo("%") == 0)) { //$NON-NLS-1$ //$NON-NLS-2$
			conselleria = null;
		}
		if (dg != null && (dg.trim().compareTo("") == 0 || dg.trim().compareTo("%") == 0)) { //$NON-NLS-1$ //$NON-NLS-2$
			dg = null;
		}
		if (nivell != null && (nivell.trim().compareTo("") == 0 || nivell.trim().compareTo("%") == 0)) { //$NON-NLS-1$ //$NON-NLS-2$
			nivell = null;
		}

		Collection<FitxerEntity> fitxers = null;
		if (limitDates != null) {
			fitxers = getFitxerEntityDao().findFitxersByFiltre(actualId, nom, responsable, conselleria, dg, nivell,
					DateUtils.nullDate, limitDates.getMaximum(), limitDates.getMinimum());
		} else {
			fitxers = getFitxerEntityDao().findFitxersByFiltre(actualId, nom, responsable, conselleria, dg, nivell);
		}
		if (fitxers != null) {
			if (fitxers.size() >= 201) {
				throw new es.caib.seycon.ng.exception.SeyconException(
						Messages.getString("LopdServiceImpl.4")); //$NON-NLS-1$
			}
			return getFitxerEntityDao().toFitxerList(fitxers);
		}
		return new Vector();
	}

	protected Collection<Fitxer> handleFindFitxersByNomFitxer(String nomFitxer) throws Exception {
		if (nomFitxer == null || nomFitxer.trim().compareTo("") == 0) { //$NON-NLS-1$
			nomFitxer = "%"; //$NON-NLS-1$
		}
		Collection<FitxerEntity> fitxers = getFitxerEntityDao().findByNom(nomFitxer);
		if (fitxers != null) {
			return getFitxerEntityDao().toFitxerList(fitxers);
		}
		return new Vector();
	}

	protected Fitxer handleFindFitxerById(Long idFitxer) throws Exception {
		FitxerEntity fitxerEntity = getFitxerEntityDao().findById(idFitxer);
		if (fitxerEntity != null) {
			Fitxer fitxer = getFitxerEntityDao().toFitxer(fitxerEntity);
			return fitxer;
		}
		return null;
	}

	protected Collection<Rol> handleFindRolesByIdFitxer(Long idFitxer) throws Exception {
		FitxerEntity fitxer = getFitxerEntityDao().findById(idFitxer);
		Collection<RolFitxerEntity> rolfitxer = fitxer.getRolFitxers();
		Collection<RolEntity> rols = new LinkedList<RolEntity>();
		for (Iterator<RolFitxerEntity> it = rolfitxer.iterator(); it.hasNext();) {
			rols.add(it.next().getRol());
		}
		if (rols != null && rols.size() != 0) {
			return getRolEntityDao().toRolList(rols);
		}
		return new LinkedList<Rol>();
	}

	protected ResponsableSeguretatOrganitzatiuFitxer handleCreate(
			ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer) throws Exception {
		if (AutoritzacionsUsuari.canCreateLopd() || AutoritzacionsUsuari.canUpdateLopd()) {
			ResponsableSeguretatOrganitzatiuFitxerEntity responsableSeguretatOrganitzatiuFitxerEntity = getResponsableSeguretatOrganitzatiuFitxerEntityDao()
					.responsableSeguretatOrganitzatiuFitxerToEntity(responsableSeguretatOrganitzatiuFitxer);
			if (responsableSeguretatOrganitzatiuFitxerEntity.getResponsableSeguretatOrganitzatiu().getCodi()
					.compareTo(getPrincipal().getName()) == 0) {
				throw new SeyconException(Messages.getString("LopdServiceImpl.5")); //$NON-NLS-1$
			}
			getResponsableSeguretatOrganitzatiuFitxerEntityDao().create(responsableSeguretatOrganitzatiuFitxerEntity);
			responsableSeguretatOrganitzatiuFitxer.setId(responsableSeguretatOrganitzatiuFitxerEntity.getId());
			return getResponsableSeguretatOrganitzatiuFitxerEntityDao().toResponsableSeguretatOrganitzatiuFitxer(
					responsableSeguretatOrganitzatiuFitxerEntity);
		}
		throw new SeyconException(Messages.getString("LopdServiceImpl.6")); //$NON-NLS-1$
	}

	protected AdministradorSeguretatOrganitzatiuFitxer handleCreate(
			AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer) throws Exception {
		if (AutoritzacionsUsuari.canCreateLopd() || AutoritzacionsUsuari.canUpdateLopd()) {
			AdministradorSeguretatOrganitzatiuFitxerEntity administradorSeguretatOrganitzatiuFitxerEntity = getAdministradorSeguretatOrganitzatiuFitxerEntityDao()
					.administradorSeguretatOrganitzatiuFitxerToEntity(administradorSeguretatOrganitzatiuFitxer);
			if (administradorSeguretatOrganitzatiuFitxerEntity.getAdministradorDeSeguretatOrganitzatiu().getCodi()
					.compareTo(getPrincipal().getName()) == 0) {
				throw new SeyconException(Messages.getString("LopdServiceImpl.7")); //$NON-NLS-1$
			}
			getAdministradorSeguretatOrganitzatiuFitxerEntityDao().create(administradorSeguretatOrganitzatiuFitxerEntity);
			administradorSeguretatOrganitzatiuFitxer.setId(administradorSeguretatOrganitzatiuFitxerEntity.getId());
			return getAdministradorSeguretatOrganitzatiuFitxerEntityDao().toAdministradorSeguretatOrganitzatiuFitxer(
					administradorSeguretatOrganitzatiuFitxerEntity);
		}
		throw new SeyconException(Messages.getString("LopdServiceImpl.8")); //$NON-NLS-1$
	}

	protected void handleDelete(ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer) throws Exception {
		if (AutoritzacionsUsuari.canDeleteLopd()) {
			ResponsableSeguretatOrganitzatiuFitxerEntity responsableSeguretatOrganitzatiuFitxerEntity = getResponsableSeguretatOrganitzatiuFitxerEntityDao()
					.responsableSeguretatOrganitzatiuFitxerToEntity(responsableSeguretatOrganitzatiuFitxer);
			getResponsableSeguretatOrganitzatiuFitxerEntityDao().remove(responsableSeguretatOrganitzatiuFitxerEntity);
		} else {
			throw new SeyconException(Messages.getString("LopdServiceImpl.9")); //$NON-NLS-1$
		}
	}

	protected void handleDelete(AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer) throws Exception {
		if (AutoritzacionsUsuari.canDeleteLopd()) {
			AdministradorSeguretatOrganitzatiuFitxerEntity administradorSeguretatOrganitzatiuFitxerEntity = getAdministradorSeguretatOrganitzatiuFitxerEntityDao()
					.administradorSeguretatOrganitzatiuFitxerToEntity(administradorSeguretatOrganitzatiuFitxer);
			getAdministradorSeguretatOrganitzatiuFitxerEntityDao().remove(administradorSeguretatOrganitzatiuFitxerEntity);
		} else {
			throw new SeyconException(Messages.getString("LopdServiceImpl.10")); //$NON-NLS-1$
		}
	}

	protected AdministradorSeguretatOrganitzatiuFitxer handleFindAdministradorSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(
			String codiUsuari, Long idFitxer) throws Exception {
		AdministradorSeguretatOrganitzatiuFitxerEntity administradorSeguretatOrganitzatiuFitxerEntity = getAdministradorSeguretatOrganitzatiuFitxerEntityDao()
				.findByCodiUsuariAndIdFitxer(codiUsuari, idFitxer);
		if (administradorSeguretatOrganitzatiuFitxerEntity != null) {
			AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer = getAdministradorSeguretatOrganitzatiuFitxerEntityDao()
					.toAdministradorSeguretatOrganitzatiuFitxer(administradorSeguretatOrganitzatiuFitxerEntity);
			return administradorSeguretatOrganitzatiuFitxer;
		}
		return null;
	}

	protected ResponsableSeguretatOrganitzatiuFitxer handleFindResponsableSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(
			String codiUsuari, Long idFitxer) throws Exception {
		ResponsableSeguretatOrganitzatiuFitxerEntity responsableSeguretatOrganitzatiuFitxerEntity = getResponsableSeguretatOrganitzatiuFitxerEntityDao()
				.findByCodiUsuariAndIdFitxer(codiUsuari, idFitxer);
		if (responsableSeguretatOrganitzatiuFitxerEntity != null) {
			ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer = getResponsableSeguretatOrganitzatiuFitxerEntityDao()
					.toResponsableSeguretatOrganitzatiuFitxer(responsableSeguretatOrganitzatiuFitxerEntity);
			return responsableSeguretatOrganitzatiuFitxer;
		}
		return null;
	}

	protected Collection<AdministradorSeguretatOrganitzatiuFitxer> handleFindAdministradorsSeguretatOrganitzatiusFitxerByIdFitxer(
			Long idFitxer) throws Exception {
		Collection<AdministradorSeguretatOrganitzatiuFitxerEntity> administradors = getAdministradorSeguretatOrganitzatiuFitxerEntityDao()
				.findByIdFitxer(idFitxer);
		if (administradors != null) {
			return getAdministradorSeguretatOrganitzatiuFitxerEntityDao().toAdministradorSeguretatOrganitzatiuFitxerList(
					administradors);
		}
		return new Vector();
	}

	protected Collection<ResponsableSeguretatOrganitzatiuFitxer> handleFindResponsablesSeguretatOrganitzatiusFitxerByIdFitxer(
			Long idFitxer) throws Exception {
		Collection<ResponsableSeguretatOrganitzatiuFitxerEntity> responsable = getResponsableSeguretatOrganitzatiuFitxerEntityDao()
				.findByIdFitxer(idFitxer);
		if (responsable != null) {
			return getResponsableSeguretatOrganitzatiuFitxerEntityDao().toResponsableSeguretatOrganitzatiuFitxerList(responsable);
		}
		return new Vector();
	}

	protected RolFitxer handleCreate(RolFitxer rolFitxer) throws Exception {
		if (AutoritzacionsUsuari.canCreateLopd() || AutoritzacionsUsuari.canUpdateLopd()) {
			RolFitxerEntity rolFitxerEntity = getRolFitxerEntityDao().rolFitxerToEntity(rolFitxer);
			getRolFitxerEntityDao().create(rolFitxerEntity);
			rolFitxer.setId(rolFitxerEntity.getId());
			return getRolFitxerEntityDao().toRolFitxer(rolFitxerEntity);
		}
		throw new SeyconException(Messages.getString("LopdServiceImpl.11")); //$NON-NLS-1$
	}

	protected void handleDelete(RolFitxer rolFitxer) throws Exception {
		if (AutoritzacionsUsuari.canDeleteLopd()) {
			RolFitxerEntity rolFitxerEntity = getRolFitxerEntityDao().rolFitxerToEntity(rolFitxer);
			getRolFitxerEntityDao().remove(rolFitxerEntity);
		} else {
			throw new SeyconException(Messages.getString("LopdServiceImpl.12")); //$NON-NLS-1$
		}
	}

	protected Collection<RolFitxer> handleFindRolsFitxersByIdFitxer(Long idFitxer) throws Exception {
		Collection<RolFitxerEntity> rolsFitxers = getRolFitxerEntityDao().findByIdFitxer(idFitxer);
		if (rolsFitxers != null) {
			return getRolFitxerEntityDao().toRolFitxerList(rolsFitxers);
		}
		return new Vector();
	}

	protected RolFitxer handleFindRolFitxerByNomRolAndIdFitxer(String nomRol, Long idFitxer) throws Exception {
		RolFitxerEntity rolFitxerEntity = getRolFitxerEntityDao().findByIdFitxerAndNomRol(idFitxer, nomRol);
		if (rolFitxerEntity != null) {
			RolFitxer rolFitxer = getRolFitxerEntityDao().toRolFitxer(rolFitxerEntity);
			return rolFitxer;
		}
		return null;
	}

}