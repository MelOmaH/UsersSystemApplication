package com.example.UserSystem.manger;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.stereotype.Component;

@Component
public class ConnectionManager {

    public void connectToDB() {

        MongoClient mongoClient = new MongoClient("127.0.0.1", 27017);
        MongoDatabase database = mongoClient.getDatabase("usersList");
        MongoCollection<Document> collection = database.getCollection("User");



    }


}
