package com.orm.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
@Component
public class Employee 
{
	@Id
	@Column(name="id")
	int id;
	@Column(name="firstname")
	String firstName;
	@Column(name="lastname")
	String lastName;
	@Column(name="dept")
	String dept;
	@Column(name="salary")
	int salary;
	
	public Employee() {
		super();
	}
	
	@Autowired
	public Employee(@Value("7") int id,@Value("MNO") String firstName,@Value("Kumar") String lastName,@Value("Sales") String dept,@Value("12000") int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dept = dept;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dept=" + dept
				+ ", salary=" + salary + "]";
	}
}










