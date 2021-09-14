package com.project.memzbook.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.time.OffsetDateTime;

/**
 *  Database model of Users table
 * */
@Builder
@Data
@Value
public class User {
    /* Identifier */
    Long id;
    /* User login */
    String login;
    /* User password */
    String password;
    /* User email */
    String email;
    /* Role Identifier (FK with roles table) */
    int roleId;
    /* User account status (active/unactive) */
    boolean active;
    /* User points */
    int points;
    /* User rate */
    Double rate;
    /* Creation date */
    OffsetDateTime createdAt;
}
