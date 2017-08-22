package com.loan.a.pound.core.managers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LoanAPoundPersistanceManger {

  public static EntityManager getPersistenceManager() {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jcg-JPA");
    return emf.createEntityManager();

//    em.getTransaction().begin();
//    Employee employee = new Employee();
//    employee.setName("Chandan");
//    System.out.println("COMIITING");
//    em.persist(employee);
//    em.getTransaction().commit();


  }

}
