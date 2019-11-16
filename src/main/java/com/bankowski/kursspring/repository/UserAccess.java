package com.bankowski.kursspring.repository;

import com.bankowski.kursspring.domain.User;

import java.util.List;

public interface UserAccess {
    List<User> readAllUsers();
}
