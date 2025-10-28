package com.tsola2002.ch07_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WebsiteLoader {
    public static void main(String[] args) throws Exception {
        // create object for url
        URL url = new URL("https://freebiesbug.com/");
        // create object for connection to the url
        URLConnection connection = url.openConnection();
        // creating object to read website information
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
        );
        String line;
        while((line = reader.readLine()) !=null){
            System.out.println(line);
        }
        reader.close();
    }
}
