package com.tsola2002.ch02_oop;

public class Constant {

  // CREATING A CONSTANT
  private final String s = "abc";
  String b = "bcd";

  public Constant(String b, String s) {
    this.b = b;
    //this.s = "def";
  }

  public final void greet(){
    System.out.println("Hello There");
  }
}


