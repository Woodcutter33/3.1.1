package com.BooT.boot.service;

import com.BooT.boot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    void createUser(User user);

    User getUser(Long id);

    void editUser(User user);

    void deleteUser(Long id);
}
