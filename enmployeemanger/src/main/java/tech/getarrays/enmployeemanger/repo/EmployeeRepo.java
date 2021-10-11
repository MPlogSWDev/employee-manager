package tech.getarrays.enmployeemanger.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.enmployeemanger.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
