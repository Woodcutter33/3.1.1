package com.BooT.boot.service;

import com.BooT.boot.repository.UserRepository;
import com.BooT.boot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public void createUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void editUser(User user) {
        userRepository.saveAndFlush(user);;
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}
