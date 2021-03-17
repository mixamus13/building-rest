package com.mixamus.buildingrest.payroll.repository;

import com.mixamus.buildingrest.payroll.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
