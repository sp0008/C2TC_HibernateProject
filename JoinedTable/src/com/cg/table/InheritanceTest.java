package com.cg.table;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//Create One Employee
		Employee employee = new Employee();
		employee.setName("Arnav");
		employee.setSalary(10000);
		em.persist(employee);
		
		//Create One Manager
		Manager manager= new Manager();
		manager.setName("Kavya");
		manager.setSalary(20000);
		manager.setDepartmentName("C2TC");
		em.persist(manager);
		
		
		em.getTransaction().commit();
		
		System.out.println("Added One Employee and Manager");
		
		em.close();
		
		factory.close();

	}


}
