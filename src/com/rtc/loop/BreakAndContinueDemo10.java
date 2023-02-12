package com.rtc.loop;

public class BreakAndContinueDemo10 {
    public static void main(String[] args) {
        // 目标： 理解 break 和 continue的作用
        // 场景：假如你又有老婆了，然后你犯错了， 你老婆罚你做5天家务，每天都是洗碗，但是洗碗第三天后原谅你了，不用洗了

        for (int i = 1; i < 6; i++) {
            if (i > 3){
                System.out.println("第" + i + "天不用洗了，老婆原谅你了");
                break; // 跳出并结束当前循环的执行
            }
            System.out.println("洗碗第" + i + "天!");
        }

        System.out.println("------------------");
        // continu 跳出当前循环的当次执行，进入循环的下一次
        // 场景：假如你又有老婆了，然后你犯错了， 你老婆罚你做5天家务，
        // 每天都是洗碗，但是洗碗第三天后心软了，原谅你不用洗了，但是依然不解恨，继续洗第4天第5天

        for (int i = 1; i <= 5; i++) {
            if (i == 3){
                continue; // 立即跳出循环的当次执行，进入循环的下一次
            }
            System.out.println("洗碗~~~的第" + i + "天");

        }

//        if (true){
//            break; // Break outside switch or loop
//        }


    }
}
