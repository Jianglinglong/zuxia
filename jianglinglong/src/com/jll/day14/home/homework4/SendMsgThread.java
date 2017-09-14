package com.jll.day14.home.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Set;

public class SendMsgThread extends Thread {
    private Socket socket;
    private String ip;
    private boolean status = true;

    public SendMsgThread(Socket socket, String ip) {
        this.socket = socket;
        this.ip = ip;
    }

    public void run() {
        PrintWriter sendMsg = null;
        BufferedReader editMsg = null;


        try {
            //针对socket创建发送信息对象流
            sendMsg = new PrintWriter(socket.getOutputStream());
            //创建标准输入流对象
            editMsg = new BufferedReader(new InputStreamReader(System.in));
            String msg;
            while (true) {
                if(socket==null || socket.isClosed()){
                    break;
                }
                msg = editMsg.readLine();
                if (msg.equalsIgnoreCase("exit")) {
                    break;
                }
                sendMsg.println(ip + ":" + msg);
                sendMsg.flush();
            }
            if (!socket.isClosed()){
                socket.close();
            }
            sendMsg.close();
            editMsg.close();
            Sever.clientMap.remove(ip);
        } catch (Exception e) {
            System.out.println("Send:" + e.getMessage());
        }
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
