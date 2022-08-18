package com.example.SpringbootDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringbootDemo.entity.Department;
import com.example.SpringbootDemo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> fetchDepartmentList() {
		// TODO Auto-generated method stub
		return (List<Department>) departmentRepository.findAll();
	}

	@Override
	public Department updateDepartment(Department department, Long departmentId) {
		// TODO Auto-generated method stub
		Department depDB = departmentRepository.findById(departmentId).get();

		/*
		 * if (Objects.nonNull(department.getDepartmentName()) &&
		 * !"".equalsIgnoreCase(department.getDepartmentName())) {
		 * depDB.setDepartmentName(department.getDepartmentName()); }
		 * 
		 * if (Objects.nonNull(department.getDepartmentAddress()) &&
		 * !"".equalsIgnoreCase(department.getDepartmentAddress())) {
		 * depDB.setDepartmentAddress(department.getDepartmentAddress()); }
		 * 
		 * if (Objects.nonNull(department.getDepartmentCode()) &&
		 * !"".equalsIgnoreCase(department.getDepartmentCode())) {
		 * depDB.setDepartmentCode(department.getDepartmentCode()); }
		 */

		return departmentRepository.save(depDB);
	}

	@Override
	public void deleteDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		departmentRepository.deleteById(departmentId);
	}

}
