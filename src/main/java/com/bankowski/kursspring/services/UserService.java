package com.bankowski.kursspring.services;

import com.bankowski.kursspring.domain.User;
import com.bankowski.kursspring.repository.FakeRepo;
import com.bankowski.kursspring.repository.UserAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    private UserAccess userRepository;

    @Autowired
    public UserService(UserAccess userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.readAllUsers();
    }
}
