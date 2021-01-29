package JavaSE.Oct26.Demo03SendRedPacket;

import java.util.ArrayList;
import java.util.Random;

public class Receiver extends User{
    public Receiver() {
    }

    public Receiver(String name, int balance) {
        super(name, balance);
    }

    public void receive(ArrayList<Integer> arr){
        if (arr.isEmpty()){
            return;
        }
        int index = new Random().nextInt(arr.size());//匿名对象
        //remove 方法返回被删除的内容
        int delta = arr.remove(index);

        super.setBalance(super.getBalance() + delta);
    }
}
