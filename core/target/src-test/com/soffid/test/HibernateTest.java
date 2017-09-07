//
// (C) 2013 Soffid
//
//

package com.soffid.test; 
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.dialect.HSQLDialect;
import org.springframework.beans.factory.access.BeanFactoryReference;
import org.springframework.context.ApplicationContext;
import es.caib.seycon.ng.model.CustomDialect;
import junit.framework.TestCase; 

public class HibernateTest extends AbstractHibernateTest
{
	public void test1_RolFitxerEntity_findByIdFitxerAndNomRol () throws Exception
	{
		org.hibernate.Query q=session.createQuery("from com.soffid.iam.addons.lopd.model.RolFitxerEntity rolFitxer where rolFitxer.fitxer.id = :idFitxer and rolFitxer.rol.nom = :nomRol");
		q.setParameter("idFitxer", new Long(0));
		q.setParameter("nomRol", "");
	}

	public void test2_RolFitxerEntity_findRolsByIdFitxer () throws Exception
	{
		org.hibernate.Query q=session.createQuery("select rolFitxer.rol from com.soffid.iam.addons.lopd.model.RolFitxerEntity rolFitxer where rolFitxer.fitxer.id = :idFitxer");
		q.setParameter("idFitxer", new Long(0));
	}

	public void test3_RolFitxerEntity_findFitxersByNomRol () throws Exception
	{
		org.hibernate.Query q=session.createQuery("select rolFitxer.fitxer from com.soffid.iam.addons.lopd.model.RolFitxerEntity rolFitxer where rolFitxer.rol.nom = :nomRol");
		q.setParameter("nomRol", "");
	}

	public void test4_RolFitxerEntity_findByIdFitxer () throws Exception
	{
		org.hibernate.Query q=session.createQuery("select rolFitxer from com.soffid.iam.addons.lopd.model.RolFitxerEntity rolFitxer where rolFitxer.fitxer.id = :idFitxer");
		q.setParameter("idFitxer", new Long(0));
	}

	public void test5_AdministradorSeguretatOrganitzatiuFitxerEntity_findByCodiUsuariAndIdFitxer () throws Exception
	{
		org.hibernate.Query q=session.createQuery("from com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity administradorFitxer where administradorFitxer.fitxer.id = :idFitxer and administradorFitxer.administradorDeSeguretatOrganitzatiu.codi = :codiUsuari");
		q.setParameter("codiUsuari", "");
		q.setParameter("idFitxer", new Long(0));
	}

	public void test6_AdministradorSeguretatOrganitzatiuFitxerEntity_findByIdFitxer () throws Exception
	{
		org.hibernate.Query q=session.createQuery("select administradorSeguretat\nfrom com.soffid.iam.addons.lopd.model.AdministradorSeguretatOrganitzatiuFitxerEntity administradorSeguretat where administradorSeguretat.fitxer.id = :idFitxer");
		q.setParameter("idFitxer", new Long(0));
	}

	public void test7_ResponsableSeguretatOrganitzatiuFitxerEntity_findByCodiUsuariAndIdFitxer () throws Exception
	{
		org.hibernate.Query q=session.createQuery("from com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity responsableFitxer where  responsableFitxer.fitxer.id = :idFitxer and responsableFitxer.responsableSeguretatOrganitzatiu.codi = :codiUsuari");
		q.setParameter("codiUsuari", "");
		q.setParameter("idFitxer", new Long(0));
	}

	public void test8_ResponsableSeguretatOrganitzatiuFitxerEntity_findByIdFitxer () throws Exception
	{
		org.hibernate.Query q=session.createQuery("select responsableSeguretat\nfrom com.soffid.iam.addons.lopd.model.ResponsableSeguretatOrganitzatiuFitxerEntity responsableSeguretat where responsableSeguretat.fitxer.id = :idFitxer");
		q.setParameter("idFitxer", new Long(0));
	}

	public void test9_FitxerEntity_findFitxersByFiltre () throws Exception
	{
		org.hibernate.Query q=session.createQuery("select fitxerEntity from com.soffid.iam.addons.lopd.model.FitxerEntity fitxerEntity\nleft join fitxerEntity.direccioGeneral as direccioGeneralEntity\nleft join direccioGeneralEntity.pare as conselleriaEntity\nleft join fitxerEntity.responsable as responsableEntity\nwhere  \n(:dataMax = :nullDate or fitxerEntity.dataRegistreAPD < :dataMax ) and\n(:dataMin = :nullDate or fitxerEntity.dataRegistreAPD > :dataMin ) and\n(:id is null or fitxerEntity.id like :id) and\n(:nom is null or fitxerEntity.nom like :nom) and\n(:nivell is null or fitxerEntity.nivell like :nivell) and\n(:conselleria is null or conselleriaEntity.codi like :conselleria) and\n(:dg is null or direccioGeneralEntity.codi like :dg) and\n(:responsable is null or responsableEntity.codi like :responsable)");
		q.setParameter("id", new Long(0));
		q.setParameter("nom", "");
		q.setParameter("responsable", "");
		q.setParameter("conselleria", "");
		q.setParameter("dg", "");
		q.setParameter("nivell", "");
		q.setParameter("nullDate", new java.util.Date());
		q.setParameter("dataMax", new java.util.Date());
		q.setParameter("dataMin", new java.util.Date());
	}

	public void test10_FitxerEntity_findFitxersByFiltre () throws Exception
	{
		org.hibernate.Query q=session.createQuery("select fitxerEntity from com.soffid.iam.addons.lopd.model.FitxerEntity fitxerEntity\nleft join fitxerEntity.direccioGeneral as direccioGeneralEntity\nleft join direccioGeneralEntity.pare as conselleriaEntity\nleft join fitxerEntity.responsable as responsableEntity\nwhere\n(:id is null or fitxerEntity.id like :id) and\n(:nom is null or fitxerEntity.nom like :nom) and\n(:nivell is null or fitxerEntity.nivell like :nivell) and\n(:conselleria is null or conselleriaEntity.codi like :conselleria) and\n(:dg is null or direccioGeneralEntity.codi like :dg) and\n(:responsable is null or responsableEntity.codi like :responsable)");
		q.setParameter("id", new Long(0));
		q.setParameter("nom", "");
		q.setParameter("responsable", "");
		q.setParameter("conselleria", "");
		q.setParameter("dg", "");
		q.setParameter("nivell", "");
	}

	public void test11_FitxerEntity_findByNomAndDireccioGeneral () throws Exception
	{
		org.hibernate.Query q=session.createQuery("select fitxerEntity \nfrom com.soffid.iam.addons.lopd.model.FitxerEntity fitxerEntity \nleft join fitxerEntity.direccioGeneral direccioGeneral \nwhere \n(fitxerEntity.nom = :nom) and \n(\n    (direccioGeneral is null and :direccioGeneral is null) \n     or \n    (direccioGeneral is not null and direccioGeneral.codi =       :direccioGeneral) \n)");
		q.setParameter("nom", "");
		q.setParameter("direccioGeneral", "");
	}

	public void testDummy() throws Exception
	{
	}

}
