package io.github.itgumby;

import java.net.URL;
import java.time.LocalDate;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class JPAExampleTest {

    private SessionFactory sessionFactory;

    @BeforeEach
    protected void setUp() {
        // based on https://docs.jboss.org/hibernate/orm/7.1/quickstart/html_single/
        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry =
                new StandardServiceRegistryBuilder().build();
        try {
            sessionFactory = new MetadataSources(registry)
                            .addAnnotatedClass(Meet.class)
                            .buildMetadata()
                            .buildSessionFactory();
        }
        catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we
            // had trouble building the SessionFactory so destroy it manually.
            System.out.println("\nEXCEPTION: " + e.getClass().getSimpleName() + "[" + e.getMessage() + "]\n");
            StandardServiceRegistryBuilder.destroy(registry);
        }
        System.out.println("TEST SET-UP: sessionFactory=" + sessionFactory);
    }

    @AfterEach
    protected void teardown() throws Exception {
        if (null != sessionFactory) {
            sessionFactory.close();
        }
    }

    @Test
    void saveMyFirstEntity() {
        URL url = null;
        Meet meet = new Meet();
        meet.setYear(2025);
        meet.setName("Test Meet");
        meet.setDate(LocalDate.now());
        meet.setLocation("Anytown, USA");
        meet.setTemperature(70);
        meet.setWeather("sunny");
        meet.setUrl(url);

        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            session.persist(meet);

            session.getTransaction().commit();
        } // auto-close session
    }

    @Disabled
    @Test
    public void shouldFetchRecordFromTable() {
        Meet meet = new Meet(); // how???
        Assertions.assertEquals(meet.getName(), "Liberty Bell");
    }
}