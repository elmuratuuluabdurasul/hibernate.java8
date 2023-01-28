package peaksoft.config;

import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import peaksoft.model.Programmer;

import javax.persistence.EntityManagerFactory;
import java.util.Properties;

public class DatabaseConnection {
    public static EntityManagerFactory createEntityManagerFactory(){
        Properties properties = new Properties();
        properties.setProperty(Environment.DRIVER, "org.postgresql.Driver");
        properties.setProperty(Environment.URL, "jdbc:postgresql://localhost:5432/postgres");
        properties.setProperty(Environment.USER, "postgres");
        properties.setProperty(Environment.PASS, "postgres");
        properties.setProperty(Environment.HBM2DDL_AUTO, "update");
        properties.setProperty(Environment.DIALECT,"org.hibernate.dialect.PostgreSQLDialect");
        properties.setProperty(Environment.SHOW_SQL,"true");
        properties.setProperty(Environment.FORMAT_SQL,"true");

        Configuration configuration = new Configuration();
        configuration.addProperties(properties);
        configuration.addAnnotatedClass(Programmer.class);
        EntityManagerFactory entityManagerFactory = configuration.buildSessionFactory().unwrap(EntityManagerFactory.class);
        return entityManagerFactory;
    }
}
