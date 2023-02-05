package HelloWorld;

import java.text.DecimalFormat;
import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
//        double num = Math.random();
//        System.out.println(num);
//        System.out.println(num * 10);

        //DecimalFormat
//        double a = Math.random() * 10;
//        DecimalFormat two = new DecimalFormat("#.00"); // "0.00"
//        String str = two.format(a);
//        System.out.println(str);

        // String.format
        double b = Math.random() * 10;
        if((int)b < 1) {
            System.out.println("随机数b整数位小于1：" + b);
            b = 1.00;
        }
        String str2 = String.format("%.2f", b);
        System.out.println(str2);
    }
}
