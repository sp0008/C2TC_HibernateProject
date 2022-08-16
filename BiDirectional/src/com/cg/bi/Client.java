package com.cg.bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	
public static void main(String[] args) {		
EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
EntityManager manager=factory.createEntityManager();

manager.getTransaction().begin();

Student student=new Student();
student.setName("Lekha");

Address address= new Address();
address.setStreet("XYZ");
address.setCity("bangalore");
address.setState("Karnataka");
address.setZipcode("560034");

student.setAddress(address);

manager.persist(student);
manager.getTransaction().commit();
System.out.println("One student and address details are added");
manager.close();
factory.close();
}
}

