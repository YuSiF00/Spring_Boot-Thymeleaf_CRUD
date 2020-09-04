package com.luv2code.thymeleaf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luv2code.thymeleaf.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// add a method to sort by last name
		public List<Employee> findAllByOrderByLastNameAsc();

}
