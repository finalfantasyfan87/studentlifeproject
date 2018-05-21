package jhaywoo2.depaul.studentlife.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.net.URISyntaxException;
import java.util.Properties;


@Configuration
@ComponentScan(basePackages = "jhaywoo2.depaul.studentlife")
@EnableJpaRepositories(basePackages = "jhaywoo2.depaul.studentlife.repository")
@EnableTransactionManagement
@EnableJpaAuditing
public class DatasourceConfiguration {
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws URISyntaxException {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setDatabase(Database.MYSQL);
        vendorAdapter.setGenerateDdl(true);
        em.setJpaProperties(databaseProperties());
        em.setDataSource(localDataSource());
        em.setPackagesToScan("jhaywoo2.depaul.studentlife.model");
        em.setJpaVendorAdapter(vendorAdapter);

        return em;
    }

     @Bean
    public DataSource localDataSource() {
        JndiDataSourceLookup jndiLookUp = new JndiDataSourceLookup();
        jndiLookUp.setResourceRef(true);
        return jndiLookUp.getDataSource(databaseProperties().getProperty("jndiName"));
    }
/**  @Bean
    public BasicDataSource dataSource() throws URISyntaxException {
        String dbUrl = System.getenv("JDBC_DATABASE_URL");
        String username = System.getenv("JDBC_DATABASE_USERNAME");
        String password = System.getenv("JDBC_DATABASE_PASSWORD");

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(dbUrl);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);

        return basicDataSource;
    }**/

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(emf);
        return transactionManager;
    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }

    Properties databaseProperties() {
        Properties properties = new Properties();
        properties.setProperty("jndiName","jdbc/StudentLife");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        properties.setProperty("spring.datasource.testWhileIdle", "true");
        properties.setProperty("testOnBorrow","true");
        properties.setProperty("spring.datasource.timeBetweenEvictionRunsMillis", "200000");

        return properties;
    }
}
