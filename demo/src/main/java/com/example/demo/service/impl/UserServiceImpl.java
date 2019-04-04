package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.UserRepository;
import com.example.demo.data.entity.User;
import com.example.demo.service.UserService;
import com.google.common.collect.ImmutableList;

public class UserServiceImpl implements UserService {
	
	@Autowired
    UserRepository userRepository;
     
    @Override
    @Transactional(readOnly = true, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public List<User> selectUserList() {
        return ImmutableList.copyOf(userRepository.findAll());
    }
 
    @Override
    @Transactional(readOnly = true, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public User selectUser(Long uid) {
        return userRepository.findOne();
    }
 
    @Override
    @Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public void insertUser(User user) {
        userRepository.save(user);
    }
 
    @Override
    @Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public void updateUser(User user) {
        userRepository.save(user);
    }
 
    @Override
    @Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public void deleteUser(Long uid) {
        userRepository.delete(uid);
 
    }

}
