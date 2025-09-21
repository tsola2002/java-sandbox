package com.tsola2002;

import com.tsola2002.ch02_oop.C1;
import com.tsola2002.ch02_oop.C2;
import com.tsola2002.ch02_oop.Lion;
import com.tsola2002.ch02_oop.SomeClass;

public class Main {

  public static void main(String[] args) {

    //System.out.println("Hello world!");
    //CREATING A LION OBJECT
     Lion mufasa = new Lion(16, "8 Whiskas",
      true);

     Lion simba = new Lion(24, "16 Whiskas", true);
    // CALL DEVOUR METHOD ON THE LION OBJECT
    //mufasa.devour();

    // simba.devour();

    // CREATING OBJECT TO RUN THE INTERFACE
    // SomeClass sc = new SomeClass();
    // System.out.println(sc.method2(11));

    // CREATING OBJECT TO OVERRIDE
    C2 c2 = new C2();
    c2.method();


  }
}