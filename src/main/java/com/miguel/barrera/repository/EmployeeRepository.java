package com.miguel.barrera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.miguel.barrera.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
}
