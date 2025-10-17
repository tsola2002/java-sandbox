package com.tsola2002.ch04_strings_iostreams_files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCharacter {

    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("outputcharacter.txt");
            writer.write("Hello From Writer Class \n");
            writer.write("we are on a new line");
            writer.close();
            System.out.println("Data written successfully");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
