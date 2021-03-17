package com.mixamus.buildingrest.payroll.repository;

import com.mixamus.buildingrest.payroll.domain.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Employee("Bilbo Baggings", "bulgar")));
            log.info("Preloading " + repository.save(new Employee("Frodo Baggings", "thief")));
            log.info("Preloading " + repository.save(new Employee("Max Dokuchaev", "american")));
            log.info("Preloading " + repository.save(new Employee("Melisa Frisman", "american")));
        };
    }
}
