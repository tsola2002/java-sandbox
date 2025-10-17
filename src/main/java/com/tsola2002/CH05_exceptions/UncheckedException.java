package com.tsola2002.CH05_exceptions;

public class UncheckedException {

    public static void main(String[] args) {
        // WRITING AN UNCHECKED EXCEPTION
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
    }
}
