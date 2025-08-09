package com.crud_advance.advance.controllers;

import com.crud_advance.advance.DTO.EmpDto;
import com.crud_advance.advance.services.Impl.ImplEmp;
import com.crud_advance.advance.services.ServiceEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("emp")

public class EmpController {

    @Autowired
    public ServiceEmp serviceEmp;

    @PostMapping
    public EmpDto createAllEmp(@RequestBody EmpDto empDto) {
        return serviceEmp.createEmployee(empDto);
    }

    @GetMapping
    public List<EmpDto> getAllEmp() {
        return serviceEmp.getAll();
    }

    @GetMapping("{id}")
    public EmpDto getById(@PathVariable Long id) {
        return serviceEmp.getById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        serviceEmp.deleteById(id);
    }

    @PutMapping("{id}")
    public EmpDto updateEmp(@PathVariable Long id, @RequestBody EmpDto empDto) {
        return serviceEmp.updateEmployee(id, empDto);
    }

}
