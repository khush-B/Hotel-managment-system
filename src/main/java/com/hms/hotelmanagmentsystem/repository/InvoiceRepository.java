package com.hms.hotelmanagmentsystem.repository;



import com.hms.hotelmanagmentsystem.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
}
