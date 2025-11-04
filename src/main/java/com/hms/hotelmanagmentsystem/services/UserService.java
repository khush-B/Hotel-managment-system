package com.hms.hotelmanagmentsystem.services;


import com.hms.hotelmanagmentsystem.model.User;
import com.hms.hotelmanagmentsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    public User login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
                return user; // Valid login
            }
            return null; // Invalid
        }
}

