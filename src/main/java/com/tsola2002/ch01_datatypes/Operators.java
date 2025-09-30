package com.tsola2002.ch01_datatypes;

public class Operators {


  public static void main(String[] args) {
    // ADDITION
    System.out.println("2 + 2: " +(2 + 2));
    // SUBTRACTION
    System.out.println("10 - 4: " + (10 - 4));
    // MULTIPLICATION
    System.out.println("10 x 10: " + (10 * 10));
    // DIVISION
    System.out.println("20/2: " + (20 / 2));
    // MODULUS
    System.out.println("3 modulus 2: " + 3 % 2);

    //UNARY OPERATORS
    int i = 1;
    int j = 1;
    int k = 3;
    int l = 4;
    String n = "1";
    String o = "1";

    System.out.println("1++ : " + i++ );
    System.out.println("1++ : " + i );
    System.out.println("1++ : " + ++j );
    System.out.println("k-- : " + k--);
    System.out.println("--l : " + --l );


    int m = 5;
    // ASSIGNMENT OPERATORS
    System.out.println("m+=5: " + (m += 1));







    // COMPARISON OPERATORS
    //double equals operator(loose equality operator)
    System.out.println("double equals: " + (i == j));
    System.out.println( k >= i);
    // triple equals operator(strict equality operator)
    // System.out.println(n === o);

    System.out.println();







  }

}
