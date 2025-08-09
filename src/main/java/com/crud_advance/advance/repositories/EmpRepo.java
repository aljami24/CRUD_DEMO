package com.crud_advance.advance.repositories;

import com.crud_advance.advance.entites.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Emp,Long> {

}
