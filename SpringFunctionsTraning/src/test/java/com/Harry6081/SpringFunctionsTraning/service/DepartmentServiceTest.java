package com.Harry6081.SpringFunctionsTraning.service;

import com.Harry6081.SpringFunctionsTraning.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void whenValidDepartmentName_thenDepartmentShouldFound(){
        String departmentName = "IT";
        Department found=
                departmentService.fetchDepartmentByName(departmentName);
            assertEquals(departmentName,found.getDepartmentName());
    }
}