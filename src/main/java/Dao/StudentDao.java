package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import Dto.Marks;
import Dto.Student;
import Dto.Teacher;


public class StudentDao {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();


public void save(Student s) {
	et.begin();
	em.persist(s);
	et.commit();
}

public Student find(String email)
{

	
	List<Student> users  =em.createQuery("select x from Student x where email=?1").setParameter(1, email).getResultList();
    if(users.isEmpty())
    {
    	return null;
    }
    else {
    	return users.get(0);
    }
}
}
