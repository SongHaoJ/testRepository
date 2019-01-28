package com.bean.demo;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: songhao
 * @Date: 2019/1/28 0028 上午 10:50
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -3954005985280527070L;

    private Long id;

    private String username;

    private String password;

    public User() {
    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
