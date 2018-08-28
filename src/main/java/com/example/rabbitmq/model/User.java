package com.example.rabbitmq.model;

import java.io.Serializable;

/** @Author: shuyizhi @Date: 2018-08-28 10:36 @Description: */
public class User implements Serializable {
    private String name;
    private String pass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", pass='" + pass + '\'' + '}';
    }
}
