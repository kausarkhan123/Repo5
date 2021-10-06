package com.accenturee.lkm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilityClass {

	public static EntityManagerFactory getFactory()
	{
		EntityManagerFactory f=Persistence.createEntityManagerFactory("unit1");
		return f;
	}
	public static void main(String[] args) {
		
		EntityManagerFactory f=getFactory();
		EntityManager m=f.createEntityManager();
		if(m!=null)
		{
			System.out.println("connected");
		}
	}

}
