package com.jll.day14.home.homework4;

import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        Thread get = null;
        Thread send = null;
        try {
            socket = new Socket(InetAddress.getLocalHost(), 9090);
            byte[] ip = InetAddress.getLocalHost().getAddress();
            System.out.println("Client is start !");
            get = new GetMsgThread(socket, ip);
            send = new SendMsgThread(socket, ip);
            /*get.setDaemon(true);
            send.setDaemon(true);*/
            get.start();
            send.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
