package com.daikianjiki.springboottutorial.services;

import com.daikianjiki.springboottutorial.entities.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId);
}
