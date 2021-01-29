package JavaSE.Nov03.Demo01ObjectClass;

import java.util.Objects;
/*
Objects类的equals方法，防止空指针异常
public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }
 */
public class Demo03Objects {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "aaa";

//        boolean b = s1.equals(s2);//比较内容 String类重写了Object的equals方法
//        System.out.println(b); 空指针异常

        boolean b2 = Objects.equals(s1,s2);
        System.out.println(b2);
    }
}
