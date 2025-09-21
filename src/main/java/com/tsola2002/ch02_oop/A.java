package com.tsola2002.ch02_oop;

public interface A {
  int m(String s);
  int m(String s, double d);
  default int m(String s, int i) { return 1; }
  static int m(String s, int i, double d) {
    return 1;
  }
}
