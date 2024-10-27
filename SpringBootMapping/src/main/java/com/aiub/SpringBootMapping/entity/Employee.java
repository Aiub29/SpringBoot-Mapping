package com.aiub.SpringBootMapping.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    // address_add_id

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_add_id")
    private  Address address;
}
