package hibernate2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class jspMain {
public static void main(String[] args) throws IOException {
	EntityManagerFactory f = Persistence.createEntityManagerFactory("villain");
	EntityManager m=f.createEntityManager();
	EntityTransaction t=m.getTransaction();
	
	jsp j= new jsp();
	j.setName("saurabh");
	j.setSalary(34434235.33);
	j.setAge(23);
	
	FileInputStream f1=new FileInputStream("C:\\Users\\balen\\Downloads\\photo1.jpeg");
	byte [] arr= new byte[f1.available()];
	f1.read(arr);
}
}
