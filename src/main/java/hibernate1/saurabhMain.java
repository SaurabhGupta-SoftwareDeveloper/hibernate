package hibernate1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class saurabhMain {

	public static void main(String[] args) throws IOException {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("villain");
		EntityManager m=f.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
		Scanner sc=new Scanner(System.in);
		saurabh s1= new saurabh();
		System.out.println("Enter name");
		s1.setName(sc.nextLine());
		System.out.println("Enter number");
		s1.setNumber(sc.nextLong());
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter address");
		s1.setName(sc2.nextLine());
		
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter image path");
		FileInputStream f1=new FileInputStream(sc3.nextLine());
		byte [] arr= new byte[f1.available()];
		f1.read(arr);
		s1.setImage(arr);
		t.begin();
		m.persist(s1);
		t.commit();
		
	}
}
