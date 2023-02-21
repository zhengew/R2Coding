package com.rtc.string;

public class StringAPIOtherDemo5 {
    public static void main(String[] args) {
//      public int length()	返回此字符串的长度
        String name = "我爱你中国love";
        System.out.println(name.length());  // 9

//      public char charAt(int index)	获取某个索引位置处的字符
        char c = name.charAt(1);
        System.out.println(c);

        System.out.println("------遍历字符串中的每个字符--------");
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            System.out.println(ch);
        }
//      public char[] toCharArray()：	将当前字符串转换成字符数组返回
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            System.out.println(ch);
        }
//      public String substring(int beginIndex, int endIndex) 	根据开始和结束索引进行截取，得到新的字符串（包前不包后）
        String name2 = "Java是最厉害的编程语言";
        String rs = name2.substring(0, 9);
        System.out.println(rs);

        String rs1 = name2.substring(4,9); // Java是最厉害的
        System.out.println(rs1); // 是最厉害的

//      public String substring(int beginIndex) 	从传入的索引处截取，截取到末尾，得到新的字符串
        String rs2 = name2.substring(4);
        System.out.println(rs2);  // 是最厉害的编程语言

//      public String replace(CharSequence target, CharSequence replacement) 	使用新值，将字符串中的旧值替换，得到新的字符串
        String name3 = "金三胖是最厉害的80后，金三胖棒棒的！我好爱金三胖";
        String rs3 = name3.replace("金三胖", "***"); // ***是最厉害的80后，***棒棒的！我好爱***
        System.out.println(rs3);


//      boolean  contentEquals(CharSequence cs)    Compares this string to the specified CharSequence.
        System.out.println(name3.contains("金三胖")); // true
        System.out.println(name3.contains("金二胖")); // false

//      boolean startsWith(String prefix)    Tests if this string starts with the specified prefix.
//      boolean startsWith(String prefix, int toffset)    Tests if the substring of this string beginning at the specified index starts with the specified prefix.
        System.out.println(name3.startsWith("金三胖")); // true
        System.out.println(name3.startsWith("金三胖是最厉害的")); // true
        System.out.println(name3.startsWith("金三胖是最厉害的2")); // false


//      public String[] split(String regex) 	根据传入的规则切割字符串，得到字符串数组返回
        String name4 = "王宝强,贾乃亮,陈羽凡";
        String[] names = name4.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.print("选择了" + names[i] + "\t");
        }
    }
}
