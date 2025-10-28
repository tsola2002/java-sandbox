package com.tsola2002.ch07_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("TCP Server is running on port 5000...");

        Socket socket  = serverSocket.accept();
        System.out.println("Client Connect");

        BufferedReader input = new
                BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

        String message  = input.readLine();
        System.out.println("Received: " + message);
        output.println("Server reply: " + message.toLowerCase());

        socket.close();
        serverSocket.close();
    }
}
