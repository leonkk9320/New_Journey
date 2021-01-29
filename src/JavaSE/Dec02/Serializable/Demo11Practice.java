package JavaSE.Dec02.Serializable;

import java.io.*;
import java.util.ArrayList;

/*
练习：
    序列化集合
    一个文件中保存多个对象
    过个对象存到一个集合里面
    对集合进行序列化和反序列化
 */
public class Demo11Practice {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建对象集合
        ArrayList<Person> al = new ArrayList<>();
        al.add(new Person("迪丽热巴",18));
        al.add(new Person("古力娜扎",20));
        al.add(new Person("玛尔扎哈",22));

        //序列化
        ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream
                        ("//Users//leonzhang//Desktop//Java//src//JavaSE//Dec02//Serializable//ArrayListPerson.txt"));
        oos.writeObject(al);

        //反序列化
        ObjectInputStream ois = new ObjectInputStream
                (new FileInputStream
                        ("//Users//leonzhang//Desktop//Java//src//JavaSE//Dec02//Serializable//ArrayListPerson.txt"));
        Object o = ois.readObject();
        if(o instanceof ArrayList){
            ArrayList<Person> alp = (ArrayList<Person>)o;
            for(Person p : alp){
                System.out.println(p);
            }
        }
        oos.close();
        ois.close();
    }
}
