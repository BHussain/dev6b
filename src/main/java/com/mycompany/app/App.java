package com.mycompany.app;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        new MongoClient("localhost", 27017);
    }
}
