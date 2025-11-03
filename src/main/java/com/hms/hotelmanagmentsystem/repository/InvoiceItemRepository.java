package com.hms.hotelmanagmentsystem.repository;



import com.hms.hotelmanagmentsystem.model.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemRepository extends JpaRepository<InvoiceItem, Integer> {
}
