package edu.jsp.employee.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.employee.dto.Employee;

public class EmployeeDao {
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	static EntityManager em=emf.createEntityManager();
	static EntityTransaction et=em.getTransaction();
	
	public void saveEmployee(Employee e) {
		et.begin();
		em.persist(e);
		et.commit();
		System.out.println("Data Inserted");
	}
}
