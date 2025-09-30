package com.tsola2002.ch01_datatypes;

public class LogicStatements {

  public static void main(String[] args) {
    int one = 21;
    int two = 15;

//    if(one > 18){
//      System.out.println("You're old enough to enter");
//    } else if(one > 10) {
//      System.out.println("Your Not Old Enough to enter");
//    }
//
//    System.out.println("Youre a Toddler!!");

    // TERNARY OPERATOR
//    String s = one > 18 ? "You're Old Enough"
//        : "Your Not Old Enough";
//    System.out.println(s);

    // calling the method
    checkDayOfWeek();
  }

  static void checkDayOfWeek(){
    // SWITCH STATEMENT
    switch(1){
      case 1 -> System.out.println("Monday");
      case 2 -> System.out.println("Tuesday");
      case 3 -> System.out.println("Wednesday");
      case 4 -> System.out.println("Thursday");
      case 5 -> System.out.println("Friday");
      case 6 -> System.out.println("Saturday");
      case 7 -> System.out.println("Sunday");
      default -> System.out.println("Not a day of the week");
    }
  }

}
