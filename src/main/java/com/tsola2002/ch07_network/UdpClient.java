package com.tsola2002.ch07_network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        InetAddress serverAddress =
                InetAddress.getByName("localhost");
        String message = "Hello From UDP Client!!!";
        byte[] sendBuffer =message.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(
                sendBuffer, sendBuffer.length, serverAddress,
                9876
        );
        socket.send(sendPacket);

        byte[] receiverBuffer = new byte[1024];
        DatagramPacket receivePacket =
                new DatagramPacket(receiverBuffer, receiverBuffer.length);
        socket.receive(receivePacket);

        String response = new String(receivePacket.getData(), 0
        , receivePacket.getLength());
        System.out.println("Response from Server" + response);
        socket.close();
    }
}
