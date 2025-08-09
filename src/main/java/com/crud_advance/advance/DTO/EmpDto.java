package com.crud_advance.advance.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpDto {
    private Long id;
    private Long bordId;
    private String name;
    private String fatherName;
    private String motherName;
    private String address;
    private String email;
    private String phoneNumber;
    private String gender;
}
