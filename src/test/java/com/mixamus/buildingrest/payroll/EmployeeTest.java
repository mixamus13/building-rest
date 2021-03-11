package com.mixamus.buildingrest.payroll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    @DisplayName("Role Employee")
    void shouldRightSetRole() {
        Employee employee = new Employee("Fill", "Valensio");
        assertThat(employee.getRole()).isEqualTo("Valensio");
    }
}