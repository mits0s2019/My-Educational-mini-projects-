package com.comparator;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<User> users= Arrays.asList(new User("Mitsos",33),
                                        new User("Kostas",12),
                                        new User("Dimitris",22),
                                        new User("Nikos",55));

        System.out.println("Compare by name :");
        users.sort(new UserComparator.SortByName());
        users.forEach(System.out::println);

        System.out.println("*****************************");

        System.out.println("Compare by age :");
        users.sort(new UserComparator.SortByAge());
        users.forEach(System.out::println);

    }
}
