package com.powerdealer.dealer.module.user.mapper;

import com.powerdealer.dealer.module.user.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    @Insert("INSERT INTO users(username, password, email, created_at, updated_at) " +
            "VALUES(#{username}, #{password}, #{email}, #{created_at}, #{updated_at})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertUser(User user);

    @Delete("DELETE FROM users WHERE id = #{id}")
    void deleteUserById(Integer id);

    @Update("UPDATE users SET username = #{username}, password = #{password}, email = #{email}, " +
            "updated_at = #{updated_at} WHERE id = #{id}")
    void updateUser(User user);

    @Select("SELECT id, username, password, email, created_at, updated_at FROM users WHERE id = #{id}")
    User selectUserById(Integer id);

    @Select("SELECT id, username, password, email, created_at, updated_at FROM users")
    List<User> selectAllUsers();
}
