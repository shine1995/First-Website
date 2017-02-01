package com.shine.services;

import com.shine.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Blake on 2/1/17.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findFirstByName(String userName);
}
