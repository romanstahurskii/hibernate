import dao.LibraryDAO;
import entity.BookEntity;
import entity.LibraryEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("lesson");
        EntityManager em = factory.createEntityManager();

        LibraryDAO libraryDAO = new LibraryDAO(em);

        em.getTransaction().begin();

        LibraryEntity library = LibraryEntity.builder().libraryName("Kolosok").build();
        libraryDAO.saveLibrary(library);
        em.getTransaction().commit();
        em.close();
        factory.close();
    }
}
