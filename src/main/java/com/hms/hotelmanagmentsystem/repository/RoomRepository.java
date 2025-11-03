package com.hms.hotelmanagmentsystem.repository;



import com.hms.hotelmanagmentsystem.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Integer> {
}
