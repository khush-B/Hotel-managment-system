
package com.hms.hotelmanagmentsystem.services;

import com.hms.hotelmanagmentsystem.model.Booking;
import com.hms.hotelmanagmentsystem.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
}

