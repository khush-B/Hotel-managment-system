package com.hms.hotelmanagmentsystem.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int booking_id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    private LocalDate check_in_date;
    private LocalDate check_out_date;
    private String status;
    private LocalDateTime created_at;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;
}
