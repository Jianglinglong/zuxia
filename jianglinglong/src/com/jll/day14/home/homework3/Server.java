package com.jll.day14.home.homework3;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        System.out.println("Server is start !");
        try {
            serverSocket = new ServerSocket(9090);
            socket = serverSocket.accept();
            BufferedReader getMsgFormClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter sendMsgToClient = new PrintWriter(socket.getOutputStream());
            BufferedReader getMsgFormConsle = new BufferedReader(new InputStreamReader(System.in));
            int count = 0;
            while (true) {
                String msg = getMsgFormClient.readLine();
                System.out.println(msg);
                sendMsgToClient.println("Server:第" +count+"次通信."+msg /*getMsgFormConsle.readLine()*/);
                sendMsgToClient.flush();
                System.out.println(getMsgFormClient.readLine());
            }
        } catch (IOException e) {
           System.out.println(e.getMessage());
        }finally {
            try {
                serverSocket.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
