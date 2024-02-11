package hibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class empMainClass {
public static void main(String[] args) {
	EntityManagerFactory f=Persistence.createEntityManagerFactory("");
	EntityManager m=f.createEntityManager();
	EntityTransaction t=m.getTransaction();
}
}
