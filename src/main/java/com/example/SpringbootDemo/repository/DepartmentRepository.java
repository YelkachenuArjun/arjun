package com.example.SpringbootDemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringbootDemo.entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
