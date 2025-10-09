package com.tsola2002.ch04_strings_iostreams_files;

public class Strings {

  public static void main(String[] args) {
    // length();
    // isEmpty();
    // indexOf();
    charAt();
  }


  private static void charAt(){
    String s3 = "bayo";
    int index  = s3.indexOf("o");
    if(index != -1){
      char value = s3.charAt(index);
      System.out.println("Character value of index "
          + index + " is: " + value);
    } else {
      System.out.println("Character not found");
    }

  }

  private static void indexOf(){
    String s2 = "023145678";
    System.out.println(s2.indexOf("1"));
  }
  private static void isEmpty(){
    System.out.println("".isEmpty());
  }

  private static void length(){
    String s1  = "50000";
    System.out.println(s1.length());
  }

}
