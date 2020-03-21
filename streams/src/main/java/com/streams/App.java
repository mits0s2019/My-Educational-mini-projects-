package com.streams;

import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;


public class App {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {


        List<String> list= Arrays.asList("dimitris","kostas","nikos","giorgos","kostas","giannis");

        System.out.println("*********** Original List ********** "+list +"\n");

/////////////////////////////////////////////////////////////////

        List<String> listFirstletterUperCase=list.stream()
                .map(x->x.substring(0, 1).toUpperCase() + x.substring(1))
                .collect(Collectors.toList());

        System.out.println("****Capitalize the first letter****");
        log.info(listFirstletterUperCase.toString());
        System.out.println();

/////////////////////////////////////////////////////////////////

        List<String > distinctList=list.stream()
                .distinct()
                .map(x->x.substring(0, 1).toUpperCase() + x.substring(1))
                .collect(Collectors.toList());

        System.out.println("****Distinct****");
        log.info(distinctList.toString());
        System.out.println();

/////////////////////////////////////////////////////////////////

        List<String> listStartingWithLetterG=list.stream()
                .distinct()
                .filter(x->x.startsWith("g"))
                .map(x->x.substring(0, 1).toUpperCase() + x.substring(1))
                .collect(Collectors.toList());

        System.out.println("****Collect names starting with \"g\" ****");
        log.info(listStartingWithLetterG.toString());
        System.out.println();

/////////////////////////////////////////////////////////////////

        String listMin=list.stream()
                .map(x->x.substring(0, 1).toUpperCase() + x.substring(1))
                .min((o1, o2) -> o1.compareTo(o2))
                .orElse("Empty");

        System.out.println("**** Find the min of the list ****");
        log.info(listMin);
        System.out.println();

    }
}
