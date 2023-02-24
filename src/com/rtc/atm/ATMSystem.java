package com.rtc.atm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * ATM系统的入口类
 */
public class ATMSystem {
    public static void main(String[] args) {
        // 1. 定义账户类
        // 2. 定义一个集合容器，负责以后存储全部账户对象，进行相关的业务操作
        ArrayList<Account> accounts = new ArrayList<>();
        // 3.展示系统的首页
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("******************ATM系统**************************");
            System.out.println("1、账户登录");
            System.out.println("2、账户开户");
            System.out.println("请您选择操作: ");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    // 用户登录
                    login(accounts, sc);
                    break;
                case 2:
                    // 用户账户开户（option + enter 快捷生成方法）
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("您输入的操作命令不存在");
            }
        }
    }

    /**
     * 账户登陆功能实现
     * @param accounts 接收账户的集合
     */
    private static void login(ArrayList<Account> accounts, Scanner sc) {
        // 1.用户输入卡号,校验卡号是否存在
        Account account = null;
        OUT:
        while (true) {
            System.out.println("请输入您的卡号：");
            String cardId = sc.next();
            // 根据卡号查询账户对象
            account = getAccountById(accounts, cardId);
            if (account == null) {
                System.out.println("不存在该卡号！");
            }else {
                // 2.用户输入密码，校验密码是否正确
                while (true) {
                    System.out.println("请输入您的密码：");
                    String password = sc.next();
                    if (account.getPassword().equals(password)) {
                        System.out.println(account.getUserName() + "贵宾，欢迎您进入系统，您的卡号：" + account.getCardId());
                        break OUT;
                    } else {
                        System.out.println("您的密码有误，请确认！");
                    }
                }
            }
        }
    }

    /**
     * 用户开户功能的实现
     * @param accounts 接收账户的集合
     */
    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("************系统开户操作**************");
        // 1.创建一个账户对象，用户后期封装账户对象
        Account account = new Account();

        // 2.录入当前账户的信息，注入到账户对象中去
        System.out.println("请输入您的姓名：");
        String userName = sc.next();
        account.setUserName(userName);
        // 校验两次密码是否相同
        String password = getEqualsPassword(sc);
        account.setPassword(password);

        // 设置取现额度
        System.out.println("请设置每次取现额度：");
        double quotaMoney = sc.nextDouble();
        account.setQuotaMoney(quotaMoney);

        // 为账户随机一个8位且与其他账户卡号不重复的号码(独立功能，独立成方法)
        Random random = new Random();
        String cardId = getRandomCardID(accounts, random);
        account.setCardId(cardId);

        // 3.账户对象添加到集合中去
        accounts.add(account);
        System.out.println(account.getUserName() + "贵宾,您的账户已经开卡成功，您的卡号是:" + account.getCardId());
    }

    /**
     * 校验两次密码输入是否相同，返回两次输入相同的密码
     * @return
     */
    private static String getEqualsPassword(Scanner sc) {
        String pwdFirst = "";
        while (true) {
            System.out.println("请输入您的密码: ");
            pwdFirst = sc.next();
            System.out.println("请您再次确认密码: ");
            String pwdSecond = sc.next();
            if (pwdSecond.equals(pwdFirst)) {
                break;
            }else {
                System.out.println("两次密码输入不一致,请重新输入密码！");
            }
        }
        return pwdFirst;
    }

    /**
     * 生成未注册的8位随机卡号
     * @param accounts 保存账户对象的集合
     * @return cardId
     */
    private static String getRandomCardID(ArrayList<Account> accounts, Random random) {
        // 循环判断，如果account对象为null时，卡号不重复
        while (true) {
            String cardId = getEightDigitRandomNumber(random); // 8位长度卡号
            Account account = getAccountById(accounts, cardId);
            if (account == null){
                return cardId;
            }
        }
    }

    /**
     * 根据卡号查询账户对象
     * @param accounts
     * @param cardId
     * @return 账户对象 | null
     */
    private static Account getAccountById(ArrayList<Account> accounts, String cardId){
        Account account = null;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getCardId().equals(cardId)){
                account = accounts.get(i);
                break;
            }
        }
        return account;
    }

    /**
     * 生成8位随机数字字符串
     * @return eightDigitNumber
     */
    private static String getEightDigitRandomNumber(Random random) {
        String eightDigitNumber = ""; // 卡号
        for (int i = 0; i < 8; i++) {
            eightDigitNumber += random.nextInt(10);
        }
        return eightDigitNumber;
    }


}
