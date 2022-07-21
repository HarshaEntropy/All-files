package com.Harry6081.SpringFunctionsTraning.reposity;

import com.Harry6081.SpringFunctionsTraning.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    Department findByDepartmentNameIgnoreCase(String departmentName);

}
