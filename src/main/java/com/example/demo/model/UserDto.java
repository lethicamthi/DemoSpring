package com.example.demo.model;

import lombok.Data;

@Data
public class UserDto {
    String userID;
    String userName;
    String pwd;
    String email;
    Integer age;
}