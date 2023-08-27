package com.daikianjiki.springboottutorial.repos;

import com.daikianjiki.springboottutorial.entities.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DepartmentRepoTest {

    @Autowired
    private DepartmentRepo departmentRepo;

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setup() {
        Department department = Department.builder()
                .departmentName("Mechanical Engineering")
                .departmentCode("ME - 01")
                .departmentAddress("Delhi")
                .build();
        entityManager.persist(department);
    }

    @Test
    public void whenFindById_thenReturnDepartment() {
        Department department = departmentRepo.findById(1L).get();
        assertEquals(department.getDepartmentName(), "Mechanical Engineering");
    }
}