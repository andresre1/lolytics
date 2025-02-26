package com.lolytics;

import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
class TestcontainersConfiguration {

//    @Bean
//    @ServiceConnection
//    PostgreSQLContainer<?> postgresContainer() {
//        PostgreSQLContainer<?> postgreSQLContainer =
//                new PostgreSQLContainer("postgres:latest")
//                        .withDatabaseName("library_test")
//                        .withUsername("dev")
//                        .withPassword("pass");
//        postgreSQLContainer.setPortBindings(List.of("30000:5432"));
//        return postgreSQLContainer;
//    }
}
