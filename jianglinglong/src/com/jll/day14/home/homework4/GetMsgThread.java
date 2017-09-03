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
                System.out.println(msg);
                String name = msg.substring(0, msg.indexOf(":"));
                msg= msg.substring(msg.indexOf(":")+1);
                if (msg.equals("list")){
                	sendMsg.println(name+":你好，在线用户"+Sever.clientMap.size()+"共人.");
                	sendMsg.flush();
                    Set<String> keySet = Sever.clientMap.keySet();
                    for(String key : keySet){
                        sendMsg.println(ip+":"+ key + "," + Sever.clientMap.get(key));
                        sendMsg.flush();
                    }
                }
                if(msg.equals("exit")){
                	sendMsg.print(ip+":再见"+name+",欢迎下次使用");
                	sendMsg.flush();
                	Sever.removeClient(name);
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
//            Sever.removeClient(ip);
            try {
                getMsg.close();
            } catch (IOException e) {

            }
        }
    }
}
