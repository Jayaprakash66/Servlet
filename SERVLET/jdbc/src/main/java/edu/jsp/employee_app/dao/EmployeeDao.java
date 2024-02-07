package edu.jsp.employee_app.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.employee_app.dto.Employee;

public class EmployeeDao {

	
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	static EntityManager em=emf.createEntityManager();
	static EntityTransaction et=em.getTransaction();
	
	public void saveEmployee(Employee e) {
		
		et.begin();
		em.persist(e);
		et.commit();
	}
	public Employee getEmployeeById(int id) {
		
		return em.find(Employee.class,id);
	}
	
	public void deleteEmployeeById(int id) {
		
		Employee e=em.find(Employee.class, id);
		et.begin();
		em.remove(e);
	    et.commit();
		
	}
}
