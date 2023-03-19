package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToManyMain 
{
public static void main(String[] args) 
{
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	Mobile mobile1=new Mobile();
	mobile1.setBrand("Iphone");
	mobile1.setCost(70000);
	mobile1.setColor("Black");
	mobile1.setRam("3g");
	
	Mobile mobile2=new Mobile();
	mobile2.setBrand("Samsung");
	mobile2.setCost(50000);
	mobile2.setColor("white");
	mobile2.setRam("4g");
	
	Sim sim1=new Sim();
	sim1.setProvider("jio");
	sim1.setType("4g");
	sim1.setCost(299);
	sim1.setPhno(7780504072l);
	
	Sim sim2=new Sim();
	sim2.setProvider("vodaphone");
	sim2.setType("3g");
	sim2.setCost(199);
	sim2.setPhno(8880504072l);
	
	Sim sim3=new Sim();
	sim3.setProvider("idea");
	sim3.setType("2g");
	sim3.setCost(399);
	sim3.setPhno(9980504072l);
	
	Sim sim4=new Sim();
	sim4.setProvider("airtel");
	sim4.setType("5g");
	sim4.setCost(499);
	sim4.setPhno(6680504072l);
	
	List<Sim> list1=new ArrayList<Sim>();
	list1.add(sim1);
	list1.add(sim2);
	
	List<Sim> list2=new ArrayList<Sim>();
	list2.add(sim3);
	list2.add(sim4);
	
	mobile1.setSims(list1);
	mobile2.setSims(list2);
	
//	entityTransaction.begin();
//	entityManager.persist(mobile1);
//	entityManager.persist(mobile2);
//	entityManager.persist(sim1);
//	entityManager.persist(sim2);
//	entityManager.persist(sim3);
//	entityManager.persist(sim4);
//	entityTransaction.commit();
	
	Mobile mobile=entityManager.find(Mobile.class,1);
	System.out.println(mobile.getBrand());
	Sim sim=entityManager.find(Sim.class, 1);
	System.out.println(sim.getProvider());
	
}
}
