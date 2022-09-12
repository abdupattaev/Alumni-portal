package edu.miu.backend.repo;

import edu.miu.backend.entity.Department;
import org.hibernate.annotations.Where;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepo extends CrudRepository<Department, Integer> {


    Optional<Department> findDepartmentByNameContaining(String abs);
    Optional<Department> findById(Integer id);
}
