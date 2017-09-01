package com.jll.day14.home.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SendMsgThread extends Thread {
    private Socket socket;
    private byte[] clientNum;

    public SendMsgThread(Socket socket,byte[] clientNum) {
        this.socket = socket;
        this.clientNum = clientNum;
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
            while ((msg = editMsg.readLine())!=null) {
                sendMsg.println(msg);
                sendMsg.flush();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            sendMsg.close();
            try {
                editMsg.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
