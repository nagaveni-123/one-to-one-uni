package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveTeacherSubjectDeatils {

	public static void main(String[] args) {
		Teacher teacher1=new Teacher();
		teacher1.setName("Sumathi");
		teacher1.setGender("Female");
		List<Subject> li=new ArrayList();
		Subject s=new Subject();
		s.setDays(23);
		s.setName("English");
		Subject s1=new Subject();
		s1.setDays(42);
		s1.setName("Hindi");
		li.add(s);
		li.add(s1);
		teacher1.setSub(li);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=em.getTransaction();
		entityTransaction.begin();
		em.persist(teacher1);
		em.persist(s1);
		em.persist(s);
		entityTransaction.commit();
		
		
	}

}
