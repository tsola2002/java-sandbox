package com.tsola2002.ch02_oop;

public class Cat {
  private int claws;
  private String whiskas;
  private Boolean sharpTeeth;

  public Cat(int claws, String whiskas, Boolean sharpTeeth) {
    this.claws = claws;
    this.whiskas = whiskas;
    this.sharpTeeth = sharpTeeth;
  }

  public String devour(){
    System.out.println("I Coming to Devour you!!!!");
    return "I will devour you";
  }

}
