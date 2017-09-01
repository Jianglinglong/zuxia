package com.jll.day14.home.homework4;

import java.net.ServerSocket;
import java.net.Socket;

public class Sever {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        System.out.println("Server is start !");
        byte[] clientNum ;
        boolean run = true;
        try {
            serverSocket = new ServerSocket(9090);
            while (run) {
                socket = serverSocket.accept();
                clientNum = socket.getInetAddress().getAddress();
                System.out.println("Client " + socket.getInetAddress().getHostAddress()+" is connect");
                new GetMsgThread(socket, clientNum).start();
                new SendMsgThread(socket,clientNum).start();
            }
            serverSocket.close();
        } catch (Exception e) {
            System.out.println( e.getMessage());
        }
    }
}
