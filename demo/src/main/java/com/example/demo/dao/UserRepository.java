package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.data.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
