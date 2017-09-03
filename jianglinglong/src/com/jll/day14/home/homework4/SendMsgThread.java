package com.jll.day14.home.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SendMsgThread extends Thread {
    private Socket socket;
    private String ip;

    public SendMsgThread(Socket socket ,String ip) {
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
            do {
            	msg = editMsg.readLine();
                sendMsg.println(ip+":"+msg);
                sendMsg.flush();
                sleep(1000);
            }while (!msg.equals("exit"));
            editMsg.close();
            sendMsg.close();
        } catch (Exception e) {
            try {
                editMsg.close();
                sendMsg.close();
            } catch (IOException e1) {
                System.out.println("Send:" + e.getMessage());
            }
        } 
    }
}
