package com.jll.day14.home.homework3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Date;
import java.util.UUID;

public class Client {
    public static void main(String[] args) {
        UUID randomUUID = UUID.randomUUID();
        Date todat = new Date();
        boolean stop = false;
        try {
            //向本机的9090端口发出客户请求
            Socket socket = new Socket(InetAddress.getLocalHost(), 9090);
            System.out.println("client start ...");
            PrintWriter sendMsg = new PrintWriter(socket.getOutputStream());
            //有Socket对象的得到输入流 getMsg
            BufferedReader getMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //获得控制台输入的高级输入流 editMsgToSend
            BufferedReader editMsgToSend = new BufferedReader(new InputStreamReader(System.in));
            while (!stop) {
                sendMsg.println("Client:"/*+randomUUID.toString()*/+editMsgToSend.readLine()+"\n" + todat.toString());
//                sendMsg.flush();
//                sendMsg.println(editMsgToSend.readLine());
                sendMsg.flush();
                System.out.println(getMsg.readLine());

            }
            sendMsg.flush();
            sendMsg.close();
            socket.close(); //关闭Socket
        } catch (Exception e) {
            System.out.println("can not listen to:" + e.getMessage());//出错，打印出错信息
        }


    }
}
/*    //由系统标准输入设备构造BufferedReader对象
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //由Socket对象得到输出流，并构造PrintWriter对象
    PrintWriter write = new PrintWriter(socket.getOutputStream());
    //由Socket对象得到输入流，并构造相应的BufferedReader对象
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));*/
//            String readline;
//            readline = br.readLine(); //从系统标准输入读入一字符串
//            while (!readline.equals("end")) {
//                //若从标准输入读入的字符串为 "end"则停止循环
//                write.println(readline);
//                //将从系统标准输入读入的字符串输出到Server
//                write.flush();
//                //刷新输出流，使Server马上收到该字符串
//                System.out.println("Client:" + readline);
//                //在系统标准输出上打印读入的字符串
//                System.out.println("Server:" + in.readLine());
//                //从Server读入一字符串，并打印到标准输出上
//                readline = br.readLine(); //从系统标准输入读入一字符串
//            } //继续循环
//            write.close(); //关闭Socket输出流
//            in.close(); //关闭Socket输入流