package com.daikianjiki.springboottutorial.services;

import com.daikianjiki.springboottutorial.entities.Department;
import com.daikianjiki.springboottutorial.repos.DepartmentRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepos.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department department1 = departmentRepos.findById(departmentId).get();
        if (Objects.nonNull(department.getDepartmentName()) &&
        !"".equalsIgnoreCase(department.getDepartmentName())) {
            department1.setDepartmentName(department.getDepartmentName());
        }

        if (Objects.nonNull(department.getDepartmentCode()) &&
                !"".equalsIgnoreCase(department.getDepartmentCode())) {
            department1.setDepartmentCode(department.getDepartmentCode());
        }
        if (Objects.nonNull(department.getDepartmentAddress()) &&
                !"".equalsIgnoreCase(department.getDepartmentAddress())) {
            department1.setDepartmentAddress(department.getDepartmentAddress());
        }

        return departmentRepos.save(department1);
    }
}
