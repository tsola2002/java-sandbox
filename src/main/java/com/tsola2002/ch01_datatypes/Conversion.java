package com.tsola2002.ch01_datatypes;

public class Conversion {

  public static void main(String[] args) {
    // CONVERT INT TO A DOUBLE
    int i = 123456789;
    double a = (double)i;
    System.out.println(a);

    // CONVERT A LONG TO A FLOAT
    long l1 = 12345678L;
    float f1 = (float)l1;
    System.out.println(f1);

    // CONVERT A FLOAT TO A INT
    float f2 = 1.23456789f;
    int i1 = (int)f2;
    System.out.println(i1);

    // CONVERT A DOUBLE TO A SHORT
    double d2 = 1234.0;
    short s1 = (short)d2;
    System.out.println(s1);


    // WRAPPER CLASS CONVERSION
    int i2 = 123456789;
    double d3 = Integer.valueOf(i2).doubleValue();
    System.out.println(d3);

    // WRAPPER LONG TO A FLOAT
    long l2 = 123456789l;
    float f4 = Long.valueOf(l2).floatValue();
    System.out.println(f4);

    // AUTOBOXING(CONVERTING PRIMITIVE TYPE TO REFERENCE TYPE)
    int i5 = 42;
    System.out.println("i5 is: " + i5);
    Integer i6 = i5;
    System.out.println("i6 is: " + i6);

    // BOXING(CONVERTING REFERENCE TYPE TO PRIMITIVE TYPE)
    Integer i7 = Integer.valueOf(45);
    int i9 = i7.intValue();

  }

}
