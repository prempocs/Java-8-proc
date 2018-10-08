package com.ps.dp.proxy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ps.module.Employee;

public class JPASAmple {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAExamples");
	EntityManager em = emf.createEntityManager();
	public static void main(String[] args) {
		System.out.println(new JPASAmple().em);

	}

}
