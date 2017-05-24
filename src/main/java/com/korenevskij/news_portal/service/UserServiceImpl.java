package com.korenevskij.news_portal.service;

import com.korenevskij.news_portal.model.User;
import com.korenevskij.news_portal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Transactional
    public void updateUser(User user) {
        // write own QUERY in UserRepository class
    }

    @Transactional
    public void removeUser(int id) {
        userRepository.delete(id);
    }

    @Transactional
    public User getUserById(int id) {
        return userRepository.findOne(id);
    }

    @Transactional
    public List<User> listUsers() {
        return userRepository.findAll();
    }
}