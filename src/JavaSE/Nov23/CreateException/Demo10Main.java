package JavaSE.Nov23.CreateException;

import java.util.Scanner;

public class Demo10Main {
    //1.数据库操作
    static String[] usernames = {"迪丽热巴", "古力娜扎","玛尔扎哈"};

    public static void main(String[] args) /*throws Demo09RegisterException*/ {
        //2.使用Scanner获取用户输入的注册用户名（页面，前段）
        Scanner sc = new Scanner(System.in);
        System.out.println("用户名：");
        String username = sc.next();
        checkUserName(username);
    }

    //3.对用户输入的用户名进行判断
    private static void checkUserName(String n) /*throws Demo09RegisterException*/ {
        for(String name : usernames){
            if(name.equals(n)){
                try {
                    throw new Demo09RegisterException("亲，该用户名已注册");//【相当于产生的异常，抛到catch里】
                } catch (Demo09RegisterException e) {
                    e.printStackTrace();
                    return; //结束方法
                }
            }
        }

        System.out.println("注册成功！");
    }



}
