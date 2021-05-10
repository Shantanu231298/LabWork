package com.cg.jhd.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.cg.jhd.util.JPAUtil;
import com.cg.lab1.entity.Author;

public class CRUDOperation {
	Scanner sc = new Scanner(System.in);
	public void insertAuthor() {
	EntityManagerFactory factory=JPAUtil.getEntityManagerFactory();
	EntityManager em=factory.createEntityManager();
	EntityTransaction txn=em.getTransaction();
	System.out.println("Enter The First Name");
	String fName=sc.next();
	System.out.println("Enter The middle Name");
	String mName=sc.next();
	System.out.println("Enter The last Name");
	String lName=sc.next();
	System.out.println("Enter The phone no");
	String phoneNo=sc.next();
	Author author= new Author(fName, mName, lName, phoneNo);
	txn.begin();
	em.persist(author);
	txn.commit();
	JPAUtil.shutdown();
	}
	
	public void updateAuthor() {
		EntityManagerFactory factory= JPAUtil.getEntityManagerFactory();
		EntityManager em= factory.createEntityManager();
		EntityTransaction txn= em.getTransaction();
		System.out.println("Enter the author id");
		Long id=sc.nextLong();
		Author author = em.find(Author.class,id);
		System.out.println("Enter The First Name");
		String fName=sc.next();
		System.out.println("Enter The middle Name");
		String mName=sc.next();
		System.out.println("Enter The last Name");
		String lName=sc.next();
		System.out.println("Enter The phone no");
		String phoneNo=sc.next();
		txn.begin();
		author.setFirstName(fName);
		author.setMiddleName(mName);
		author.setLastName(lName);
		author.setPhoneNo(phoneNo);
		txn.commit();
		JPAUtil.shutdown();
		
	}
	public void deleteAuthor() {
		EntityManagerFactory factory= JPAUtil.getEntityManagerFactory();
		EntityManager em= factory.createEntityManager();
		EntityTransaction txn= em.getTransaction();
		System.out.println("Enter the author id");
		Long id=sc.nextLong();
		Author author = em.find(Author.class,id);
		txn.begin();
		em.remove(author);
		txn.commit();
		JPAUtil.shutdown();
	}
	
	public void displayAuthor() {
		EntityManagerFactory factory= JPAUtil.getEntityManagerFactory();
		EntityManager em= factory.createEntityManager();
		EntityTransaction txn= em.getTransaction();
		txn.begin();
		System.out.println("Enter the author id");
		Long id=sc.nextLong();
		Author author = em.find(Author.class,id);
		System.out.println("Author ID:" +author.getAuthorId());
		System.out.println("First Name:" +author.getFirstName());
		System.out.println("Middle Name:" +author.getMiddleName());
		System.out.println("Last Name:" +author.getPhoneNo());
		txn.commit();
		JPAUtil.shutdown();
	}
	
}
