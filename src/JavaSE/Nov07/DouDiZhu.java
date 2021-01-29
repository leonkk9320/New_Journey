package JavaSE.Nov07;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();//大小不变，其实用数组更方便
        l1.add("黑桃");
        l1.add("红心");
        l1.add("梅花");
        l1.add("方片");

        ArrayList<String> l2 = new ArrayList<>();//大小不变，其实用数组更方便
        for (int i = 2; i <= 10; i++) {
            String s = i + "";
            l2.add(s);
        }
        l2.add("A");
        l2.add("J");
        l2.add("Q");
        l2.add("K");
        //组合牌
        ArrayList<String> l3 = new ArrayList<>();
        for (String value : l1) {
            for (String s : l2) {
                l3.add(value + s);
            }
        }
        l3.add("大王");
        l3.add("小王");

        //洗牌
        Collections.shuffle(l3);

        //玩家牌与底牌集合
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> left = new ArrayList<>();

        //发牌
        for (int i = 0; i < l3.size(); i++) {
            if(i < 51){
                if(i % 3 == 0){
                    p1.add(l3.get(i));
                }else if(i % 3 == 1){
                    p2.add(l3.get(i));
                }else{
                    p3.add(l3.get(i));
                }
            }else{
                left.add(l3.get(i));
            }
        }

        //看牌
        for(String s : p1){
            System.out.print(s + " ");
        }
        System.out.println("");

        for(String s : p2){
            System.out.print(s + " ");
        }
        System.out.println("");

        for(String s : p3){
            System.out.print(s + " ");
        }
        System.out.println("");

        for(String s : left){
            System.out.print(s + " ");
        }

    }
}
