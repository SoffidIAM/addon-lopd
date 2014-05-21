// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package com.soffid.iam.addons.lopd.model;

import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

import es.caib.seycon.ng.PrincipalStore;
import es.caib.seycon.ng.comu.Auditoria;
import com.soffid.iam.addons.lopd.common.Fitxer;
import es.caib.seycon.ng.exception.SeyconException;
import es.caib.seycon.ng.model.AuditoriaEntity;
import es.caib.seycon.ng.model.GrupEntity;
import es.caib.seycon.ng.model.UsuariEntity;
import es.caib.seycon.ng.utils.ExceptionTranslator;
import es.caib.seycon.ng.utils.Security;

/**
 * @see com.soffid.iam.addons.lopd.model.FitxerEntity
 */
public class FitxerEntityDaoImpl extends
		com.soffid.iam.addons.lopd.model.FitxerEntityDaoBase {

	private void auditarLlistaDeCorreu(String accio, Long idFitxer) {
		Principal principal = Security.getPrincipal();
		String codiUsuari = principal!=null ? principal.getName() : "SEYCON"; //$NON-NLS-1$
		Auditoria auditoria = new Auditoria();
		auditoria.setAccio(accio);
		auditoria.setFitxer(idFitxer);
		auditoria.setAutor(codiUsuari);
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				Messages.getString("FitxerEntityDaoImpl.dateFormat")); //$NON-NLS-1$
		auditoria.setData(dateFormat.format(GregorianCalendar.getInstance()
				.getTime()));
		auditoria.setObjecte("SC_FITXER"); //$NON-NLS-1$
		AuditoriaEntity auditoriaEntity = getAuditoriaEntityDao()
				.auditoriaToEntity(auditoria);
		getAuditoriaEntityDao().create(auditoriaEntity);
	}
	
	
	public void create(com.soffid.iam.addons.lopd.model.FitxerEntity fitxer)
			throws RuntimeException {
		try {
			super.create(fitxer);
			getSession(false).flush();
			auditarLlistaDeCorreu("C", fitxer.getId()); //$NON-NLS-1$
		} catch (Throwable e) {
			String message = ExceptionTranslator.translate(e);
			throw new SeyconException(String.format(Messages.getString("FitxerEntityDaoImpl.errorCreating"),  //$NON-NLS-1$
					fitxer.getNom(), 
					message));
		}
	}

	public void remove(com.soffid.iam.addons.lopd.model.FitxerEntity fitxer)
			throws RuntimeException {
		try {
			Long idFitxer = fitxer.getId();
			super.remove(fitxer);
			getSession(false).flush();
			auditarLlistaDeCorreu("D", idFitxer); //$NON-NLS-1$
		} catch (Throwable e) {
			String message = ExceptionTranslator.translate(e);
			throw new SeyconException(String.format(Messages.getString("FitxerEntityDaoImpl.errorDeleting"),  //$NON-NLS-1$
					fitxer.getNom(), 
					message));
		}
	}

	public void update(com.soffid.iam.addons.lopd.model.FitxerEntity fitxer)
			throws RuntimeException {
		try {
			super.update(fitxer);
			getSession(false).flush();
			auditarLlistaDeCorreu("U", fitxer.getId()); //$NON-NLS-1$
		} catch (Throwable e) {
			String message = ExceptionTranslator.translate(e);
			throw new SeyconException(String.format(Messages.getString("FitxerEntityDaoImpl.errorUpdating"),  //$NON-NLS-1$
					fitxer.getNom(), 
					message));
		}
	}

	public void toFitxer(com.soffid.iam.addons.lopd.model.FitxerEntity sourceEntity,
			com.soffid.iam.addons.lopd.common.Fitxer targetVO) {
		super.toFitxer(sourceEntity, targetVO);
		toFitxerCustom(sourceEntity, targetVO);
	}

	public void toFitxerCustom(
			com.soffid.iam.addons.lopd.model.FitxerEntity sourceEntity,
			com.soffid.iam.addons.lopd.common.Fitxer targetVO) {
		UsuariEntity usuari = sourceEntity.getResponsable();
		if (usuari != null) {
			targetVO.setResponsable(usuari.getCodi());
		}
		usuari = sourceEntity.getResponsableSeguretatTecnic();
		if (usuari != null) {
			targetVO.setResponsableSeguretatTecnic(usuari.getCodi());
		}
		GrupEntity direccioGeneral = sourceEntity.getDireccioGeneral();
		
		if (direccioGeneral != null) {
			targetVO.setDireccioGeneral(direccioGeneral.getCodi());
			//GrupEntity conselleria = direccioGeneral.getPare();
			//if (conselleria != null) {
				//targetVO.setConselleria(conselleria.getCodi());
			//}
			targetVO.setConselleria(direccioGeneral.getCodi());	//Afegit Rosa 
		}
		String registrat = sourceEntity.getRegistratAPD();
		targetVO.setRegistratAPD(new Boolean(registrat.compareTo("SI") == 0)); //$NON-NLS-1$

		Date dataBaixa = sourceEntity.getDataBaixa();
		if (dataBaixa != null) {
			Calendar calendar = GregorianCalendar.getInstance();
			calendar.setTime(dataBaixa);
			targetVO.setDataBaixaAPD(calendar);
		}
		Date dataRegistre = sourceEntity.getDataRegistreAPD();
		if (dataRegistre != null) {
			Calendar calendar = GregorianCalendar.getInstance();
			calendar.setTime(dataRegistre);
			targetVO.setDataRegistre(calendar);
		}

	}

	/**
	 * @see es.caib.seycon.ng.model.FitxerEntityDao#toFitxer(es.caib.seycon.ng.model.FitxerEntity)
	 */
	public com.soffid.iam.addons.lopd.common.Fitxer toFitxer(
			final com.soffid.iam.addons.lopd.model.FitxerEntity entity) {
		Fitxer fitxer = super.toFitxer(entity);
		return fitxer;
	}

	/**
	 * Retrieves the entity object that is associated with the specified value
	 * object from the object store. If no such entity object exists in the
	 * object store, a new, blank entity is created
	 */
	private com.soffid.iam.addons.lopd.model.FitxerEntity loadFitxerEntityFromFitxer(
			com.soffid.iam.addons.lopd.common.Fitxer fitxer) {
		FitxerEntity fitxerEntity = null;
		if (fitxer.getId() != null) {
			fitxerEntity = load(fitxer.getId());
		}
		if (fitxerEntity == null) {
			fitxerEntity = newFitxerEntity();
		}
		return fitxerEntity;
	}

	/**
	 * @see es.caib.seycon.ng.model.FitxerEntityDao#fitxerToEntity(es.caib.seycon.ng.Fitxer)
	 */
	public com.soffid.iam.addons.lopd.model.FitxerEntity fitxerToEntity(
			com.soffid.iam.addons.lopd.common.Fitxer fitxer) {
		FitxerEntity fitxerEntity = loadFitxerEntityFromFitxer(fitxer);
		this.fitxerToEntity(fitxer, fitxerEntity, true);
		return fitxerEntity;
	}

	public void fitxerToEntityCustom(com.soffid.iam.addons.lopd.common.Fitxer sourceVO,
			com.soffid.iam.addons.lopd.model.FitxerEntity targetEntity) {
		//String codiDireccioGeneral = sourceVO.getDireccioGeneral();
		String unitatOrganitzativa = sourceVO.getConselleria();	//Afegit Rosa
		//GrupEntity grupEntity = getGrupEntityDao().findByCodi(codiDireccioGeneral);
		GrupEntity grupEntity = getGrupEntityDao().findByCodi(unitatOrganitzativa);	//Afegit Rosa
		if (grupEntity != null) {
			targetEntity.setDireccioGeneral(grupEntity);
		} else {
			throw new SeyconException(String.format(Messages.getString("FitxerEntityDaoImpl.wrongGroup"),  //$NON-NLS-1$
					unitatOrganitzativa));
		}
		String codiResponsable = sourceVO.getResponsable();
		if (codiResponsable == null
				|| codiResponsable.trim().compareTo("") == 0) { //$NON-NLS-1$
			throw new SeyconException(
					Messages.getString("FitxerEntityDaoImpl.missingPersonInCharge")); //$NON-NLS-1$
		}
		UsuariEntity usuari = getUsuariEntityDao().findByCodi(codiResponsable);
		if (usuari != null) {
			targetEntity.setResponsable(usuari);
		} else {
			throw new SeyconException(String.format(Messages.getString("FitxerEntityDaoImpl.wrongUser"),  //$NON-NLS-1$
					codiResponsable));
		}
		String codiResponsableTecnic = sourceVO.getResponsableSeguretatTecnic();
		if (codiResponsableTecnic != null
				&& codiResponsableTecnic.trim().compareTo("") != 0) { //$NON-NLS-1$
			usuari = getUsuariEntityDao().findByCodi(codiResponsableTecnic);
			if (usuari != null) {
				targetEntity.setResponsableSeguretatTecnic(usuari);
			} else {
				throw new SeyconException(String.format(Messages.getString("FitxerEntityDaoImpl.wrongUser"),  //$NON-NLS-1$
						codiResponsableTecnic));
			}
		}

		if (sourceVO.getRegistratAPD() != null) {
			targetEntity.setRegistratAPD(sourceVO.getRegistratAPD()
					.booleanValue() ? "SI" : "NO"); //$NON-NLS-1$ //$NON-NLS-2$
		} else {
			targetEntity.setRegistratAPD("NO"); //$NON-NLS-1$
		}

		Calendar dataRegistre = sourceVO.getDataRegistre();
		if (dataRegistre != null) {
			targetEntity.setDataRegistreAPD(dataRegistre.getTime());
		} else {
			targetEntity.setDataRegistreAPD(null);
		}
		Calendar dataBaixaAPD = sourceVO.getDataBaixaAPD();
		if (dataBaixaAPD != null) {
			targetEntity.setDataBaixa(dataBaixaAPD.getTime());
		} else {
			targetEntity.setDataBaixa(null);
		}
	}

	/**
	 * @see es.caib.seycon.ng.model.FitxerEntityDao#fitxerToEntity(es.caib.seycon.ng.Fitxer,
	 *      es.caib.seycon.ng.model.FitxerEntity)
	 */
	public void fitxerToEntity(com.soffid.iam.addons.lopd.common.Fitxer sourceVO,
			com.soffid.iam.addons.lopd.model.FitxerEntity targetEntity,
			boolean copyIfNull) {
		super.fitxerToEntity(sourceVO, targetEntity, copyIfNull);
		fitxerToEntityCustom(sourceVO, targetEntity);
	}
	
	public void create(Collection entities) {
		if (entities!=null) for (Iterator it = entities.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof FitxerEntity) {
				FitxerEntity entity = (FitxerEntity) obj;
				this.create(entity); // cridem al mètode 1 per 1
			}
		}
	}

	public void update(Collection entities) {
		if (entities!=null) for (Iterator it = entities.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof FitxerEntity) {
				FitxerEntity entity = (FitxerEntity) obj;
				this.update(entity);// cridem al mètode 1 per 1
			}
		}
	}

	public void remove(Collection entities) {
		if (entities!=null) for (Iterator it = entities.iterator(); it.hasNext();) {
			Object obj = it.next();
			if (obj instanceof FitxerEntity) {
				FitxerEntity entity = (FitxerEntity) obj;
				this.remove(entity);// cridem al mètode 1 per 1
			}
		}
	}	

}