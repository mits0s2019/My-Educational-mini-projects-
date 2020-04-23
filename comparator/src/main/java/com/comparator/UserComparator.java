package com.comparator;

import java.util.Comparator;

public class UserComparator {


    static class SortByName implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {

            return ((User)o1).getName().compareTo(((User)o2).getName());
        }
    }
   static class SortByAge implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {

            return ((User)o1).getAge()-((User)o2).getAge();
        }
    }
}
