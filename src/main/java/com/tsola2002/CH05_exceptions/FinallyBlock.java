package com.tsola2002.CH05_exceptions;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
        } catch(ArithmeticException e){
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("Error or No Error " +
                    "This block always executes");
        }
    }
}
