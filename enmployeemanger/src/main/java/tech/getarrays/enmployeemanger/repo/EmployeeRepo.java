package tech.getarrays.enmployeemanger.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.enmployeemanger.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional findEmployeeById(Long id);
}
