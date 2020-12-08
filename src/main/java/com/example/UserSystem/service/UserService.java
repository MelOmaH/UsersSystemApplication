package com.example.UserSystem.service;

import com.example.UserSystem.repo.UsersRepository;
import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.bson.Document;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class UserService {

    @Autowired
    private UsersRepository usersRepository;


    public void addUser(String name, String password) {
        Users user = new Users(name,password);
        usersRepository.save(user);
    }

    public void updateUserName(String oldName, String newName, String newPassword) {
        Users user = usersRepository.findByUsername(oldName);
        user.setUsername(newName);
        user.setPassword(newPassword);
        usersRepository.save(user);
    }



    public List<Users> showAllUsers() {
        return usersRepository.findAll();
    }

    private String getParam(String stringParam, DBObject object) {
        Object name = object.get(stringParam);
        return null == name ? null : name.toString();
    }
}
