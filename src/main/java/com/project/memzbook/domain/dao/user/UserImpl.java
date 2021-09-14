package com.project.memzbook.domain.dao.user;

import com.project.memzbook.domain.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User Data Access Object (DAO) implementations
 */
@Repository
@RequiredArgsConstructor
public class UserImpl implements UserDAO{

    private final JdbcTemplate jdbcTemplate;

    @Override
    public Long create(User user) {
        String CREATE_USER = "INSERT INTO users(" +
                "login," +
                "password, " +
                "email," +
                "role_id," +
                "active," +
                "points," +
                "rate," +
                "created_at)" +
                "VALUES (?,?,?,?,?,?,?,?,?) " +
                "RETURNING id";

        return jdbcTemplate.queryForObject(
                CREATE_USER,
                Long.class,
                user.getLogin(),
                user.getPassword(),
                user.getEmail(),
                user.getRoleId(),
                user.isActive(),
                user.getPoints(),
                user.getRate(),
                user.getCreatedAt()
        );
    }

    @Override
    public User getById(Long id) {
        String GET_USER_BY_ID = "SELECT * FROM users WHERE id = ?";

        return jdbcTemplate.queryForObject(
                GET_USER_BY_ID,
                new UserMapper(),
                id
        );
    }

    @Override
    public User getByLogin(String login) {
        String GET_USER_BY_LOGIN = "SELECT * FROM users WHERE login = ?";

        return jdbcTemplate.queryForObject(
                GET_USER_BY_LOGIN,
                new UserMapper(),
                login
        );
    }

    @Override
    public List<User> getAll() {
        String GET_ALL_USERS = "SELECT * FROM users";

        return jdbcTemplate.query(
                GET_ALL_USERS,
                new UserMapper()
        );
    }

    @Override
    public void delete(Long id) {
        String DELETE_USER = "DELETE FROM users WHERE id = ?";

        jdbcTemplate.update(
                DELETE_USER,
                id
        );
    }
}
