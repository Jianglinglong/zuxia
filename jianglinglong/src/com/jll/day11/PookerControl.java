package com.jll.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import com.jll.day011.Pooker;
/**
 * 扑克牌功能 V1.0
 * 洗牌、发牌、看牌
 * @author Direct
 *
 */
public class PookerControl {
	public static void main(String[] args) {
		PookerControl.init();
		PookerControl.xipa();
		ArrayList<Map<String,String>> player1 = new ArrayList<Map<String,String>>();
		ArrayList<Map<String,String>> player2 = new ArrayList<Map<String,String>>();
		ArrayList<Map<String,String>> player3 = new ArrayList<Map<String,String>>();
		do{
			player1.add(PookerControl.getPook());
			if(PookerControl.list.size()>3) {
				player2.add(PookerControl.getPook());
			}
			if(PookerControl.list.size()>3) {
				player3.add(PookerControl.getPook());
			}
		}while(PookerControl.list.size()>3);
		System.out.println("玩家一的牌:");
		PookerControl.show(player1);
		System.out.println("\n玩家二的牌:");
		PookerControl.show(player2);
		System.out.println("\n玩家三的牌:");
		PookerControl.show(player3);
		System.out.println("\n底牌:");
		PookerControl.show(PookerControl.list);
	}
	public static ArrayList<Map<String,String>> list = new ArrayList<Map<String,String>>();
	public static void init() {
		for(int i = 0 ; i < 4 ; i ++)
		{
			for (int j = 0 ; j < 13 ; j ++)
			{
				String strCount = Integer.toString(j+1);
				switch(j) {
					case 1:
						strCount="A";
						break;
					case 10:
						strCount="J";
						break;
					case 11:
						strCount="Q";
						break;
					case 12:
						strCount="K";
						break;
				}
				Map<String,String> map = new HashMap<String,String>();
				switch(i) {
					case 0:
						map.put("黑桃",strCount);
					break;
					case 1:
						map.put( "红桃",strCount);
					break;
					case 2:
						map.put( "梅花",strCount);
					break;
					case 3:
						map.put( "方块",strCount);
					break;
				}
				list.add(map);
			}
		}
		Map<String,String> map = new HashMap<String,String>();
		map.put("大王", "大王");
		list.add(map);
		Map<String,String> map1 = new HashMap<String,String>();
		map.put("小王", "小王");
		list.add(map1);
//		sreturn list;
	}
	public static void xipa() {
		Collections.shuffle(list);
	}
	public static Map<String,String> getPook() {
		return list.remove(0);
	}
	public static void show(List<Map<String,String>>player1) {
		for(Map<String,String> pook : player1) {
			System.out.print(pook+",");
		}
	}
	public static void sort(List<Map<String,String>>player) {
	}
}
