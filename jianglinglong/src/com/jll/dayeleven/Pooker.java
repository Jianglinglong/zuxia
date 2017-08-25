package com.jll.dayeleven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
/**
 * 扑克牌功能 V2.0
 * 洗牌、发牌、看牌、齐牌
 * @author Direct
 *
 */
public class Pooker {
	public static Map<Integer ,String> pooks =new HashMap<Integer, String>() ;
	public static String strPook="345678910JQKA2小王大王";
	public static void main(String[] args) {
		Pooker.initialization();
		List<Integer> list = Pooker.shufflePooks();
		List<Integer> player1 = new ArrayList<Integer>();
		List<Integer> player2 = new ArrayList<Integer>();
		List<Integer> player3 = new ArrayList<Integer>();
		int flag = (new Random()).nextInt(49)+1;
		String pookFlag = pooks.get(list.get(flag)); 
		flag %= 3;
		for(int i = 0 ; i < 17 ; i ++) {
			player1.add(list.remove(0));
			player2.add(list.remove(0));
			player3.add(list.remove(0));
		}
		/**
		 * 使用可以变参数简易排序
		 */
		System.out.println("地主是:" + (flag==0?"玩家三":(flag==2?"玩家二":"玩家一"))+"\n地主牌是:"+pookFlag);
		Pooker.sort(list, player1,player2,player3);
		Pooker.showPooks(player1, "玩家一",pookFlag);
		Pooker.showPooks(player2, "玩家二",pookFlag);
		Pooker.showPooks(player3, "玩家三",pookFlag);
		Pooker.showPooks(list, "底牌",pookFlag);
	}
	/**
	 * 初始化扑克牌
	 * 将扑克牌按 0-53的key存入Map中
	 * key值越小，对应的value值扑克牌越大
	 */
	public static void initialization() {
		int keys = 0;
		pooks.put(keys++,"大王");
		pooks.put(keys++, "小王");
		String [] color = {"♠","♥","♣","♦"};
		String [] count = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
		for(String co : count) {
			for(String con : color) {
				pooks.put(keys++, con+co);
			}
		}
	}
	/**
	 * 随机洗牌
	 * @return ArrayList<Integer>
	 * 返回List是随机分布的扑克牌的key值
	 */
	public static List<Integer> shufflePooks() {
		Set<Integer> set = pooks.keySet();
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.shuffle(list);
		return list;
	}
	/**
	 * 通过可以变参数对玩家手中的牌和底牌进行排序
	 * @param pook 底牌
	 * @param lists 玩家受伤的牌
	 */
	public static void sort(List<Integer> pook, List<Integer>...lists) {
		Collections.sort(pook);
		for(List<Integer> list:lists) {
			Collections.sort(list);
		}
	}
	/**
	 * 显示pook的所有牌
	 * @param pook 扑克牌key的List
	 * @param user 地主牌
	 */
	public static void showPooks(List<Integer> pook,String user,String pookFlag) {
		System.out.println(user+"的牌是");
		for(Integer key:pook) {
			String str = pooks.get(key);
//			if(str.equals(pookFlag)) {
//				System.err.print(str+" ");
//			}
			System.out.print(str+" ");
		}
		System.out.println("\n=========================================");
	}
}