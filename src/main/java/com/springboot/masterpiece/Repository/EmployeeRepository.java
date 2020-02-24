package com.springboot.masterpiece.Repository;

import com.springboot.masterpiece.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
