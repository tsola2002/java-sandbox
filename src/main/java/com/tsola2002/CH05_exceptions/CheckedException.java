package com.tsola2002.CH05_exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

    public static void main(String[] args) {


        try {
            FileReader reader = new FileReader("nonexistent.txt");
        } catch( FileNotFoundException e){
            System.out.println("File Not Found: " + e.getMessage());
        }

    }
}
