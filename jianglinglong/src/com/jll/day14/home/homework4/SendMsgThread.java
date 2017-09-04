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
            while (!(msg = editMsg.readLine()).equals("exit")) {
                sendMsg.println(msg);
                sendMsg.flush();
            }

        } catch (Exception e) {
            try {
                editMsg.close();
                sendMsg.close();
            } catch (IOException e1) {
                System.out.println("Send:" + e.getMessage());
            }
        } finally {
            Set<String> keySet = Sever.clientMap.keySet();
            for (String key :keySet){
                String sk = Sever.clientMap.get(key).toString();
                if(sk.equals(socket.toString())){
                    ip=key;
                    break;
                }
            }
            Sever.clientMap.remove(ip);
            sendMsg.close();
            try {
                editMsg.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
