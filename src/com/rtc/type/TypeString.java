package com.rtc.type;

public class TypeString {
    public String getCurr(){
        String data = "[\"GBP/CNY\", \"HKD/CNY\", \"AUD/CNY\", \"USD/CNY\"]";
        System.out.println(data);
        String[] curr = data.replaceAll("[\\[\\]\"\\s]", "").split(",");
        int index = 0;
        for(int i = 0; i < curr.length; i++){
//            System.out.println(curr[i]);
            if (curr[i].indexOf("HKD") != -1){
                index = i;
                System.out.println(curr[i]);
            }
        }
        return curr[index];
    }

    public static void main(String[] args) {
        TypeString type = new TypeString();
        String curr = type.getCurr();
        System.out.println(curr);

    }
}
