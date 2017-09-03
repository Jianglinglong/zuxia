package com.jll.day14.home.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Sever {

    public static HashMap<String, Socket> clientMap = new HashMap<>();

    public static void main(String[] args) {
    	Sever sever = new Sever();
        ServerSocket serverSocket = null;
        Socket socket = null;
        System.out.println("Server is start !");
        boolean run = true;
        try {
            serverSocket = new ServerSocket(9090);
            while (run) {
                socket = serverSocket.accept();
                sever.isExist(socket);
                Thread get = new GetMsgThread(socket, "sever");
                get.start();
            }
            serverSocket.close();
        } catch (Exception e) {
            System.out.println("Server:"+e.getMessage());
        }
    }
    public boolean isExist(Socket socket) throws IOException {
    	String msg;
    	System.out.println("Client " + socket.toString() + " is connect");
        PrintWriter sendMsg = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        sendMsg.println("请输入昵称");
        sendMsg.flush();
        BufferedReader getMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        msg = getMsg.readLine();
        while (true) {
            if (!clientMap.containsKey(msg)){
                clientMap.put(msg,socket);
                break;
            }
            sendMsg.println("请重新输入昵称");
            sendMsg.flush();
            msg = getMsg.readLine();
        }
        sendMsg.println("现在可以使用list命令查看在线用户");
        sendMsg.flush();
    	return true;
    }
    public static boolean removeClient(String clientName) {
        return clientMap.remove(clientName, clientMap.get(clientName));
    }
}
