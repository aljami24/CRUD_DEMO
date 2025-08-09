package com.crud_advance.advance.services;

import com.crud_advance.advance.DTO.EmpDto;
import com.crud_advance.advance.entites.Emp;

import java.util.List;


public interface ServiceEmp {

    //CREATE
    public EmpDto createEmployee(EmpDto empDto);

    //READ ALL
    public List<EmpDto> getAll();

    //READ BY ID
    public EmpDto getById(Long id);

    //DELETE
    public void deleteAll();

    //DELETE BY ID
    public void deleteById(Long id);

    //UPDATE
    public EmpDto updateEmployee(Long id, EmpDto updatedEmployee);

}

