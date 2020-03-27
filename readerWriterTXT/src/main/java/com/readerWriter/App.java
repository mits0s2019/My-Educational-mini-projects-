package com.readerWriter;

import java.util.List;

/**
 *   this project is to get familiar with  read /write  from/to  .TXT
 */

public class App {

    public static void main(String[] args) {

        User user1=new User("username1","11111","first name 1","last name 1");
        User user2=new User("username2","22222","first name 2","last name2");

        Database.save(user1);
        Database.save(user2);

        List<User> users= Database.getUsers();

        System.out.println(users);

    }
}
