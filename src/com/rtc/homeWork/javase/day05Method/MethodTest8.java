package com.rtc.homeWork.javase.day05Method;

import java.util.Random;

/*
题目8（综合扩展）
一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。
请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下：（随机顺序，不一定是下面的顺序）
888元的奖金被抽出
588元的奖金被抽出
10000元的奖金被抽出
1000元的奖金被抽出
2元的奖金被抽出
* */
public class MethodTest8 {
    public static void main(String[] args) {
        int[] money = {2,588,888,1000,10000};
        int[] temp = new int[money.length];

        // 循环随机抽奖，如果已经抽过的就跳过继续抽奖,否则打印抽中的金额
        int index = 0; // 用于while循环遍历的终止条件
        while (true){
            int randomIndex = getRandomIndex(money);
            if (existYN(temp, money[randomIndex])){
                continue;
            }else {
                temp[index] = money[randomIndex];
                System.out.println(temp[index] + "元的奖金被抽出");
                index++;
            }
            if (index >= temp.length){
                break;
            }
        }
    }


    /*
    *   生成数组范围内的随机索引
    * */
    public static int getRandomIndex(int[] arr){
        Random r = new Random();
        return r.nextInt(arr.length);
    }

    /*
        判断元素在数组中是否存在
    * */
    public static boolean existYN(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return true;  // 如果存在返回true
            }
        }
        return false; // 如果不存在返回 false
    }
}
