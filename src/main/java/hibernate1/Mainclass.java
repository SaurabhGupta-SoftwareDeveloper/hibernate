package hibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mainclass {
	public static void main(String[] args) {
		EntityManagerFactory f= Persistence.createEntityManagerFactory("villain");
		EntityManager m=f.createEntityManager();
		EntityTransaction t=m.getTransaction();
		student s= new student();
		s.setAddress("beng");
		s.setId(1);
		s.setName("saurabh");
		t.begin();
		m.persist(s);
		t.commit();
		}

}
