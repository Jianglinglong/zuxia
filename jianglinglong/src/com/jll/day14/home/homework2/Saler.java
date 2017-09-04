package com.jll.day14.home.homework2;

public class Saler {
    private int five;
    private int ten;
    private int ershi;
    private boolean wait = false;

    public Saler() {
        five = 3;
        ten = 0;
        ershi = 0;
        wait = false;
    }

    synchronized public void saleTickt(int money) {
        if (five > 2 || (five == 1 && ten == 1) || money==5) {
            switch (money) {
                case 5:
                    five++;
                    break;
                case 10:
                    ten++;
                    five--;
                    System.out.println("找你5元");
                case 20:
                    ershi++;
                    if (five > 2) {
                        five -= 3;
                        System.out.println("找你3张5元");
                    } else {
                        ten--;
                        five--;
                        System.out.println("找你10元、5元各一张");
                    }
            }
            System.out.println("拿好您的票");
        }else {
            System.out.println("找不开,请等待");
            wait = true;
        }
    }
}
