package com.tsola2002.ch04_strings_iostreams_files;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadData {

    public static void main(String[] args) {
        try{
            // creating inputStream object
            FileInputStream input = new FileInputStream("outputstream.txt");
            int data;
            while((data = input.read()) != -1){ //read() returns -1 at end of file
                System.out.println((char)data);
            }
            //close the stream
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
