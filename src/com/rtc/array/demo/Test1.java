package com.rtc.array.demo;

public class Test1 {
    public static void main(String[] args) {
        // 需求：某部门5名员工的销售额分别是：16、26、36、6、100，请计算出他们部门的总销售额
        int[] money = {16, 26, 36, 6, 100};
        int sum = 0; // 求和变量累加数组的元素值
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println("部门总销售额：" + sum + "元");
    }
}
