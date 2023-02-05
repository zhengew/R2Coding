package HelloWorld;

public class OprtNotChangeVaribaleValue {
    public static void main(String[] args) {
        int a = 100;
        System.out.println(a + 1); // 101
        System.out.println(a); // 100

        a = a + 6; // 赋值运算
        System.out.println(a); // 106
    }
}
