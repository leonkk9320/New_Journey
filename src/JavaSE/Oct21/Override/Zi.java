package JavaSE.Oct21.Override;

public class Zi extends Fu {
    @Override //不报错，则是重写
    public String method(){
        return null;//返回String <= Object
    }
}
