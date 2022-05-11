package dao;

import entity.LibraryEntity;

import javax.persistence.EntityManager;

public class LibraryDAO {

    private EntityManager em;

    public LibraryDAO(EntityManager em) {
        this.em = em;
    }

    public void saveLibrary(LibraryEntity library){
        em.persist(library);
        System.out.println("Library with name " + library.getLibraryName() + " was created");
    }
}
