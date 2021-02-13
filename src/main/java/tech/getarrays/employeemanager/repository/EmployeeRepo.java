package tech.getarrays.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.Employee;

// the repo take 2 params the model and the the type of the primary key
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
