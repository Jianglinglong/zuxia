package com.jll.day14.home.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class GetMsgThread extends Thread {
    private Socket socket;
    private byte[] ip;

    public GetMsgThread(Socket socket, byte[] clientNum) {
        this.socket = socket;
        this.ip = clientNum;
    }

    public void run() {
        BufferedReader getMsg = null;
        try {
            String msg;
            //获取客户端消息
            getMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                if ((msg = getMsg.readLine()) != null) {
                    System.out.println(msg);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                getMsg.close();
                this.stop();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
