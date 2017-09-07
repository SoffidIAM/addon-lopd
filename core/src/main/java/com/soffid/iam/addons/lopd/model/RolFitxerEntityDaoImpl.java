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
import es.caib.seycon.ng.comu.Auditoria;
import com.soffid.iam.addons.lopd.common.RolFitxer;
import es.caib.seycon.ng.exception.SeyconException;
import es.caib.seycon.ng.model.AuditoriaEntity;
import es.caib.seycon.ng.model.RolEntity;
import es.caib.seycon.ng.utils.ExceptionTranslator;
import es.caib.seycon.ng.utils.Security;

/**
 * @see es.caib.seycon.ng.model.RolFitxerEntity
 */
public class RolFitxerEntityDaoImpl extends
		com.soffid.iam.addons.lopd.model.RolFitxerEntityDaoBase {
	
	private void auditarRolsUsuaris(String accio, Long idFitxer, String nomRol, String aplicacio) {
		Principal principal = Security.getPrincipal();
		String codiUsuari = principal!=null ? principal.getName() : "SEYCON"; //$NON-NLS-1$
		Auditoria auditoria = new Auditoria();
		auditoria.setAccio(accio);
		auditoria.setRol(nomRol);
		auditoria.setFitxer(idFitxer);
		auditoria.setAplicacio(aplicacio);
		auditoria.setAutor(codiUsuari);
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"dd/MM/yyyy kk:mm:ss"); //$NON-NLS-1$
		auditoria.setData(dateFormat.format(GregorianCalendar.getInstance().getTime()));
		auditoria.setObjecte("SC_ROLFIT"); //$NON-NLS-1$

		AuditoriaEntity auditoriaEntity = getAuditoriaEntityDao()
				.auditoriaToEntity(auditoria);
		getAuditoriaEntityDao().create(auditoriaEntity);
	}
	
	public void create(
			com.soffid.iam.addons.lopd.model.RolFitxerEntity rolFitxer)
			throws RuntimeException {
		try {
			super.create(rolFitxer);
			getSession(false).flush();
			auditarRolsUsuaris("C", rolFitxer.getFitxer().getId(), rolFitxer.getRol().getNom(), rolFitxer.getRol().getAplicacio().getCodi()); //$NON-NLS-1$
		} catch (Throwable e) {
			String message = ExceptionTranslator.translate(e);

			throw new SeyconException(String.format(
					Messages.getString("RolFitxerEntityDaoImpl.0"),  //$NON-NLS-1$
					rolFitxer.getRol().getNom(), 
					rolFitxer.getFitxer().getNom(), 
					message));
		}
	}

	public void remove(com.soffid.iam.addons.lopd.model.RolFitxerEntity rolFitxer)
			throws RuntimeException {
		try {
			Long idFitxer = rolFitxer.getFitxer().getId(); 
			String nomRol = rolFitxer.getRol().getNom();
			String codiAplicacio = rolFitxer.getRol().getAplicacio().getCodi();
			super.remove(rolFitxer);
			getSession(false).flush();
			auditarRolsUsuaris("D", idFitxer, nomRol, codiAplicacio);			 //$NON-NLS-1$
		} catch (Throwable e) {
			String message = ExceptionTranslator.translate(e);
			throw new SeyconException(String.format(Messages.getString("RolFitxerEntityDaoImpl.1"),  //$NON-NLS-1$
					rolFitxer.getRol().getNom(), 
					rolFitxer.getFitxer().getNom(), 
					message));
		}
	}

	public void update(com.soffid.iam.addons.lopd.model.RolFitxerEntity rolFitxer)
			throws RuntimeException {
		try {
			super.update(rolFitxer);
			getSession(false).flush();
			auditarRolsUsuaris("U", rolFitxer.getFitxer().getId(), rolFitxer.getRol().getNom(), rolFitxer.getRol().getAplicacio().getCodi()); //$NON-NLS-1$
		} catch (Throwable e) {
			String message = ExceptionTranslator.translate(e);

			throw new SeyconException(String.format(Messages.getString("RolFitxerEntityDaoImpl.2"),  //$NON-NLS-1$
					rolFitxer.getRol().getNom(), 
					rolFitxer.getFitxer().getNom(), 
					message));
		}
	}

	public void toRolFitxer(com.soffid.iam.addons.lopd.model.RolFitxerEntity source,
			com.soffid.iam.addons.lopd.common.RolFitxer target) {
		// @todo verify behavior of toRolFitxer
		super.toRolFitxer(source, target);
		toRolFitxerCustom(source, target);
	}

	public void toRolFitxerCustom(
			com.soffid.iam.addons.lopd.model.RolFitxerEntity source,
			com.soffid.iam.addons.lopd.common.RolFitxer target) {
		target.setIdFitxer(source.getFitxer().getId());
		target.setNomRol(source.getRol().getNom());
		target.setCodiAplicacioRol(source.getRol().getAplicacio().getCodi());
		target.setCodiBaseDeDades(source.getRol().getBaseDeDades().getCodi());
	}

	/**
	 * @see es.caib.seycon.ng.model.RolFitxerEntityDao#toRolFitxer(es.caib.seycon.ng.model.RolFitxerEntity)
	 */
	public com.soffid.iam.addons.lopd.common.RolFitxer toRolFitxer(
			final com.soffid.iam.addons.lopd.model.RolFitxerEntity entity) {
		RolFitxer rolFitxer = super.toRolFitxer(entity);
		toRolFitxerCustom(entity, rolFitxer);
		return rolFitxer;
	}

	/**
	 * Retrieves the entity object that is associated with the specified value
	 * object from the object store. If no such entity object exists in the
	 * object store, a new, blank entity is created
	 */
	private com.soffid.iam.addons.lopd.model.RolFitxerEntity loadRolFitxerEntityFromRolFitxer(
			com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer) {
		com.soffid.iam.addons.lopd.model.RolFitxerEntity rolFitxerEntity = null;
		if (rolFitxer.getId() != null) {
			rolFitxerEntity = load(rolFitxer.getId());
		}
		if (rolFitxerEntity == null) {
			rolFitxerEntity = newRolFitxerEntity();
		}
		return rolFitxerEntity;
	}

	/**
	 * @see es.caib.seycon.ng.model.RolFitxerEntityDao#rolFitxerToEntity(es.caib.seycon.ng.comu.RolFitxer)
	 */
	public com.soffid.iam.addons.lopd.model.RolFitxerEntity rolFitxerToEntity(
			com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer) {
		com.soffid.iam.addons.lopd.model.RolFitxerEntity entity = this
				.loadRolFitxerEntityFromRolFitxer(rolFitxer);
		this.rolFitxerToEntity(rolFitxer, entity, true);
		return entity;
	}

	public void rolFitxerToEntityCustom(
			com.soffid.iam.addons.lopd.common.RolFitxer source,
			com.soffid.iam.addons.lopd.model.RolFitxerEntity target) {
		RolEntity rolEntity = getRolEntityDao().findByNomRolAndCodiAplicacioAndCodiDispatcher(
				source.getNomRol(), source.getCodiAplicacioRol(), source.getCodiBaseDeDades());
		if (rolEntity == null) {
			throw new SeyconException(String.format(Messages.getString("RolFitxerEntityDaoImpl.3"), source.getNomRol())); //$NON-NLS-1$
		}
		FitxerEntity fitxerEntity = getFitxerEntityDao().findById(
				source.getIdFitxer());
		if (fitxerEntity == null) {
			throw new SeyconException(String.format(Messages.getString("RolFitxerEntityDaoImpl.10"), source.getIdFitxer())); //$NON-NLS-1$
		}
				
		target.setRol(rolEntity);
		target.setFitxer(fitxerEntity);
	}

	/**
	 * @see es.caib.seycon.ng.model.RolFitxerEntityDao#rolFitxerToEntity(es.caib.seycon.ng.comu.RolFitxer,
	 *      es.caib.seycon.ng.model.RolFitxerEntity)
	 */
	public void rolFitxerToEntity(com.soffid.iam.addons.lopd.common.RolFitxer source,
			com.soffid.iam.addons.lopd.model.RolFitxerEntity target, boolean copyIfNull) {
		super.rolFitxerToEntity(source, target, copyIfNull);
		rolFitxerToEntityCustom(source, target);
	}

	public void create(Collection entities) {
		if (entities!=null) for (Iterator it = entities.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof RolFitxerEntity) {
				RolFitxerEntity entity = (RolFitxerEntity) obj;
				this.create(entity); // cridem al mètode 1 per 1
			}
		}
	}

	public void update(Collection entities) {
		if (entities!=null) for (Iterator it = entities.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof RolFitxerEntity) {
				RolFitxerEntity entity = (RolFitxerEntity) obj;
				this.update(entity);// cridem al mètode 1 per 1
			}
		}
	}

	public void remove(Collection entities) {
		if (entities!=null) for (Iterator it = entities.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof RolFitxerEntity) {
				RolFitxerEntity entity = (RolFitxerEntity) obj;
				this.remove(entity);// cridem al mètode 1 per 1
			}
		}
	}

}