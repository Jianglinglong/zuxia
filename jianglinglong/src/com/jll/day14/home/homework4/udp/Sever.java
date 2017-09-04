package com.jll.day14.home.homework4.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Sever {
    public static void main(String[] args){
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(9898);

        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
