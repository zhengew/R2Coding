package com.rtc.practice;

import java.util.Scanner;

/*
需求:
机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
机票最终优惠价格的计算方案如下：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
分析：
键盘录入机票的原价，仓位类型，月份信息，调用方法返回机票最终的优惠价格。
方法内部应该先使用if分支判断月份是是旺季还是淡季，然后使用switch分支判断是头等舱还是经济舱。
选择对应的折扣进行计算并返回计算的结果，如果信息录入有误返回价位为-1元代表即可。

* */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择仓位[1-头等舱， 2-经济舱]：");
        int position = sc.nextInt();
        System.out.println("请输入原价：");
        double price = sc.nextDouble();
        System.out.println("请输入月份：");
        int month = sc.nextInt();

        System.out.println("您选择的仓位是：" +  (position > 1 ? "经济舱" : "头等舱") +
                "，原价是：" + price + "， 折扣价是: " + getTicketPrice(price, position, month));
    }

    /*
     * 获取机票价格，参数 原价、仓位分类、月份，return返回折扣价，如果信息录入有误，返回-1
     * position: 1-头等舱， 2-经济舱
    */
    public static double getTicketPrice(double price, int position, int month){
        if (month >= 5 && month <= 10){
          // 旺季
          switch (position){
              case 1:
                  price *= 0.9;
                  break;
              case 2:
                  price *= 0.85;
                  break;
          }
        } else if (month == 11 || month == 12 || month >= 1 && month <= 4){
            // 淡季
            switch (position){
                case 1:
                    price *= 0.7;
                    break;
                case 2:
                    price *= 0.65;
                    break;
            }
        } else {
            System.out.println("你输入的月份有误！");
            price = -1;
        }
        return price;
    }

}
