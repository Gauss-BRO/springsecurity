package org.example.dao;

import org.example.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao {
    List<User> getUserList ();
    User getUser (int id);
    void saveUser (User user);
    void updateUser (int id, User updatedUser);
    void deleteUser (int id);
    User getUserByName(String name);
}
