package com.hms.hotelmanagmentsystem.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "invoices")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int invoice_id;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    private double subtotal;
    private double tax;
    private double total;
    private LocalDateTime issued_date;
}

