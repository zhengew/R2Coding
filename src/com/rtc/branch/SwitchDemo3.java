package com.rtc.branch;

public class SwitchDemo3 {
    public static void main(String[] args) {
        // 目标: 清楚switch的注意点，并在开发时候注意。

//    - 表达式类型只能是 byte short int char, JDK5开始支持枚举，JDK7开始支持String，不支持 double float long
//        double a = 0.1 + 0.2;
//        System.out.println(a); // 0.30000000000000004

//        long lg = 20;
//        switch (lg){
//            pass
//        }


//    - case 给出的值不允许重复，且只能是字面量，不能是变量
        int a1 = 3;
        switch (3){
            case 3:
                break;
//            case 3: //java: case 标签重复
//                break;
//            case a1: // java: 需要常量表达式
//                break;
            default:
                break;
        }
//    - 不要忘记写break，否则会出现穿透现象
        switch(123){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
            default:
                System.out.println("默认分支");
        }

    }
}
