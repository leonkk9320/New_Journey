package JavaSE.Oct26.Demo03SendRedPacket;

import java.util.ArrayList;

public class Host extends User{

    public Host() {
    }

    public Host(String name, int balance) {
        super(name, balance);
    }

    public ArrayList<Integer> send(int totalMoney, int count){
        int part = totalMoney / count;
        int mod =  totalMoney % count;
        ArrayList<Integer> arr = new ArrayList<>();

        //余额不足的情况
        if(super.getBalance() < totalMoney){
            System.out.println("余额不足");
            return arr;
        }

        //添加红包，最后一个红包里有余数
        for (int i = 0; i < count-1; i++) {
            arr.add(part);
        }
        arr.add(part+mod);

        super.setBalance(super.getBalance() - totalMoney);
        return arr;
    }
}
