package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Dto.Student;
import Dto.Teacher;


public class TeacherDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void save1(Teacher T)
	{
		et.begin();
		em.persist(T);
		et.commit();
		
	}
	public Teacher find(String email)
	{
List<Teacher> users  =em.createQuery("select x from Teacher x where email=?1").setParameter(1, email).getResultList();
	    if(users.isEmpty())
	    {
	    	return null;
	    }
	    else {
	    	return users.get(0);
	    }
	}
}