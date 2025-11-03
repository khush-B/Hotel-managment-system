package com.hms.hotelmanagmentsystem.model;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int room_id;

    private String room_number;
    private String status;

    @ManyToOne
    @JoinColumn(name = "room_type_id")
    private RoomType roomType;
}
