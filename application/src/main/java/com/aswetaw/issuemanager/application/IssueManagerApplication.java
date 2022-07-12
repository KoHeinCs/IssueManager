package com.aswetaw.issuemanager.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Hein Htet Aung
 * @created at 25/06/2022
 **/


@SpringBootApplication
@ComponentScan(basePackages = "com.aswetaw.issuemanager")
@EntityScan(basePackages = "com.aswetaw.issuemanager")
@EnableJpaRepositories(basePackages = "com.aswetaw.issuemanager")
public class IssueManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(IssueManagerApplication.class, args);
    }
}
