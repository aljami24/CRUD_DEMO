package com.crud_advance.advance.entites;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EMP")
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String fatherName;
    private String motherName;
    private String address;
    private String email;
    private String phoneNumber;
    private String gender;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "bord_id")
    private BordEntity bordEntity;

}
