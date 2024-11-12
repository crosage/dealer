package com.powerdealer.dealer.module.user.service;

import com.powerdealer.dealer.module.user.entity.User;
import com.powerdealer.dealer.module.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void createUser(User user) {
        userMapper.insertUser(user);
    }

    public void deleteUser(Integer id) {
        userMapper.deleteUserById(id);
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    public User getUserById(Integer id) {
        return userMapper.selectUserById(id);
    }

    public List<User> getAllUsers() {
        return userMapper.selectAllUsers();
    }
}
