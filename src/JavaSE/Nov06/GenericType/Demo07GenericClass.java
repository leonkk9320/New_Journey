package JavaSE.Nov06.GenericType;

public class Demo07GenericClass {
    public static void main(String[] args) {
        //不写范型，默认Object类型
        Demo06GenericClass gc = new Demo06GenericClass();
        gc.setName("只能是字符串");
        Object obj = gc.getName();

        //使用Integer范型
        Demo06GenericClass<Integer> gc2 = new Demo06GenericClass<>();
        gc2.setName(2);

        int name = gc2.getName();//自动拆箱
        System.out.println(name);
    }
}
