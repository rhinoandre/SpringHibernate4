package tuto.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void persist(Object entiry){
		getSession().save(entiry);
	}
	
	public void delete(Object entity){
		getSession().delete(entity);
	}
	
}
