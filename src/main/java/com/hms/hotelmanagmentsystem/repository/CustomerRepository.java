package com.hms.hotelmanagmentsystem.repository;



import com.hms.hotelmanagmentsystem.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
