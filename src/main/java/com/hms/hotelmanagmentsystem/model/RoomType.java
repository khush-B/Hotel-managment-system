package com.hms.hotelmanagmentsystem.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "room_types")
public class RoomType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int room_type_id;

    private String type_name;
    private double price_per_night;
    private String description;
}
