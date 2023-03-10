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
            System.out.println("3、退出系统");

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
                case 3:
                    // 退出系统
                    System.out.println("退出系统，请收好您的卡片及随身物品！");
                    return;
                default:
                    System.out.println("您输入的操作命令不存在");
            }
        }
    }

    /**
     * 登录功能
     * @param accounts 全部账户对象的集合
     * @param sc 扫描器
     */
    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("*************系统登录操作***************");
        // 1. 判断账户集合中是否存在账户，如果不存在账户，登录功能不能进行
        if (accounts.size() == 0){
            System.out.println("对不起，当前系统中，无任何账户，请先开户，再来登录～～～");
            return; // 谓语言风格，结束方法的执行
        }
        // 2.正式进入登录操作
        Account account = null;
        while (true) {
            System.out.println("请输入您的卡号：");
            String cardId = sc.next();
            // 3.判断卡号是否存在，根据卡号去账户集合中查询账户对象
            account = getAccountById(accounts, cardId);
            if (account != null) {
                // 卡号存在
                // 4.让用户输入密码，认证密码
                while (true) {
                    System.out.println("请输入您的密码：");
                    String password = sc.next();
                    if (account.getPassword().equals(password)) {
                        System.out.println(account.getUserName() + "贵宾，欢迎您进入系统，您的卡号：" + account.getCardId());
                        // 展示登录后的操作页
                        showUserCommand(account, sc, accounts);
                        return; // 干掉登录方法
                    } else {
                        System.out.println("您的密码有误，请确认！");
                    }
                }
            }else {
                System.out.println("不存在该卡号！");
            }
        }
    }

    /**
     * 展示登录后的操作页面
     */
    private static void showUserCommand(Account account, Scanner sc, ArrayList<Account> accounts) {
        while (true) {
            System.out.println("*********欢迎您进入ATM系统用户操作界面**************");
            String[] commands = {"查询:", "存款:", "取款:", "转账:", "修改密码:", "退出:", "注销当前账户:"};
            for (int i = 0; i < commands.length; i++) {
                System.out.println((i+1) + ":" + commands[i]);
            }

            System.out.println("请选择：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    // 查询账户(展示当前登录的账户)
                    showAccount(account);
                    break;
                case 2:
                    // 存款
                    depositMoney(account, sc);
                    break;
                case 3:
                    // 取款
                    drawMoney(account, sc);
                    break;
                case 4:
                    // 转账功能
                    transferMoney(sc, account, accounts);
                    break;
                case 5:
                    // 修改密码
                    updatePassWord(account, sc);
                    return; // 返回首页
                case 6:
                    // 退出登录
                    System.out.println("退出成功，欢迎下次光临");
                    return; // 让当前方法停止执行
                case 7:
                    // 销户功能
                    // 从当前账户集合中，删除当前账户对象
                    if (deleteAccount(account, accounts, sc)) {
                        // 销户成功
                        return; // 让当前方法停止执行，跳出去
                    } else {
                        // 没有销户成功
                        break;
                    }
                default:
                    System.out.println("您输入的操作命令不正确");
            }
        }
    }

    /**
     * 用户销户
     * @param account
     * @param accounts
     * @param sc
     */
    private static boolean deleteAccount(Account account, ArrayList<Account> accounts, Scanner sc) {
        System.out.println("****************用户销户操作*****************:");
        String cardId = account.getCardId();
        System.out.println("您正在对账户[" + cardId + "]进行销户操作，请确认是否销户？Y/N");
        String selected = sc.next().strip().toUpperCase();
        switch (selected){
            // 真正的销户
            // 从账户集合中，删除当前账户对象，完成销户
            case "Y":
                if (account.getMoney() > 0){
                    System.out.println("您当前账户余额没有取完，不允许销户~");
                } else {
                    accounts.remove(account);
                    System.out.println("账户:" + cardId + ",销户成功，返回首页");
                    return true; // 销户成功
                }
                break;
            default:
                System.out.println("取消销户,当前账户继续保留～");
        }
        return false; // 取消销户
    }

    /**
     * 修改密码
     * @param account 当前登录账户对象
     * @param sc 扫描器
     */
    private static void updatePassWord(Account account, Scanner sc) {
        System.out.println("****************修改密码操作*****************:");
        while (true) {
            System.out.println("请您输入当前账户密码：");
            String pwd = sc.next();
            // 1.判断密码是否正确
            if (pwd.equals(account.getPassword())) {
                //认证通过
                while (true) {
                    System.out.println("请您输入新的密码：");
                    String pwdFirst = sc.next();
                    System.out.println("请确认新密码: ");
                    String pwdSecond = sc.next();
                    if (pwdFirst.equals(pwdSecond)) {
                        // 2次密码一致，可以修改
                        account.setPassword(pwdFirst);
                        System.out.println("密码修改成功，请您重新登录!");
                        return;
                    } else {
                        // 2次密码不一致，不可以修改
                        System.out.println("密码确认失败，请重新输入！");
                    }
                }
            } else {
                // 认证不通过
                System.out.println("您输入的密码不正确!");
            }
        }
    }

    /**
     * 转账功能
     * @param sc 扫描器
     * @param account 当前登录账户对象
     * @param accounts 全部账户的集合
     */
    private static void transferMoney(Scanner sc, Account account, ArrayList<Account> accounts) {
        System.out.println("****************用户转账操作*****************:");
        // 1.判断是否足够2个账户
        if (accounts.size() < 2){
            System.out.println("当前系统中账户不足2个，不能进行转账，请去开户吧～～");
            return; // 结束当前方法
        }

        // 2.判断当前账户是否有钱
        if (account.getMoney() == 0){
            System.out.println("您当前账户余额为0，不能转账！");
            return; // 结束当前方法
        }

        // 3.真正开始转账
        while (true) {
            // 用户输入对手方账户，判断对方账户是否存在
            System.out.println("请输入转账账户：");
            String tradeAcc = sc.next();
            // 这个卡号不能是自己的卡号
            if (tradeAcc.equals(account.getCardId())){
                System.out.println("对不起，您不可以给自己进行转账~~~");
                continue; // 结束当次执行，死循环进入下一次
            }

            // 判断对手方账户是否存在，根据卡号查询对手方账户对象
            Account transferAcc = getAccountById(accounts, tradeAcc);
            if (transferAcc == null) {
                System.out.println("对不起，您输入的对手方账户不存在!");
            } else {
                // 对手方账户对象存在，继续认证对手方姓氏
                String userName = transferAcc.getUserName();
                System.out.println("您当前要为*" +
                        userName.substring(1) + "转账!\n请您输入姓氏确认：");
                String preName = sc.next();

                // 认证姓氏是否输入正确
                if (userName.startsWith(preName)) {
                    while (true) {
                        // 认证通过，开始转账
                        System.out.println("请输入转账金额：");
                        double money = sc.nextDouble();
                        // 判断当前账户余额是否大于转账金额
                        if (account.getMoney() < money) {
                            System.out.println("当前账户余额不足，您最多可以转账：" + account.getMoney() + "元");
                        } else {
                            // 余额足够，可以转账
                            // 我放账户减去转账金额
                            account.setMoney(account.getMoney() - money);
                            // 对手方账户加上转账金额
                            transferAcc.setMoney(transferAcc.getMoney() + money);
                            System.out.println("转账成功,您的账户还剩余：" + account.getMoney() + "元");
                            return; // 转账成功，结束转账
                        }
                    }
                } else {
                    System.out.println("姓氏确认失败，请重新确认！");
                }

            }
        }
    }

    /**
     * 取款
     * @param account 当前账户对象
     * @param sc 扫描器
     */
    private static void drawMoney(Account account, Scanner sc) {
        System.out.println("****************用户取款操作******************:");
        // 1.判断余额是否大于100
        if (account.getMoney() < 100.00) {
            System.out.println("账户余额不足100元，不能取钱～");
            return;
        }
        while (true) {
            // 2.提示用户输入取款金额
            System.out.println("请您输入取款金额：");
            double money = sc.nextDouble();

            // 3.判断金额是否满足要求
            if (money > account.getQuotaMoney()) {
                System.out.println("您当前取款金额超过了当次取款限额：" + account.getQuotaMoney());
            } else {
                if (money > account.getMoney()) {
                    System.out.println("您当前账户余额不足，当前余额：" + account.getMoney());
                } else {
                    account.setMoney(account.getMoney() - money);
                    System.out.println("恭喜您，取款成功，当前账户信息如下：");
                    // 查询账户信息
                    showAccount(account);
                    return; // 结束取款功能
                }
            }
        }
    }

    /**
     * 存钱
     * @param account 当前账户对象
     * @param sc 扫描器
     */
    private static void depositMoney(Account account, Scanner sc) {
        System.out.println("****************用户存款操作******************:");
        System.out.println("请您输入存款的金额：");
        double money = sc.nextDouble();
        // 当前余额加上存款金额
        account.setMoney(account.getMoney() + money);
        System.out.println("恭喜您，存钱成功，当前账户信息如下：");
        // 查询账户信息,查看余额
        showAccount(account);
    }

    /**
     * 展示账户信息
     * @param account
     */
    private static void showAccount(Account account) {
        System.out.println("****************您的账户信息如下******************:");
        System.out.println("卡号:" + account.getCardId());
        System.out.println("姓名:" + account.getUserName());
        System.out.println("余额:" + account.getMoney());
        System.out.println("当次取现额度:" + account.getQuotaMoney());
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
