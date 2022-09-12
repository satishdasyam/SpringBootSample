package com.satish.SpringBootSample.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    public User(int  id, String name) {
        this.id = id;
        this.name = name;
    }
    private int id ;
    private String name ;
}
