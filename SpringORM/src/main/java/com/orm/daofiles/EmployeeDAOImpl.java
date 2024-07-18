package com.orm.daofiles;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.orm.entity.Employee;

@Component("edao")
public class EmployeeDAOImpl implements EmployeeDAO 
{
	private Session session;
	private Transaction t;
	
	SessionFactory sessionFactory;
	
	@Autowired
	public EmployeeDAOImpl(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}


	@Override
	public void insert(Employee e) 
	{
		try {
			session = sessionFactory.openSession();
			t = session.beginTransaction();
			session.persist(e);
			t.commit();
			session.close();
		}
		catch(Exception exc)
		{
			
		}
	}
}
