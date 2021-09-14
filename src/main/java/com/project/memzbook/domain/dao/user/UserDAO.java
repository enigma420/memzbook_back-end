package com.project.memzbook.domain.dao.user;

import com.project.memzbook.domain.user.User;

import java.util.List;

/**
 * Interface responsible for access to Users table (Data Access Object)
 */
public interface UserDAO {

    /**
     * Create new user
     * @param user User object
     * @return Newly created user
     */
    Long create(User user);

    /**
     * Returns User object by identifier
     * @param id User identifier
     * @return User object
     */
    User getById(Long id);

    /**
     * Returns User object by login
     * @param login User login
     * @return User object
     */
    User getByLogin(String login);

    /**
     * Returns list of all Users
     * @return All Users
     */
    List<User> getAll();

    /**
     * Delete User by identifier
     * @param userId User identifier
     */
    void delete(Long userId);
}
