package com.example.springjpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-hibernate-mysql");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Book book = new Book();
        book.setAuthor("LL");
        book.setName("data Api");
        entityManager.persist(book);
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
