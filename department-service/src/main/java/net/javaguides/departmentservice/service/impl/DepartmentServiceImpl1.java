//package net.javaguides.departmentservice.service.impl;
//
//import org.springframework.stereotype.Service;
//
//import lombok.AllArgsConstructor;
//import net.javaguides.departmentservice.dto.DepartmentDto;
//import net.javaguides.departmentservice.entity.Department;
//import net.javaguides.departmentservice.repository.DepartmentRepository;
//import net.javaguides.departmentservice.service.DepartmentService;
//
//@Service
//@AllArgsConstructor
//public class DepartmentServiceImpl1 implements DepartmentService{
//	
//	private DepartmentRepository departmentRepository;
//	
//
//	//replaced with lombok annotation @AllArgsConstructor
////	public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
////		super();
////		this.departmentRepository = departmentRepository;
////	}
//
//
//	@Override
//	public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
//		//convert department dto to department jpa entity
//		Department department = new Department(
//				departmentDto.getId(),
//				departmentDto.getDepartmentName(),
//				departmentDto.getDepartmentDescription(),
//				departmentDto.getDepartmentCode()
//		);
//		
//		
//		Department saveDepartment = departmentRepository.save(department);
//		
//		//convert department to DepartmentDto
//		
//		DepartmentDto savedDepartmentDto = new DepartmentDto(
//				saveDepartment.getId(),
//				saveDepartment.getDepartmentName(),
//				saveDepartment.getDepartmentDescription(),
//				saveDepartment.getDepartmentCode()
//				);
//		
//		return savedDepartmentDto;
//	}
//
//
//	@Override
//	public DepartmentDto getDepartmentByCode(String departmentCode) {
//		// retrieve department by code
//		Department department = departmentRepository.findByDepartmentCode(departmentCode);
//		
//		//convert the retrieved department data into a dto
//		DepartmentDto departmentDto = new DepartmentDto(
//				
//				department.getId(),
//				department.getDepartmentName(),
//				department.getDepartmentDescription(),
//				department.getDepartmentCode()
//				);
//		
//		return departmentDto;
//	}
//
//}
