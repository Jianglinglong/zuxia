package com.jll.day14.home.homework4;

import java.io.*;
import java.net.Socket;
import java.util.Set;

public class GetMsgThread extends Thread {
    private Socket socket;
    private String ip;

    public GetMsgThread(Socket socket, String clientNum) {
        this.socket = socket;
        this.ip = clientNum;
    }

    public void run() {
        BufferedReader getMsg = null;
        try {
            //获取客户端消息
            String msg;
            PrintWriter sendMsg = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            getMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (( msg = getMsg.readLine())!=null) {
//                if(Sever.clientMap.size()==0){
//                    break;
//                }
                System.out.println(msg);
                if (msg.equals("list")){
                    Set<String> keySet = Sever.clientMap.keySet();
                    for(String key : keySet){
                        sendMsg.println(key + "," + Sever.clientMap.get(key));
                        sendMsg.flush();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Get:"+ip+"-" + e.getMessage());
            try {
                socket.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        } finally {
            Sever.clientMap.remove(ip);
            try {
                getMsg.close();
                this.stop();
            } catch (IOException e) {

            }
        }
    }
}