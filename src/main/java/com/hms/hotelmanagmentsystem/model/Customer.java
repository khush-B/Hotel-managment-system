package com.hms.hotelmanagmentsystem.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_id;

    private String first_name;
    private String last_name;
    private String email;
    private String phone;
    private String id_number;
}

