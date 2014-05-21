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
import es.caib.seycon.ng.model.AuditoriaEntity;

import es.caib.seycon.ng.model.GrupEntity;
import es.caib.seycon.ng.model.UsuariEntity;
import es.caib.seycon.ng.utils.Security;
import es.caib.seycon.ng.comu.Usuari;
import es.caib.seycon.ng.exception.SeyconException;
import es.caib.seycon.ng.utils.ExceptionTranslator;

/**
 * @see com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity
 */
public class ResponsableSeguretatOrganitzatiuFitxerEntityDaoImpl
        extends
        com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntityDaoBase {

    private void auditarResponsableSeguretatOrganitzatiuFitxerEntity(
            String accio, String codiUsuariAuditat, Long fitxer) {
        Principal principal = Security.getPrincipal();
        String codiUsuari = principal != null ? principal.getName() : "SEYCON"; //$NON-NLS-1$
        Auditoria auditoria = new Auditoria();
        auditoria.setAccio(accio);
        auditoria.setUsuari(codiUsuari);
        auditoria.setFitxer(fitxer);
        auditoria.setAutor(codiUsuari);
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "dd/MM/yyyy kk:mm:ss"); //$NON-NLS-1$
        auditoria.setData(dateFormat.format(GregorianCalendar.getInstance()
                .getTime()));
        auditoria.setObjecte(Security.SC_RESP_SEG_ORG_USUARI);

        AuditoriaEntity auditoriaEntity = getAuditoriaEntityDao()
                .auditoriaToEntity(auditoria);
        getAuditoriaEntityDao().create(auditoriaEntity);
    }

    public void update(
            ResponsableSeguretatOrganitzatiuFitxerEntity responsableFitxer) {
        try {
            super.update(responsableFitxer);
            getSession(false).flush();
            auditarResponsableSeguretatOrganitzatiuFitxerEntity("U", //$NON-NLS-1$
                    responsableFitxer.getResponsableSeguretatOrganitzatiu()
                            .getCodi(), responsableFitxer.getFitxer().getId());
        } catch (Throwable e) {
            String message = ExceptionTranslator.translate(e);
			throw new SeyconException(String.format(
					Messages.getString("ResponsableSeguretatOrganitzatiuFitxerEntityDaoImpl.0"),  //$NON-NLS-1$
							responsableFitxer.getResponsableSeguretatOrganitzatiu().getCodi(),
							responsableFitxer.getFitxer().getNom(),
							message));
        }
    }

    public void create(
            com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity responsableFitxer)
            throws RuntimeException {
        try {
            super.create(responsableFitxer);
            getSession(false).flush();
            auditarResponsableSeguretatOrganitzatiuFitxerEntity("C", //$NON-NLS-1$
                    responsableFitxer.getResponsableSeguretatOrganitzatiu()
                            .getCodi(), responsableFitxer.getFitxer().getId());
        } catch (Throwable e) {
            String message = ExceptionTranslator.translate(e);
			throw new SeyconException(String.format(Messages.getString("ResponsableSeguretatOrganitzatiuFitxerEntityDaoImpl.1"),  //$NON-NLS-1$
					responsableFitxer.getResponsableSeguretatOrganitzatiu().getCodi(), 
					responsableFitxer.getFitxer().getNom(), 
					message));
        }
    }

    public void remove(
            com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity responsableFitxer)
            throws RuntimeException {
        try {
            String codiUsuari = responsableFitxer
                    .getResponsableSeguretatOrganitzatiu().getCodi();
            Long idFitxer = responsableFitxer.getFitxer().getId();
            super.remove(responsableFitxer);
            getSession(false).flush();
            auditarResponsableSeguretatOrganitzatiuFitxerEntity("D", //$NON-NLS-1$
                    codiUsuari, idFitxer);
        } catch (Throwable e) {
            String message = ExceptionTranslator.translate(e);
			throw new SeyconException(String.format(
					Messages.getString("ResponsableSeguretatOrganitzatiuFitxerEntityDaoImpl.2"),  //$NON-NLS-1$
							responsableFitxer.getResponsableSeguretatOrganitzatiu().getCodi(), 
							responsableFitxer.getFitxer().getNom(), 
							message));
        }
    }

    public void toResponsableSeguretatOrganitzatiuFitxer(
            com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity sourceEntity,
            com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer targetVO) {
        super.toResponsableSeguretatOrganitzatiuFitxer(sourceEntity, targetVO);
        toResponsableSeguretatOrganitzatiuFitxerCustom(sourceEntity, targetVO);
    }

    public void toResponsableSeguretatOrganitzatiuFitxerCustom(
            com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity sourceEntity,
            com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer targetVO) {
        FitxerEntity fitxer = sourceEntity.getFitxer();
        targetVO.setIdFitxer(fitxer.getId());
        UsuariEntity usuariEntity = sourceEntity
                .getResponsableSeguretatOrganitzatiu();
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
     * @see com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntityDao#toResponsableSeguretatOrganitzatiuFitxer(com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity)
     */
    public com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer toResponsableSeguretatOrganitzatiuFitxer(
            final com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity entity) {
        return super.toResponsableSeguretatOrganitzatiuFitxer(entity);
    }

    /**
     * Retrieves the entity object that is associated with the specified value
     * object from the object store. If no such entity object exists in the
     * object store, a new, blank entity is created
     */
    private com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity loadResponsableSeguretatOrganitzatiuFitxerEntityFromResponsableSeguretatOrganitzatiuFitxer(
            com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer) {
        ResponsableSeguretatOrganitzatiuFitxerEntity responsableSeguretatOrganitzatiuFitxerEntity = null;
        if (responsableSeguretatOrganitzatiuFitxer.getId() != null) {
            responsableSeguretatOrganitzatiuFitxerEntity = load(responsableSeguretatOrganitzatiuFitxer
                    .getId());
        }
        if (responsableSeguretatOrganitzatiuFitxerEntity == null) {
            responsableSeguretatOrganitzatiuFitxerEntity = newResponsableSeguretatOrganitzatiuFitxerEntity();
        }
        return responsableSeguretatOrganitzatiuFitxerEntity;
    }

    /**
     * @see com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntityDao#responsableSeguretatOrganitzatiuFitxerToEntity(com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer)
     */
    public com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity responsableSeguretatOrganitzatiuFitxerToEntity(
            com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer) {
        com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity entity = this
                .loadResponsableSeguretatOrganitzatiuFitxerEntityFromResponsableSeguretatOrganitzatiuFitxer(responsableSeguretatOrganitzatiuFitxer);
        this.responsableSeguretatOrganitzatiuFitxerToEntity(
                responsableSeguretatOrganitzatiuFitxer, entity, true);
        return entity;
    }

    public void responsableSeguretatOrganitzatiuFitxerToEntityCustom(
            com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer sourceVO,
            com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity targetEntity) {
        String codiUsuari = sourceVO.getCodiUsuari();
        UsuariEntity usuari = getUsuariEntityDao().findByCodi(codiUsuari);
        if (usuari == null) {
			throw new SeyconException(String.format(Messages.getString("ResponsableSeguretatOrganitzatiuFitxerEntityDaoImpl.3"), codiUsuari)); //$NON-NLS-1$
        }
        targetEntity.setResponsableSeguretatOrganitzatiu(usuari);

        Long id = sourceVO.getIdFitxer();
        if (id != null) {
            FitxerEntity fitxer = getFitxerEntityDao().findById(id);
            if (fitxer == null) {
				throw new SeyconException(String.format(Messages.getString("ResponsableSeguretatOrganitzatiuFitxerEntityDaoImpl.4"), id)); //$NON-NLS-1$
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
     * @see com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntityDao#responsableSeguretatOrganitzatiuFitxerToEntity(com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer,
     *      com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity)
     */
    public void responsableSeguretatOrganitzatiuFitxerToEntity(
            com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer sourceVO,
            com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity targetEntity,
            boolean copyIfNull) {
        super.responsableSeguretatOrganitzatiuFitxerToEntity(sourceVO,
                targetEntity, copyIfNull);
        responsableSeguretatOrganitzatiuFitxerToEntityCustom(sourceVO,
                targetEntity);
    }

    public void create(Collection entities) {
        if (entities != null)
            for (Iterator it = entities.iterator(); it.hasNext();) {
                Object obj = it.next();
                if (obj instanceof ResponsableSeguretatOrganitzatiuFitxerEntity) {
                    ResponsableSeguretatOrganitzatiuFitxerEntity entity = (ResponsableSeguretatOrganitzatiuFitxerEntity) obj;
                    this.create(entity); // cridem al mètode 1 per 1
                }
            }
    }

    public void update(Collection entities) {
        if (entities != null)
            for (Iterator it = entities.iterator(); it.hasNext();) {
                Object obj = it.next();
                if (obj instanceof ResponsableSeguretatOrganitzatiuFitxerEntity) {
                    ResponsableSeguretatOrganitzatiuFitxerEntity entity = (ResponsableSeguretatOrganitzatiuFitxerEntity) obj;
                    this.update(entity);// cridem al mètode 1 per 1
                }
            }
    }

    public void remove(Collection entities) {
        if (entities != null)
            for (Iterator it = entities.iterator(); it.hasNext();) {
                Object obj = it.next();
                if (obj instanceof ResponsableSeguretatOrganitzatiuFitxerEntity) {
                    ResponsableSeguretatOrganitzatiuFitxerEntity entity = (ResponsableSeguretatOrganitzatiuFitxerEntity) obj;
                    this.remove(entity);// cridem al mètode 1 per 1
                }
            }
    }

}
