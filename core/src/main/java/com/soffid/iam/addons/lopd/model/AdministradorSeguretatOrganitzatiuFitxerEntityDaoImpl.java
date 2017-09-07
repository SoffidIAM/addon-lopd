// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.soffid.iam.addons.lopd.model;

import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Iterator;

import es.caib.seycon.ng.PrincipalStore;
import es.caib.seycon.ng.model.AuditoriaEntity;
import es.caib.seycon.ng.model.GrupEntity;
import es.caib.seycon.ng.model.UsuariEntity;
import es.caib.seycon.ng.utils.Security;
import es.caib.seycon.ng.comu.Auditoria;
import es.caib.seycon.ng.comu.Usuari;
import es.caib.seycon.ng.exception.SeyconException;
import es.caib.seycon.ng.utils.ExceptionTranslator;

/**
 * @see com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity
 */
public class AdministradorSeguretatOrganitzatiuFitxerEntityDaoImpl
		extends
		com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntityDaoBase {

	private void auditarAdministradorSeguretatOrganitzatiuFitxer(String accio,
			String codiUsuariAuditat, Long fitxer) {
		Principal principal = Security.getPrincipal();
		String codiUsuari = principal!=null ? principal.getName() : "SEYCON"; //$NON-NLS-1$
		Auditoria auditoria = new Auditoria();
		auditoria.setAccio(accio);
		auditoria.setUsuari(codiUsuariAuditat);
		auditoria.setFitxer(fitxer);
		auditoria.setAutor(codiUsuari);
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"dd/MM/yyyy kk:mm:ss"); //$NON-NLS-1$
		auditoria.setData(dateFormat.format(GregorianCalendar.getInstance()
				.getTime()));
		auditoria.setObjecte(Security.SC_ADMIN_SEG_ORG_USUARI);

		AuditoriaEntity auditoriaEntity = getAuditoriaEntityDao()
				.auditoriaToEntity(auditoria);
		getAuditoriaEntityDao().create(auditoriaEntity);
	}

	public void update(
			AdministradorSeguretatOrganitzatiuFitxerEntity administrador) {
		try {
			super.update(administrador);
			getSession(false).flush();
			Long fitxerId = administrador.getFitxer().getId();
			String codiUsuari = administrador
					.getAdministradorDeSeguretatOrganitzatiu().getCodi();
			auditarAdministradorSeguretatOrganitzatiuFitxer("U", codiUsuari, //$NON-NLS-1$
					fitxerId);
		} catch (Throwable e) {
			String message = ExceptionTranslator.translate(e);
			throw new SeyconException(String.format(
					Messages.getString("AdministradorSeguretatOrganitzatiuFitxerEntityDaoImpl.0"),  //$NON-NLS-1$
						administrador.getAdministradorDeSeguretatOrganitzatiu().getCodi(), 
						message));
		}
	}

	public void create(
			com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity administrador)
			throws RuntimeException {
		try {
			super.create(administrador);
			getSession(false).flush();
			Long fitxerId = administrador.getFitxer().getId();
			String codiUsuari = administrador
					.getAdministradorDeSeguretatOrganitzatiu().getCodi();
			auditarAdministradorSeguretatOrganitzatiuFitxer("C", codiUsuari, //$NON-NLS-1$
					fitxerId);
		} catch (Throwable e) {
			String message = ExceptionTranslator.translate(e);
			throw new SeyconException(String.format(Messages.getString("AdministradorSeguretatOrganitzatiuFitxerEntityDaoImpl.1"), //$NON-NLS-1$
					administrador.getAdministradorDeSeguretatOrganitzatiu().getCodi(), 
					message));
		}
	}

	public void remove(
			com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity administrador)
			throws RuntimeException {
		try {
			Long fitxerId = administrador.getFitxer().getId();
			String codiUsuari = administrador
					.getAdministradorDeSeguretatOrganitzatiu().getCodi();
			super.remove(administrador);
			getSession(false).flush();
			auditarAdministradorSeguretatOrganitzatiuFitxer("D", codiUsuari, //$NON-NLS-1$
					fitxerId);			
		} catch (Throwable e) {
			String message = ExceptionTranslator.translate(e);
			throw new SeyconException(String.format(Messages.getString("AdministradorSeguretatOrganitzatiuFitxerEntityDaoImpl.2"), //$NON-NLS-1$
					administrador.getAdministradorDeSeguretatOrganitzatiu().getCodi(), 
					message));
		}
	}

	/**
	 * @see es.caib.seycon.ng.model.AdministradorSeguretatOrganitzatiuFitxerEntityDao#toAdministradorSeguretatOrganitzatiuFitxer(es.caib.seycon.ng.model.AdministradorSeguretatOrganitzatiuFitxerEntity,
	 *      es.caib.seycon.ng.comu.AdministradorSeguretatOrganitzatiuFitxer)
	 */
	public void toAdministradorSeguretatOrganitzatiuFitxer(
			com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity sourceEntity,
			com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer targetVO) {
		super
				.toAdministradorSeguretatOrganitzatiuFitxer(sourceEntity,
						targetVO);
		toAdministradorSeguretatOrganitzatiuFitxerCustom(sourceEntity, targetVO);
	}

	public void toAdministradorSeguretatOrganitzatiuFitxerCustom(
			com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity sourceEntity,
			com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer targetVO) {
		FitxerEntity fitxer = sourceEntity.getFitxer();
		targetVO.setIdFitxer(fitxer.getId());
		UsuariEntity usuariEntity = sourceEntity
				.getAdministradorDeSeguretatOrganitzatiu();
		Usuari usuari = getUsuariEntityDao().toUsuari(usuariEntity);
		targetVO.setCodiUsuari(usuari.getCodi());
		String nomComplertUsuari = ""; //$NON-NLS-1$
		nomComplertUsuari += usuari.getNom() != null ? usuari.getNom() : ""; //$NON-NLS-1$
		nomComplertUsuari += usuari.getPrimerLlinatge() != null ? " " //$NON-NLS-1$
				+ usuari.getPrimerLlinatge() : ""; //$NON-NLS-1$
		nomComplertUsuari += usuari.getSegonLlinatge() != null ? " " //$NON-NLS-1$
				+ usuari.getSegonLlinatge() : ""; //$NON-NLS-1$
		targetVO.setNomComplertUsuari(nomComplertUsuari);
		GrupEntity direccioGeneral = fitxer.getDireccioGeneral();
		if (direccioGeneral != null) {
			targetVO.setDireccioGeneralFitxer(direccioGeneral.getCodi());
		} else {
			targetVO.setDireccioGeneralFitxer(null);
		}
	}

	/**
	 * @see es.caib.seycon.ng.model.AdministradorSeguretatOrganitzatiuFitxerEntityDao#toAdministradorSeguretatOrganitzatiuFitxer(es.caib.seycon.ng.model.AdministradorSeguretatOrganitzatiuFitxerEntity)
	 */
	public com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer toAdministradorSeguretatOrganitzatiuFitxer(
			final com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity entity) {
		return super.toAdministradorSeguretatOrganitzatiuFitxer(entity);
	}

	/**
	 * Retrieves the entity object that is associated with the specified value
	 * object from the object store. If no such entity object exists in the
	 * object store, a new, blank entity is created
	 */
	private com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity loadAdministradorSeguretatOrganitzatiuFitxerEntityFromAdministradorSeguretatOrganitzatiuFitxer(
			com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer) {

		AdministradorSeguretatOrganitzatiuFitxerEntity administradorSeguretatOrganitzatiuFitxerEntity = null;
		if (administradorSeguretatOrganitzatiuFitxer.getId() != null) {
			administradorSeguretatOrganitzatiuFitxerEntity = load(administradorSeguretatOrganitzatiuFitxer
					.getId());
		}
		if (administradorSeguretatOrganitzatiuFitxerEntity == null) {
			administradorSeguretatOrganitzatiuFitxerEntity = newAdministradorSeguretatOrganitzatiuFitxerEntity(); 
		}
		return administradorSeguretatOrganitzatiuFitxerEntity;
	}

	/**
	 * @see es.caib.seycon.ng.model.AdministradorSeguretatOrganitzatiuFitxerEntityDao#administradorSeguretatOrganitzatiuFitxerToEntity(es.caib.seycon.ng.comu.AdministradorSeguretatOrganitzatiuFitxer)
	 */
	public com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity administradorSeguretatOrganitzatiuFitxerToEntity(
			com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer) {
		AdministradorSeguretatOrganitzatiuFitxerEntity entity = this
				.loadAdministradorSeguretatOrganitzatiuFitxerEntityFromAdministradorSeguretatOrganitzatiuFitxer(administradorSeguretatOrganitzatiuFitxer);
		this.administradorSeguretatOrganitzatiuFitxerToEntity(
				administradorSeguretatOrganitzatiuFitxer, entity, true);
		return entity;
	}

	public void administradorSeguretatOrganitzatiuFitxerToEntityCustom(
			com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer sourceVO,
			com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity targetEntity) {
		String codiUsuari = sourceVO.getCodiUsuari();
		UsuariEntity usuari = getUsuariEntityDao().findByCodi(codiUsuari);
		if (usuari == null) {
			throw new SeyconException(String.format(Messages.getString("AdministradorSeguretatOrganitzatiuFitxerEntityDaoImpl.3"), codiUsuari)); //$NON-NLS-1$
		}
		targetEntity.setAdministradorDeSeguretatOrganitzatiu(usuari);

		Long id = sourceVO.getIdFitxer();
		if (id != null) {
			FitxerEntity fitxer = getFitxerEntityDao().findById(id);
			if (fitxer == null) {
				throw new SeyconException(String.format(Messages.getString("AdministradorSeguretatOrganitzatiuFitxerEntityDaoImpl.4"), id)); //$NON-NLS-1$
			}
			targetEntity.setFitxer(fitxer);
		} else {
			String nomFitxer = sourceVO.getNomFitxer();
			String direccioGeneral = sourceVO.getDireccioGeneralFitxer();
			FitxerEntity fitxerEntity = getFitxerEntityDao()
					.findByNomAndDireccioGeneral(nomFitxer, direccioGeneral);
			targetEntity.setFitxer(fitxerEntity);
		}
	}

	/**
	 * @see es.caib.seycon.ng.model.AdministradorSeguretatOrganitzatiuFitxerEntityDao#administradorSeguretatOrganitzatiuFitxerToEntity(es.caib.seycon.ng.comu.AdministradorSeguretatOrganitzatiuFitxer,
	 *      es.caib.seycon.ng.model.AdministradorSeguretatOrganitzatiuFitxerEntity)
	 */
	public void administradorSeguretatOrganitzatiuFitxerToEntity(
			com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer sourceVO,
			com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity targetEntity,
			boolean copyIfNull) {
		super.administradorSeguretatOrganitzatiuFitxerToEntity(sourceVO,
				targetEntity, copyIfNull);
		administradorSeguretatOrganitzatiuFitxerToEntityCustom(sourceVO,
				targetEntity);
	}

	public void create(Collection entities) {
		if (entities!=null) for (Iterator it = entities.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof AdministradorSeguretatOrganitzatiuFitxerEntity) {
				AdministradorSeguretatOrganitzatiuFitxerEntity administrador = (AdministradorSeguretatOrganitzatiuFitxerEntity) obj;
				this.create(administrador); // cridem al mètode 1 per 1
			}
		}
	}

	public void update(Collection entities) {
		if (entities!=null) for (Iterator it = entities.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof AdministradorSeguretatOrganitzatiuFitxerEntity) {
				AdministradorSeguretatOrganitzatiuFitxerEntity administrador = (AdministradorSeguretatOrganitzatiuFitxerEntity) obj;
				this.update(administrador);// cridem al mètode 1 per 1
			}
		}
		
	}

	public void remove(Collection entities) {
		if (entities!=null) for (Iterator it = entities.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof AdministradorSeguretatOrganitzatiuFitxerEntity) {
				AdministradorSeguretatOrganitzatiuFitxerEntity administrador = (AdministradorSeguretatOrganitzatiuFitxerEntity) obj;
				this.remove(administrador);// cridem al mètode 1 per 1
			}
		}
	}

}