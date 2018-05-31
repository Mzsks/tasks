package sk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDao {
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sf;
	public Session openSession(){
		Session session=sf.openSession();
		return session;
	}
	
	/*private static SessionFactory factory;
	public  Session openSession(){
	//	Configuration configuration=new Configuration();
		//configuration.configure("hibernate.cfg.xml");			
		//SessionFactory sessionfactory1=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		//第二步：创建SessionFactory（会话工厂和数据库对应，应该且只有一个对象），
		//该会话工厂用来给以后的每一次数据库操作,提供一个会话对象，操作完毕后，会话对象关闭
		//Configuration configu=new Configuration();
		//factory=configu.configure("hibernate.cfg.xml").buildSessionFactory();
		
		if(factory==null)
			factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			
		//第三步：利用会话工厂创建一个会话对象
		Session session= factory.openSession();
		return session;
	}*/
	public void closesession(Session session){
		if(session!=null)
			session.close();
	}

}
