package JavaSE.Nov06.GenericType;

import java.util.ArrayList;
import java.util.Collection;

/*
    范型的上限限定： ？ extends E  范型只能用E类型的子类/本身
    范型的下限限定： ？ super E    范型只能用E类型的父类/本身

 */
public class Demo14Wildcard2 {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<Integer>();
        Collection<String> list2 = new ArrayList<String>();
        Collection<Number> list3 = new ArrayList<Number>();
        Collection<Object> list4 = new ArrayList<Object>();

        getElement1(list1);
        //getElement1(list2);//error
        getElement1(list3);
        //getElement1(list4);//error


        //getElement2(list1);//error
        //getElement2(list2);//error
        getElement2(list3);
        getElement2(list4);
    }


    //范型的上限：此时范型？，必须是Number类或Number类的子类
    public static void getElement1(Collection<? extends Number> coll){}

    //范型的下限：此时范型？，必须是Number类或Number类的父类
    public static void getElement2(Collection<? super Number> coll){}
}


