package JavaSE.Nov01.Final;

/*
final 指不可改变

Oct26 demo04 part5

常见四种用法：
1. 修饰一个类 //Myclass
2. 修饰一个方法 //Fu Zi
3. 修饰局部变量 //Demo01fianl，Student
4. 修饰成员变量 //Person
 */
public class Demo01Final {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        num = 20;
        System.out.println(num);

        final int NUM;// = 100;
        //Cannot assign a value to final variable 'NUM'
        NUM = 250; //局部变量可以进行一次赋值
//        NUM = 100;
        System.out.println(NUM);
        final Student STU = new Student("Aguero");
        //stu 储存的地址值不能变，指向的对象不能变
        //STU = new Student("leon");

        //可以改变地址指向对象的内容
        STU.setName("aguero");
    }
}
