package com.readerWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private static final String USERS_FILE="staff.txt";
    private static List<User> users;


    public static boolean save(User user)  {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(USERS_FILE,true));

            writer.write(user.username+","+user.getPassword()+","+user.getFirstName()+","+user.getLastName());
            writer.newLine();
            writer.close();

            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static List<User> getUsers()  {
      try {
          BufferedReader reader = new BufferedReader(new FileReader(USERS_FILE));
          users = new ArrayList<>();

          String line = reader.readLine();
          while (line != null) {
              if(!line.isEmpty()) {
                  String[] record = line.split(",");
                  users.add(new User(record[0], record[1], record[2], record[3]));
              }
              line = reader.readLine();
          }
          reader.close();
      }catch (IOException e){
          e.printStackTrace();
      }
        return users;
    }
}
