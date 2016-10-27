package com.vbashur.repository;

import com.vbashur.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "employee", collectionResourceRel = "employee", itemResourceRel = "employee")
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

    @RestResource(path = "byName")
    List<Employee> findByName(@Param("name") String name);
}
