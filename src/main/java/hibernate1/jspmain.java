package hibernate1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class jspmain {
  public static void main(String[] args) throws IOException {
	EntityManagerFactory f=Persistence.createEntityManagerFactory("villain");
	EntityManager m=f.createEntityManager();
	EntityTransaction t=m.getTransaction();
	
	jspider j=new jspider();
	j.setAddress("bengaluru");
	j.setName("saurabh");
	
	
	FileInputStream f1=new FileInputStream("C:\\Users\\balen\\Downloads\\photo1.jpeg");
	byte []b= new byte[f1.available()];
	f1.read(b);
	
	
	j.setImage(b);
	t.begin();
	m.persist(j);
	t.commit();
}
}
