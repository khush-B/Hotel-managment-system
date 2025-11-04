package com.hms.hotelmanagmentsystem.repository;

import com.hms.hotelmanagmentsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);

}

