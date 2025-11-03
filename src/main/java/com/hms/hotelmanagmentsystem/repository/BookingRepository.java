package com.hms.hotelmanagmentsystem.repository;



import com.hms.hotelmanagmentsystem.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
}

