package JavaSE.Oct21.ExtendsMethod;

public class Zi extends Fu {
    public  void methodZi(){
        System.out.println("son method implemented!");
    }
    //方法重写
    @Override
    public void method(){
        System.out.println("same name method implemented! Zi");
    }
}
