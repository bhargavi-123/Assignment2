package com.capgemini.jpa.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Courses courses = new Courses();
		courses.setC_name("java");
		FeeDetails feeDetails = new FeeDetails();
		feeDetails.setNoOfInstallments(2);
		feeDetails.setTotalFees(5000.0);
		courses.setFeeDetails(feeDetails);
		em.persist(courses);
        em.getTransaction().commit();
		
		System.out.println("Added to database");
		em.close();
		factory.close();
		
	}

}
