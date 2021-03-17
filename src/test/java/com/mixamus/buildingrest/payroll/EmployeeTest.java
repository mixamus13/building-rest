package com.mixamus.buildingrest.payroll;

import com.mixamus.buildingrest.payroll.domain.Employee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeTest {

    @Test
    @DisplayName("Role Employee")
    void shouldRightSetRole() {
        Employee employee = new Employee("Fill", "Valensio");
        assertThat(employee.getRole()).isEqualTo("Valensio");
    }
}