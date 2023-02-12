package com.rtc.branch;

/**
 * 目标: 学会使用if分支结构解决问题，理解其流程
 * */
public class IfDemo1 {
    public static void main(String[] args) {
        // 需求： 心跳(60 - 100) 之间是正常的，否则系统提示进一步检查
        // 格式1: if (条件表达式) {代码块};
        int heartBeat = 90;
        if (heartBeat < 60 || heartBeat > 100){
            System.out.println("您的心跳数据是：" + heartBeat + ",您可能需要进一步检查");
        }
        System.out.println("检查结束!");

        // 格式2: if (条件表达式){代码块} else {代码块};
        // 需求： 发红包
        double money = 1;
        // 发送一个1314红包
        if (money >= 1314){
            System.out.println("您当前发送红包成功!");
            money -= 1314;
        } else{
            System.out.println("余额不足!");
        }

        // 格式3：if (条件表达式){代码块} else if (条件表达式){代码块} ... else {代码块}
        // 需求：绩效系统： 0 - 60 C， 60 - 80 B, 80 - 90 A, 90 - 100 A+
        int score = 199;
        if (score >= 0 && score < 60){
            System.out.println("您本月的额绩效是C");
        } else if(score >= 60 && score < 80){
            System.out.println("您本月的绩效是B");
        } else if(score >= 80 && score < 90){
            System.out.println("您本月的绩效是A");
        } else if(score >= 90 && score < 100){
            System.out.println("您本月的绩效是A+");
        } else{
            System.out.println("您录入的数据不合法!");
        }


    }
}
