package com.capgemini.jpa.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		FeeDetails feeDetails = em.find(FeeDetails.class, 1);
		System.out.println(feeDetails.getTotalFees()+feeDetails.getNoOfInstallments());
		Courses courses = em.find(Courses.class, 1);
		System.out.println(courses.getC_name()+courses.getFeeDetails());

	}

}
