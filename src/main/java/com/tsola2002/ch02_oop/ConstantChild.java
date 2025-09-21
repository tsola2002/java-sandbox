package com.tsola2002.ch02_oop;

public class ConstantChild extends Constant {

    public ConstantChild(String b, String s) {
      super(b, s);
    }

     // THIS WILL NOT WORK BECAUSE WE CANNOT OVERRIDE GREET
     //      public final void greet(){
     //        System.out.println("Hello From greet");
     //      }

}
