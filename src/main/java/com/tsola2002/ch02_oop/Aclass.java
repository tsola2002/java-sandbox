package com.tsola2002.ch02_oop;

public class Aclass implements A {

  @Override
  public int m(String s) {
    return 0;
  }

  @Override
  public int m(String s, double d) {
    return 0;
  }

  @Override
  public int m(String s, int i) {
    return A.super.m(s, i);
  }
}
