package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Dto.Marks;

public class MarksDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	public void Save3(Marks m)
	{
		et.begin();
		em.persist(m);
		et.commit();
	}
	public void edit(Marks user) {
		 et.begin();
		 	em.merge(user);
		 	et.commit();
		 	
	}
	public List<Marks> fetchAll()
	{
		 return em.createQuery("select x from Marks x",Marks.class).getResultList();
	}

	
	
}
