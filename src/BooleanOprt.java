public class BooleanOprt {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a && b); // false
        System.out.println(a & b); // false
        System.out.println(a || b); // true
        System.out.println(a | b); // true

        System.out.println(a || (10 / 0 > 1)); // true
        System.out.println(a | (10 / 0 > 1)); // /by zero 异常
    }
}
