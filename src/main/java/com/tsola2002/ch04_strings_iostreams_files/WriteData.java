package com.tsola2002.ch04_strings_iostreams_files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteData {

    public static void main(String[] args) {
        try{
            // create object for the file we will write to
            FileOutputStream output = new FileOutputStream("outputstream.txt");
            // create text that will go into the file
            String message = "This text was created by our code";
            // write the text above to our file(outputstream.txt)
            output.write(message.getBytes());
            // closing the stream
            output.close();
            System.out.println("Data Written Successfully");
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
