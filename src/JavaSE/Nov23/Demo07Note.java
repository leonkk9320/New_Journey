package JavaSE.Nov23;
/*
多个catch中的参数类型存在继承关系，一定要，先子后父
若先父后子：try中子父类异常对象都可以赋值给第一个catch的父类类名（多态），第二个catch（子类），不会执行
 */

/*
如果finally有return语句，永远返回finally中的结果，避免该情况
 */
public class Demo07Note {
    public static void main(String[] args) {
        int a = getA();
        System.out.println(a);
    }

    private static int getA(){
        int a = 10;
        try{
            return a;
        }catch(Exception e){
            System.out.println(e);
        }finally{
            a = 100;
            return a;//永远执行return的100， 避免在finally里写return
        }

    }
}
