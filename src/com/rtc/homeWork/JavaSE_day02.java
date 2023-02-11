package com.rtc.homeWork;

import java.util.Scanner;

public class JavaSE_day02 {

//    编程题一
//    需求:
//    身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：
//    儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
//    女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
//    现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？
    private String getHeight(){
        double fatherHeight = 177;
        double motherHeight = 165;
        double sonHeight = (fatherHeight + motherHeight) * 1.08 / 2;
        double girlHeight = (fatherHeight * 0.923 + motherHeight) / 2;
        return "儿子的身高：" + sonHeight + "cm, 女儿的身高: " + girlHeight + "cm\n";
    }

//    编程题二
//    需求:
//    定义一个int类型的变量,初始化值为1234,求这个数的个位,十位,百位,千位分别是多少?
//
//    运行效果:
//            1234的个位是4,十位是3,百位是2,千位是1
    private String getNum(){
        // 1. 假设有一个int类型的数字1234，分别求出每一位数字
        int n = 1234;
        int ge = n % 10; // 4
        int shi = n / 10 % 10; // 3
        int bai = n / 100 % 10; // 2
        int qian = n / 1000; // 1
        return ge + "\n" + shi + "\n" + bai + "\n" + qian + "\n";
    }
//    题目三
//    某外卖商家的菜品单价如下:
//            1.鱼香肉丝每份24元,油炸花生米每份8元,米饭每份3元。
//            2.优惠方式:
//    总金额大于100元,总金额打9折,其它无折扣
//    3.需求:
//    小明购买了3分鱼香肉丝,3份花生米,5份米饭,最终需要付多少钱?

    private String getPayMoney(){
        double yuxiangrousi = 24.0;
        double youzhahuashengmi = 8.0;
        double mifan = 3.0;

        double cost = yuxiangrousi * 3 + youzhahuashengmi * 3 + mifan * 5;
        double actualPrice = cost > 100.0 ? cost * 0.9 : cost;
        return "小明吃饭花费的原价是:"  + cost + ", 最终花费是：" + actualPrice + "\n";
    }
//    编程题4
//    需求:
//    动物园里有两只老虎，已知两只老虎的体重分别为180kg、200kg，
//    请用程序实现判断两只老虎的体重是否相同。
    private String tigerWeightEquals(){
        double tigerWeight1 = 180.0;
        double tigerWeight2 = 200.0;

        return "两只老虎体重分别是：" + tigerWeight1 + "、" + tigerWeight2 +
                ", 体重是否相等: " + (tigerWeight1 == tigerWeight2 ? "相等" : "不想等") + "\n";
    }

//    编程题5
//    需求:
//    一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm，
//    请用程序实现获取这三个和尚的最高身高。
    private String getMaxHeight(){
        int h1 = 150;
        int h2 = 210;
        int h3 = 165;

        return "三个和尚身高分别是: " + h1 + "、 " + h2 + "、 " + h3 +
                "，最高身高是: " + (h1 > h2 ? (h1 > h3 ? h1 : h3) : (h2 > h3 ? h2 : h3)) + "\n";
    }


    public static void main(String[] args) {
        JavaSE_day02 base = new JavaSE_day02();

        System.out.println("编程题1");
        String res1 = base.getNum();
        System.out.println(res1);

        System.out.println("编程题2");
        String res2 = base.getHeight();
        System.out.println(res2);

        System.out.println("编程题3");
        String res3 = base.getPayMoney();
        System.out.println(res3);

        System.out.println("编程题4");
        String res4 = base.tigerWeightEquals();
        System.out.println(res4);

        System.out.println("编程题5");
        String res5 = base.getMaxHeight();
        System.out.println(res5);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身高(cm)：");
        double h1 = sc.nextDouble();
        System.out.println("请输入身高(cm)：");
        double h2 = sc.nextDouble();
        System.out.println("请输入身高(cm)：");
        double h3 = sc.nextDouble();

        double maxHeight = h1 > h2 ? (h1 > h3 ? h1 : h3) : (h2 > h3 ? h2 : h3);
        System.out.println("身高最高的是: " + maxHeight);

    }
}
