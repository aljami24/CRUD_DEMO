package com.crud_advance.advance.services.Impl;

import com.crud_advance.advance.DTO.EmpDto;
import com.crud_advance.advance.entites.Emp;
import com.crud_advance.advance.exception.ResourceNotFoundExecption;
import com.crud_advance.advance.mapper.EmpMapper;
import com.crud_advance.advance.repositories.EmpRepo;
import com.crud_advance.advance.services.ServiceEmp;
import lombok.AllArgsConstructor;
import org.hibernate.ResourceClosedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ImplEmp implements ServiceEmp {

    @Autowired
    public EmpRepo empRepo;

    @Override
    public EmpDto createEmployee(EmpDto empDto) {
        Emp emp = EmpMapper.mapToEmp(empDto);
        Emp saveEmp = empRepo.save(emp);
        return EmpMapper.mapToEmpDto(saveEmp);
    }

    @Override
    public List<EmpDto> getAll() {
       List<Emp> empList = empRepo.findAll();
       return empList.stream().map(EmpMapper::mapToEmpDto).collect(Collectors.toList());
    }

    @Override
    public EmpDto getById(Long id) {
        Optional<Emp> getById = empRepo.findById(id);
        return (EmpDto) getById.stream().map(EmpMapper::mapToEmpDto).collect(Collectors.toList());
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public EmpDto updateEmployee(Long id, EmpDto updatedEmployee) {
        return null;
    }
}
