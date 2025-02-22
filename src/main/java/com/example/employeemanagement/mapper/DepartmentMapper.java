package com.example.employeemanagement.mapper;

import com.example.employeemanagement.dto.DepartmentDto;
import com.example.employeemanagement.entity.Department;

public class DepartmentMapper {

    // convert department JPA entity into department dto
    public static DepartmentDto mapToDepartmentDto(Department department) {
        return new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription()
        );
    }

    // convert department dto into department JPA entity
    public static Department mapToDepartment(DepartmentDto departmentDto) {
        return new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription()
        );
    }
}
