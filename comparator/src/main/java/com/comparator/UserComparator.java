package com.comparator;

import java.util.Comparator;

public class UserComparator {

   private static User user1;
   private static User user2;

   private UserComparator(Object user1, Object user2) {
        this.user1 = (User)user1;
        this.user2=(User)user2;
    }

    static class SortByName implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {

                new UserComparator(o1,o2);

            return user1.getName().compareTo(user2.getName());
        }
    }
   static class SortByAge implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {

            new UserComparator(o1,o2);

            return user1.getAge()-user2.getAge();
        }
    }
}
