package com.tsola2002.ch04_strings_iostreams_files;

import java.io.FileReader;
import java.io.IOException;

public class ReadCharacter {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("outputcharacter.txt");
            int character;
            while((character = reader.read()) != -1){
                System.out.print((char) character);
            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
