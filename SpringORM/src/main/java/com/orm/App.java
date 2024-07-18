package com.orm;

import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.daofiles.EmployeeDAO;
import com.orm.daofiles.EmployeeDAOImpl;
import com.orm.entity.Employee;

public class App 
{
  public static void main(String[] args) 
  {
	  ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");  
	  
	  Employee emp1 = (Employee) ac.getBean("employee");
	  EmployeeDAO edao = (EmployeeDAOImpl) ac.getBean("edao");
	  
	  edao.insert(emp1);
	  System.out.println("Success");
  }
}
