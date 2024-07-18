package com.orm.daofiles;

import org.hibernate.SessionFactory;

import com.orm.entity.Employee;

public interface EmployeeDAO 
{
	void insert(Employee e);
}
