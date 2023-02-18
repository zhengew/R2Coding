package com.rtc.practice;

import java.util.Random;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        // 随机6个红球号码(1~33不能重复)， 随机一个蓝球号码(1~16), 用数组保存起来作为中奖号码
        int[] luckNum = createLuckNumbers();
        printStr(luckNum);
        int[] userNum = userInputNumbers();
        printStr(userNum);

        // 打印中奖金额
        judge(luckNum, userNum);
    }

    /* 随机一组中奖号码 */
    public static int[] createLuckNumbers(){
        int[] redBall = new int[6];
        int[] luckNum = new int[redBall.length + 1]; // 保存6位红色球号码，1位蓝色球号码
        
        // 6个不重复的红色球号码
        int index = 0; // 标志位
        Random r = new Random();
        while (true){
            redBall[index] = r.nextInt(33) + 1; // [1, 33]
            int temp = redBall[index];
            // 如果数字重复，就跳过本次循环，继续生成随机数，直到不重复为止
            if (existYN(luckNum, temp)){
                continue;
            }
            luckNum[index] = redBall[index];
            index++;
            // 如果 index 大于 redBall数组长度 - 1，终止循环
            if (index > redBall.length - 1){
                break;
            }
        }
        
        // 1个蓝色球号码
        luckNum[luckNum.length-1] = r.nextInt(16) + 1; // [1, 16]
        return luckNum; // 返回最终的中奖号码
    }

    /* 用户输入一组双色球号码返回 */
    public static int[] userInputNumbers(){
        // 用户先输入6个红色球号码，不能重复
        int[] redBall = new int[6];
        int[] userNum = new int[redBall.length + 1]; // 保存6位红色球号码，1位蓝色球号码

        // 6个不重复的红色球号码
        int index = 0; // 标志位
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("请输入第" + (index + 1) + "个红色球号码,范围[1, 33]：");
            redBall[index] = sc.nextInt(); // [1, 33]
            int temp = redBall[index];
            if (temp >= 1 && temp <= 33){
                // 如果数字重复，就跳过本次循环，继续生成随机数，直到不重复为止
                while (existYN(userNum, temp) == true || temp < 1 || temp > 33) {
                    System.out.println("您输入的红色球号码[" + temp + "],数字重复或数据范围不是[1, 36]，请重新输入：");
                    temp = sc.nextInt(); // [1, 33]
                }
                redBall[index] = temp;
                userNum[index] = redBall[index];
                index++;
            }else{
                System.out.println("您输入的号码有误，红色球号码范围是1~33,请重新输入!");
                continue;
            }
            // 如果 index 大于 redBall数组长度 - 1，终止循环
            if (index > redBall.length - 1){
                break;
            }
        }

        // 1个蓝色球号码
        System.out.println("请输入一个蓝色球号码，范围[1, 16]: ");
        userNum[userNum.length-1] = sc.nextInt(); // [1, 16]

        return userNum; // 返回最终的用户彩票号码
    }

    /* 传入2组号码，判断用户中奖情况*/
    public static void judge(int[] luckNumbers, int[] userNumbers){
        // 红色球命中数
        int redballNum = 0;
        // 蓝色球命中数
        int blueballNum = userNumbers[userNumbers.length-1] == luckNumbers[luckNumbers.length-1] ? 1 : 0;
        for (int i = 0; i < userNumbers.length - 1; i++) {
            if (userNumbers[i] == luckNumbers[i]){
                redballNum++;
            }
        }
        // 判断中奖金额
        String money = "";
        if (redballNum == 6 && blueballNum == 1){
            money = "最高1000万";
        } else if(redballNum == 6 && blueballNum == 0){
            money = "最高500万";
        } else if(redballNum == 5 && blueballNum == 1){
            money = "3000元";
        } else if(redballNum == 5 && blueballNum == 0 || redballNum == 4 && blueballNum == 1){
            money = "200元";
        } else if(redballNum == 4 && blueballNum == 0 || redballNum == 3 && blueballNum == 1){
            money = "10元";
        } else if(redballNum == 2 && blueballNum == 1 || redballNum == 1 && blueballNum == 1 || redballNum == 0 && blueballNum == 1){
            money = "5元";
        } else {
            money = "0元";
        }

        System.out.println("您红色球命中数为：" + redballNum + "，蓝色球命中数为：" + blueballNum + ",中奖金额为：" + money);
    }

    /* 判断元素在数组中是否存在*/
    public static boolean existYN(int[] arr, int num){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                flag = true;
            }
        }
        return flag;
    }

    /* 打印中奖号码 */
    public static void printStr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print( i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.print("]");
        System.out.println(); //换行
    }
}
