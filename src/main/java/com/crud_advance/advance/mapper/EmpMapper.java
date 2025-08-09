package com.crud_advance.advance.mapper;

import com.crud_advance.advance.DTO.EmpDto;
import com.crud_advance.advance.entites.BordEntity;
import com.crud_advance.advance.entites.Emp;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class EmpMapper {
    public static EmpDto mapToEmpDto(Emp emp) {
        EmpDto empDto = new EmpDto();
        empDto.setId(emp.getId());
        empDto.setName(emp.getName());
        empDto.setFatherName(emp.getFatherName());
        empDto.setMotherName(emp.getMotherName());
        empDto.setAddress(emp.getAddress());
        empDto.setEmail(emp.getEmail());
        empDto.setGender(emp.getGender());
        if (emp.getBordEntity() != null) {
            empDto.setBordId(emp.getBordEntity().getId());
        }
        return empDto;
    }

    public static Emp mapToEmp(EmpDto empDto) {
        Emp emp = new Emp();
        emp.setId(empDto.getId());
        emp.setName(empDto.getName());
        emp.setFatherName(empDto.getFatherName());
        emp.setMotherName(empDto.getMotherName());
        emp.setAddress(empDto.getAddress());
        emp.setEmail(empDto.getEmail());
        emp.setGender(empDto.getGender());
        if (empDto.getBordId() != null) {
            BordEntity bordEntity = new BordEntity();
            bordEntity.setId(empDto.getBordId());
            emp.setBordEntity(bordEntity);
        }
        return emp;
    }
}
