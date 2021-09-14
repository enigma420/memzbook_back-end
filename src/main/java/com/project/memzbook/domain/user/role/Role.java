package com.project.memzbook.domain.user.role;

import lombok.Builder;
import lombok.Value;

/**
 *  Database model of Roles table (* Dictionary *)
 * */
@Value
@Builder
public class Role {
    /* Identifier */
    Integer id;
    /* Role name */
    String name;
}
