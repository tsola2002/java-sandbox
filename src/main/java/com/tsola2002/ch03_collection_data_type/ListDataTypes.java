package com.tsola2002.ch03_collection_data_type;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListDataTypes {

  public static void main(String[] args) {

    // CREATING AN ARRAYLIST
    ArrayList<String> fruits = new ArrayList<>();

    // INSERTING ITEMS INTO THE ARRAYLIST
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Cherry");

    // DISPLAY ONE ITEM IN THE ARRAYLIST
    String  item1 = fruits.get(1);
    //System.out.println("Item at index 1 is: " + item1);


    // CREATING A LINKEDLIST
    LinkedList<String> positions = new LinkedList<>();
    positions.add("First");
    positions.add("Second");
    positions.add("Third");

    //System.out.println(positions);

    // CREATING A VECTOR
    Vector<String> vectorFruits = new Vector<>();
    vectorFruits.add("Apple");
    vectorFruits.add("Banana");
    vectorFruits.add("Cherry");
    // DISPLAY ALL ITEMS OF THE VECTOR
    //System.out.println(vectorFruits);

    // CREATING A STACK
    Stack<Integer> numberStack = new Stack<>();
    numberStack.push(10);
    numberStack.push(20);
    numberStack.push(30);
    // DISPLAY ITEMS IN THE STACK
    System.out.println(numberStack);

  }

}
