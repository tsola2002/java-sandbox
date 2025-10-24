package com.tsola2002.ch07_network;

import java.net.*;

public class UdpServer {

    public static void main(String[] args) throws Exception {
        // creating a socket
        DatagramSocket socket = new DatagramSocket(9876);
        byte[] receiveBuffer = new byte[1024];
        System.out.println("UDP Server is running...");

        while(true){
            DatagramPacket receivePacket =
                    new DatagramPacket(receiveBuffer,
                            receiveBuffer.length);
            socket.receive(receivePacket);

            String message = new String(receivePacket.getData(),
                    0, receivePacket.getLength());
            System.out.println("Received:" + message);

            // reply back to client
            String reply =  "Server Received: " + message;
            byte[] sendBuffer = reply.getBytes();
            InetAddress clientAddress = receivePacket.getAddress();
            int clientPort = receivePacket.getPort();

            DatagramPacket sendPacket = new DatagramPacket(sendBuffer,
                    sendBuffer.length,clientAddress, clientPort);

            socket.send(sendPacket);
        }
    }
}
