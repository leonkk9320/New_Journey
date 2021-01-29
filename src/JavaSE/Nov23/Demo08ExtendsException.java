package JavaSE.Nov23;
/*
只需要记住：父类异常什么样，子类就什么样
 */
public class Demo08ExtendsException {
    public void show01() throws NullPointerException, ClassCastException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws IndexOutOfBoundsException{}
    public void show04() throws Exception{}
}

class Zi extends Demo08ExtendsException{
    //子类重写父类方法时，抛出和父类相同异常
    public void show01() throws NullPointerException, ClassCastException{}
    //子类重写父类方法时，抛出和父类异常的子类
    public void show02() throws ArrayIndexOutOfBoundsException{}
    //子类重写父类方法时，不抛出异常
    public void show03(){}
    //父类没有抛出异常，子类也不能抛出异常，若有异常，只能捕获（try catch），不能抛出
    public void show04(){
        try{
            throw new Exception("编译期异常");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
