package com.streams;

import java.util.*;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        List<String> list= Arrays.asList("dimitris","kostas","nikos","giorgos","kostas","giannis");

/////////////////////////////////////////////////////////////////

        List<String > distinctList=list.stream()
              .distinct()
              .collect(Collectors.toList());

        System.out.println("****Distinct****");
        System.out.println(distinctList +"\n");
/////////////////////////////////////////////////////////////////

        List<String> listFirstletterUperCase=list.stream()
                .map(x->x.substring(0, 1).toUpperCase() + x.substring(1))
                .collect(Collectors.toList());

        System.out.println("****Capitalize the first letter****");
        System.out.println(listFirstletterUperCase +"\n");
/////////////////////////////////////////////////////////////////

        List<String> listStartingWithLetterG=list.stream()
                .filter(x->x.startsWith("g"))
                .collect(Collectors.toList());

        System.out.println("****Collect names starting with \"g\" ****");
        System.out.println(listStartingWithLetterG +"\n");
/////////////////////////////////////////////////////////////////

        String listMin=list.stream()
                .min((o1, o2) -> o1.compareTo(o2))
                .orElse("Empty");

        System.out.println("**** Find the min of the list ****");
        System.out.println(listMin +"\n");

    }
}
