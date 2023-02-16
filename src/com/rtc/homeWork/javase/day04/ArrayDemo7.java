package com.rtc.homeWork.javase.day04;

/*题目7（综合）
小李用自己的钱买了十只股票，年末他看了各只股票的收益分别是10.4%,-3%,-6.2%,1.2%,-6.1%,-19%,-3.8%,0.9%,-4.5%,5.5%。
请使用数组相关知识编程，帮他统计赚钱的股票和赔钱的股票分别有多少只？打印效果如下：
赚钱的股票一共有：4只
赔钱的股票一共有：6只
*/

public class ArrayDemo7 {
    public static void main(String[] args) {
        double[] stock = {10.4, -3, -6.2, 1.2, -6.1, -19, -3.8, 0.9, -4.5, 5.5};
        int countZhengShu = 0;
        int countFuShu = 0;
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] >= 0){
                countZhengShu++;
            }else{
                countFuShu++;
            }
        }

        System.out.println("赚钱的股票一共有：" + countZhengShu + "只");
        System.out.println("赔钱的股票一共有：" + countFuShu + "只");
    }
}
