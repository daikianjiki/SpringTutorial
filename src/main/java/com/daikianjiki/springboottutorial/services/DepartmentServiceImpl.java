package com.daikianjiki.springboottutorial.services;

import com.daikianjiki.springboottutorial.entities.Department;
import com.daikianjiki.springboottutorial.repos.DepartmentRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepos departmentRepos;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepos.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepos.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) {
        return departmentRepos.findById(departmentId).get();
    }
}
