package com.example.crud_spring_security_3_1_2.DAO;

import com.example.crud_spring_security_3_1_2.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();
    User getUser(Long id);
    User getUserByName(String username);
    void save(User user);
    void update(User updatedUser);
    void delete(Long id);
}
