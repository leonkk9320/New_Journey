package JavaSE.Oct21.ExtendsField;

public class Fu {
    int fu = 10;
    int num = 100;

    public void methodFu(){
        //使用本类当中的，不会向下找子类
        System.out.println(num);
    }
}
