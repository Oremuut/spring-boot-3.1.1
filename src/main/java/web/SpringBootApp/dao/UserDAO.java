package web.SpringBootApp.dao;

import web.SpringBootApp.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();
    User getUserById(Long id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}
