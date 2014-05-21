//
// (C) 2013 Soffid
// 
// This file is licensed by Soffid under GPL v3 license
//

package com.soffid.iam.addons.lopd.service;
import com.soffid.mda.annotation.*;

import org.springframework.transaction.annotation.Transactional;

@Service ( translatedName="LopdService",
	 translatedPackage="com.soffid.iam.addons.lopd.service")
@Depends ({com.soffid.iam.addons.lopd.model.FitxerEntity.class,
	es.caib.seycon.ng.model.RolEntity.class,
	com.soffid.iam.addons.lopd.model.RolFitxerEntity.class,
	com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity.class,
	com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity.class})
public abstract class LopdService {

	@Operation ( grantees={Roles.lopd_query.class})
	@Transactional(rollbackFor={java.lang.Exception.class})
	public java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> getFitxers()
		throws es.caib.seycon.ng.exception.InternalErrorException {
	 return null;
	}
	@Operation ( grantees={Roles.lopd_create.class,Roles.lopd_update.class})
	@Transactional(rollbackFor={java.lang.Exception.class})
	public com.soffid.iam.addons.lopd.common.Fitxer create(
		com.soffid.iam.addons.lopd.common.Fitxer fitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException {
	 return null;
	}
	@Operation ( grantees={Roles.lopd_update.class})
	@Transactional(rollbackFor={java.lang.Exception.class})
	public com.soffid.iam.addons.lopd.common.Fitxer update(
		com.soffid.iam.addons.lopd.common.Fitxer fitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException {
	 return null;
	}
	@Operation ( grantees={Roles.lopd_delete.class})
	@Transactional(rollbackFor={java.lang.Exception.class})
	public void delete(
		com.soffid.iam.addons.lopd.common.Fitxer fitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException {
	}
	@Operation ( grantees={Roles.lopd_query.class})
	@Transactional(rollbackFor={java.lang.Exception.class})
	public java.util.Collection<es.caib.seycon.ng.comu.Rol> findRolesByIdFitxer(
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException {
	 return null;
	}
	@Operation ( grantees={Roles.lopd_query.class})
	@Transactional(rollbackFor={java.lang.Exception.class})
	public java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> findFitxersByFiltre(
		@Nullable java.lang.String id, 
		@Nullable java.lang.String nom, 
		@Nullable java.lang.String responsable, 
		@Nullable java.lang.String conselleria, 
		@Nullable java.lang.String dg, 
		@Nullable java.lang.String nivell, 
		@Nullable java.lang.String registrat)
		throws es.caib.seycon.ng.exception.InternalErrorException {
	 return null;
	}
	@Operation ( grantees={Roles.lopd_query.class})
	@Transactional(rollbackFor={java.lang.Exception.class})
	public java.util.Collection<com.soffid.iam.addons.lopd.common.Fitxer> findFitxersByNomFitxer(
		@Nullable java.lang.String nomFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException {
	 return null;
	}
	@Operation ( grantees={Roles.lopd_query.class})
	@Transactional(rollbackFor={java.lang.Exception.class})
	public com.soffid.iam.addons.lopd.common.Fitxer findFitxerById(
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException {
	 return null;
	}
	@Operation ( grantees={Roles.lopd_create.class,Roles.lopd_update.class})
	@Transactional(rollbackFor={java.lang.Exception.class})
	public com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer create(
		com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException {
	 return null;
	}
	@Operation ( grantees={Roles.lopd_delete.class})
	@Transactional(rollbackFor={java.lang.Exception.class})
	public void delete(
		com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer responsableSeguretatOrganitzatiuFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException {
	}
	@Operation ( grantees={Roles.lopd_create.class,Roles.lopd_update.class})
	@Transactional(rollbackFor={java.lang.Exception.class})
	public com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer create(
		com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException {
	 return null;
	}
	@Operation ( grantees={Roles.lopd_delete.class})
	@Transactional(rollbackFor={java.lang.Exception.class})
	public void delete(
		com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer administradorSeguretatOrganitzatiuFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException {
	}
	@Operation ( grantees={Roles.lopd_query.class})
	@Transactional(rollbackFor={java.lang.Exception.class})
	public com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer findAdministradorSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(
		java.lang.String codiUsuari, 
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException {
	 return null;
	}
	@Operation ( grantees={Roles.lopd_query.class})
	@Transactional(rollbackFor={java.lang.Exception.class})
	public com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer findResponsableSeguretatOrganitzatiuFitxerByCodiUsuariAndIdFitxer(
		java.lang.String codiUsuari, 
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException {
	 return null;
	}
	@Operation ( grantees={Roles.lopd_query.class})
	@Transactional(rollbackFor={java.lang.Exception.class})
	public java.util.Collection<com.soffid.iam.addons.lopd.common.AdministradorSeguretatOrganitzatiuFitxer> findAdministradorsSeguretatOrganitzatiusFitxerByIdFitxer(
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException {
	 return null;
	}
	@Operation ( grantees={Roles.lopd_query.class})
	@Transactional(rollbackFor={java.lang.Exception.class})
	public java.util.Collection<com.soffid.iam.addons.lopd.common.ResponsableSeguretatOrganitzatiuFitxer> findResponsablesSeguretatOrganitzatiusFitxerByIdFitxer(
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException {
	 return null;
	}
	@Operation ( grantees={Roles.lopd_create.class,Roles.lopd_update.class})
	@Transactional(rollbackFor={java.lang.Exception.class})
	public com.soffid.iam.addons.lopd.common.RolFitxer create(
		com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException {
	 return null;
	}
	@Operation ( grantees={Roles.lopd_delete.class})
	@Transactional(rollbackFor={java.lang.Exception.class})
	public void delete(
		com.soffid.iam.addons.lopd.common.RolFitxer rolFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException {
	}
	@Operation ( grantees={Roles.lopd_query.class})
	@Transactional(rollbackFor={java.lang.Exception.class})
	public java.util.Collection<com.soffid.iam.addons.lopd.common.RolFitxer> findRolsFitxersByIdFitxer(
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException {
	 return null;
	}
	@Operation ( grantees={Roles.lopd_query.class})
	@Transactional(rollbackFor={java.lang.Exception.class})
	public com.soffid.iam.addons.lopd.common.RolFitxer findRolFitxerByNomRolAndIdFitxer(
		java.lang.String nomRol, 
		java.lang.Long idFitxer)
		throws es.caib.seycon.ng.exception.InternalErrorException {
	 return null;
	}
}
