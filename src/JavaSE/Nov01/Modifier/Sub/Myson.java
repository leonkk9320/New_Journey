package JavaSE.Nov01.Modifier.Sub;

import JavaSE.Nov01.Modifier.Myclass;//不同包继承要import包

public class Myson extends Myclass {
    public void methodSon(){
        System.out.println(super.num);
    }
}
