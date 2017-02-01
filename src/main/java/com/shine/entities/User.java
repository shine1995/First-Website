package com.shine.entities;

import javax.persistence.*;

/**
 * Created by Blake on 2/1/17.
 */


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false, unique = true)
    String name;

    @Column(nullable = false)
    String password;

    public User () {
    }

    public User (String name, String password) {
    }

    public String getPassword() {
        return password;
    }
}
