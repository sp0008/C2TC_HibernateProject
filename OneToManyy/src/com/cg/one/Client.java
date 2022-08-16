package com.cg.one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Department d1=new Department();
		d1.setId(10);
		d1.setName("Marketing");
		
		Employee e1=new Employee();
		e1.setId(100);
		e1.setName("Nila");
		e1.setSalary(10000);
		
		d1.addEmployee(e1);
		
		manager.persist(d1);
		manager.getTransaction().commit();
		System.out.println("Department is created and employee details are added");
		
		manager.close();
		factory.close();
	}
}
