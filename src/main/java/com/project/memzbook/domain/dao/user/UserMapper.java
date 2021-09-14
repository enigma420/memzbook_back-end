package com.project.memzbook.domain.dao.user;


import com.project.memzbook.domain.user.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.OffsetDateTime;

/**
 * Model mapper for Users table
 */
public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        return User.builder()
                .userId(resultSet.getLong("USER_ID"))
                .login(resultSet.getString("LOGIN"))
                .password(resultSet.getString("PASSWORD"))
                .email(resultSet.getString("EMAIL"))
                .roleId(resultSet.getInt("ROLE_ID"))
                .active(resultSet.getBoolean("ACTIVE"))
                .points(resultSet.getInt("POINTS"))
                .rate(resultSet.getDouble("RATE"))
                .createdAt(resultSet.getObject("CREATED_AT", OffsetDateTime.class))
                .build();
    }
}