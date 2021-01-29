package JavaSE.Nov22;

import java.util.HashMap;
import java.util.Scanner;

/*
计算一个字符串中每个字符出现的次数
 */
public class Demo07Practice {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String s = keyboard.next();

        HashMap<Character, Integer> map = new HashMap<>();
        char[] charArr = s.toCharArray();
        for (char c : charArr) {
            if (map.containsKey(c)) {
                Integer v = map.get(c);
                v++;
                map.put(c, v);
            } else {
                map.put(c, 1);
            }
        }

        /*
        for (int i = 0; i < charArr.length; i++) {
            if(map.containsKey(charArr[i])){
                Integer v = map.get(charArr[i]);
                v++;
                map.put(charArr[i], v);
            }else{
                map.put(charArr[i], 1);
            }
        }
         */

        for(Character key : map.keySet()){
            Integer v = map.get(key);
            System.out.println(key + "=" + v);
        }


    }
}
