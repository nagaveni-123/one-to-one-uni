package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudentCourserDetails {

	public static void main(String[] args) {
		Student student=new Student();
		student.setName("maga");
		student.setEmail("ajjs@gmail.com");
		
		Student student2=new Student();
		student2.setName("Bavani");
		student2.setEmail("hshsh@gmail.com");
		
		List<Course> course=new ArrayList();
		
		Course c=new Course();
		c.setName("Physics science");
		c.setCost(25000);
		
		Course c1=new Course();
		c1.setName("English");
		c1.setCost(36000);
		
	    course.add(c1);
	    course.add(c);
		student.setCourse(course);
		student2.setCourse(course);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
				
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(student2);
		entityManager.persist(c1);
		entityManager.persist(c);
		entityTransaction.commit();

	}

}
