package com.tsola2002.ch03_collection_data_type;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDataTypes {

  public static void main(String[] args) {
    // CREATING A SET
    Set<Integer> numberSet = new HashSet<>();
    numberSet.add(1);
    numberSet.add(2);
    numberSet.add(2);
    numberSet.add(3);
    // DISPLAY ALL ITEMS FROM THE SET
    // System.out.println(numberSet);

    // CREATING A HASHSET
    HashSet<Integer> hashedSet = new HashSet<>();
    hashedSet.add(3);
    hashedSet.add(3);
    hashedSet.add(4);
    hashedSet.add(5);
    // DISPLAY ALL ITEMS FROM THE HASHSET
    //System.out.println(hashedSet);

    // CREATING A TREESET
    TreeSet<Integer> numbers = new TreeSet<>();
    numbers.add(50);
    numbers.add(30);
    numbers.add(40);
    numbers.add(30);
    numbers.add(20);
    numbers.add(10);
    //numbers.add(null);

    // DISPLAYING ITEMS OF TREESET
    //System.out.println(numbers);

    //CREATING A LINKED HASHSET
    LinkedHashSet<String> lhs = new LinkedHashSet<>();
    lhs.add("Apple");
    lhs.add("Banana");
    lhs.add("Cherry");
    lhs.add("Apple");
    lhs.add(null);
    //lhs.add(null);

    System.out.println(lhs);






  }

}
