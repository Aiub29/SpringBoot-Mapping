package com.aiub.SpringBootMapping.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Transactional
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "emp_details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Long id;
    private String name;
    private Integer age;
//Uni Directional Mapping//
    // address_add_id

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_add_id")
//    private  Address address;

    // By Directional Mapping  -Owing Side

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_add_id")
//    private  Address address;




    // ===================== OneTo Many ===============================
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_emp_id",referencedColumnName = "emp_id")
    private List<Address> address;
}
