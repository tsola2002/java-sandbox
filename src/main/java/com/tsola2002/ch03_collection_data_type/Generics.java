package com.tsola2002.ch03_collection_data_type;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Generics {


  public static void main(String[] args) {
    // CREATED ARRAY LIST USING A GENERIC
    // List<String> list = new ArrayList<>();
    //CREATED A SET USING A GENERIC
    // Set<Integer> set = new HashSet<>();
    // add items to our list
    //list.add("Omatsola");
    // list.add(1);
    //list.add("Terry");
    //list.remove("Terry");

    // THIS WILL CREATE AN INTIALIZE VALUES OF LIST
    Collection<String> stringList =
        List.of("omatsola", "terry", "chukwudi");

    Collection<String> setList =
        Set.of("s1", "s2", "s3");

    // REMOVE AN ITEM FROM THE LIST
    // this will not work
    //stringList.remove(stringList);


    System.out.println(stringList);
    System.out.println(setList);
  }

}
