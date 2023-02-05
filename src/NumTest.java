public class NumTest {
    public static void main(String[] args) {
        double a = Math.random() * 10;
        int b = (int)a;
        if ((int)a < 1){
            System.out.println("小于1");
            a = 1.00;
        }

        System.out.println(b);
        System.out.println(a);

    }
}
