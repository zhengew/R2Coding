package com.rtc.method;

public class MethodAttentionDemo4 {
    public static void main(String[] args) {
//        方法的编写顺序无所谓。
        System.out.println(add(1, 2));
//        方法与方法之间是平级关系，不能嵌套定义。
//        方法的返回值类型为void（无返回值），方法内则不能使用return返回数据，如果方法的返回值类型写了具体类型，方法内部则必须使用return返回对应类型的数据。
        print();
//        return语句下面，不能编写代码，因为永远执行不到，属于无效的代码。
//        方法不调用就不执行,  调用时必须严格匹配方法的参数情况。
//        print(1); 'print()' in 'com.rtc.method.MethodAttentionDemo4' cannot be applied to '(int)'

//        有返回值的方法调用时可以选择定义变量接收结果，或者直接输出调用，甚至直接调用；无返回值方法的调用只能直接调用。

        // 输出调用
        System.out.println(add(1, 2));

        // 直接调用
        add(20, 30);

    }

    public static int add(int a, int b){
        return a + b;
//        System.out.println(1); // Unreachable statement
    }

    public static void print(){
        System.out.println("Hello World");
//        return 21; // Cannot return a value from a method with void result type
    }
}
