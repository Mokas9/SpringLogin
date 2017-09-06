package net.springlogin.service;

import net.springlogin.model.User;

public interface UserService {
    void save (User user);

    User findByUsername(String username);
}
