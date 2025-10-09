package com.tsola2002.ch03_collection_data_type;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

  public static void main(String[] args) {

    //CREATING A MAP
    Map<Integer, String> sholasMap =
        Map.of(1, "s1",
               2, "s2",
               3, "s3");

    //System.out.println(sholasMap);

//    for(Integer i: sholasMap.keySet()){
//      System.out.println(
//          i + ", " + sholasMap.get(i) + ", ");
//    }

    // CREATING A TREE MAP
    TreeMap<Integer, String> custom = new TreeMap<>();
    custom.put(3, "Three");
    custom.put(1, "One");
    custom.put(2, "Two");

    //System.out.println(custom);

    // CREATING A HASHTABLE
    Hashtable<Integer, String> table = new Hashtable<>();
    table.put(1, "One");
    table.put(2, "Two");
    table.put(3, "Three");

    //System.out.println(table);

    //CREATING LINKED HASHMAP
    LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
    lhm.put(3, "Cherry");
    lhm.put(1, "Apple");
    lhm.put(2, "Banana");
    lhm.put(null, "Orange");
    lhm.put(5, null);
    lhm.put(null, "Cherry");

    System.out.println(lhm);

  }

}
