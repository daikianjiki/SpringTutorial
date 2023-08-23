package com.daikianjiki.springboottutorial.repos;

import com.daikianjiki.springboottutorial.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepos extends JpaRepository<Department, Long> {
}
