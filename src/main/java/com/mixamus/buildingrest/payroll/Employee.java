package com.mixamus.buildingrest.payroll;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
}

/*
Репозитории Spring Data JPA - это интерфейсы с методами, поддерживающими создание, чтение,
обновление и удаление записей из внутреннего хранилища данных. Некоторые репозитории также
поддерживают разбиение на страницы и сортировку данных, где это необходимо. Spring Data
синтезирует реализации на основе соглашений, найденных в именовании методов в интерфейсе.
 */