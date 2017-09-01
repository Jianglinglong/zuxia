package com.jll.day14.home.homework4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket socket;
        Thread get;
        Thread send;
        try {
            socket = new Socket(InetAddress.getLocalHost(), 9090);
            String ip ;
            System.out.println("Client is start !");
            BufferedReader editMsg = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter sendMsg = new PrintWriter(socket.getOutputStream());
            String msg;
            BufferedReader getMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(getMsg.readLine());
            msg = editMsg.readLine();
            while (true) {
                sendMsg.println(msg);
                sendMsg.flush();
                ip = getMsg.readLine();
                if(ip.contains("list")){
                    System.out.println(ip);
                    break;
                }
                System.out.println(ip);
                msg = editMsg.readLine();
            }
            get = new GetMsgThread(socket, msg);
            send = new SendMsgThread(socket,msg);
            send.start();
            get.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
