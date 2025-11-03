package com.hms.hotelmanagmentsystem.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "invoice_items")
public class InvoiceItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int item_id;

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

    private String description;
    private double amount;
}

