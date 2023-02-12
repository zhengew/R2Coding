package com.rtc.loop;

public class ForForDemo9 {
    public static void main(String[] args) {
        // 目标：理解嵌套循环的执行流程
        // 场景：加入你有老婆，然后你犯错了，你老婆罚你说5天，每天3句我爱你

        for (int i = 1; i <= 5; i++) {
            System.out.println("第" + i + "天:");

            for (int j = 0; j < 3; j++) {
                System.out.println("老婆，我爱你!");
            }

            System.out.println();
        }

        // 案例：需求：在控制台使用 * 打印出4行5列的矩形
        /**
         *****
         *****
         *****
         *****
         */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
