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

public abstract class AbstractHibernateTest extends TestCase
{
	private BeanFactoryReference beanFactoryReference;
	protected ApplicationContext context;
	protected Session session;
	private SessionFactory sf;

	@Override
	protected void setUp() throws Exception
	{
		super.setUp();
		CustomDialect.dialectClass = HSQLDialect.class;
		org.springframework.beans.factory.access.BeanFactoryLocator beanFactoryLocator =
		org.springframework.context.access.ContextSingletonBeanFactoryLocator.getInstance("testBeanRefFactory.xml");
		this.beanFactoryReference = beanFactoryLocator.useBeanFactory("beanRefFactory");
		context = (org.springframework.context.ApplicationContext)this.beanFactoryReference.getFactory();
		sf = (SessionFactory) context.getBean("sessionFactory");
		session = sf.openSession();
	}

	@Override
	protected void tearDown() throws Exception
	{
		session.close();
		sf.close();
	}
}
