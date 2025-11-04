package com.tsola2002.ch08_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Streams {

    public static void main(String[] args) {
        // IMPERATIVE PROGRAMMING
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
//        List<Integer> evenNumbers = new ArrayList<>();
//        for(int n : numbers){
//            if(n % 2 == 0){
//                evenNumbers.add(n);
//            }
//        }
//        System.out.println(evenNumbers);

        // DECLARATIVE PROGRAMMING(FUNCTIONAL PROGRAMMING)
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        //CREATING A JAVA STREAM
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0 )
                                           .toList();
        System.out.println(evenNumbers);


//        List<String> names = List.of("Alice", "Bob", "Charlie",
//                "David", "Eve", "Adam");
//
//        List<String>filteredNames = names.stream()
//                .filter(a -> a.length() > 3)
//                .filter(a -> a.length() > 4)
//                .map(String::toUpperCase)
//                .sorted()
//                .toList();
//
//        System.out.println(filteredNames);
    }
}
