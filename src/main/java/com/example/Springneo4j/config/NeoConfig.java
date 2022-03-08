package com.example.Springneo4j.config;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

//@ComponentScan(basePackages = { "com.baeldung.spring.data.neo4j.services" })
@Configuration
@EnableNeo4jRepositories(basePackages = "com.example.Springneo4j.repository")
public class NeoConfig {

    public static final String URL ="http://neo4j:book@localhost:7474";

    @Bean
    public org.neo4j.ogm.config.Configuration getConfiguration() {
        return new org.neo4j.ogm.config.Configuration.Builder().uri(URL).build();
    }

    @Bean
    public SessionFactory getSessionFactory() {
        return new SessionFactory(getConfiguration(), "com.example.Springneo4j.node");
    }
}

