package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    public static void main(String[] args) {

        List<String> someBingoNumbers=Arrays.asList(
            "N40","N35",
                "b12","B88"
                ,"G33","G12","G9","g12",
                "I12","I23",
                "O71" );
        List <String> gnumbers=new ArrayList<>();

        someBingoNumbers.forEach(( s)->{
            if(s.toUpperCase().startsWith("G")){

                gnumbers.add(s);

            }
        });
        gnumbers.sort((String s1, String s2)->s1.compareTo(s2));
        gnumbers.forEach((String s)->{System.out.println(s);});

        //using stream and solving the same problem
        System.out.println("Using the Stream and solving the same problem");
        someBingoNumbers
                .stream()
                .map(s->s.toUpperCase())
                .filter(s->s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);
    }
}
