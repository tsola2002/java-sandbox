package com.tsola2002.ch08_functional_programming;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {
    public static void main(String[] args) {
        // CREATING A STATIC METHOD REFERENCE
        // Function<String, Integer> strLength = String::length;
        // System.out.println(strLength.apply("Lambda"));

        // CREATING AN INSTANCE REFERENCE
        // List<String> names = List.of("Bob", "Alice", "Charlie");
        //names.forEach(System.out::println);
        //names.forEach(name -> System.out.println(name));

        // CREATING A CONSTRUCTOR REFERENCE
        Supplier<Person> personSupplier = Person::new;
        personSupplier.get();
    }
}


class Person {
    public Person(){
        System.out.println("Person Created!!");
    }
}
