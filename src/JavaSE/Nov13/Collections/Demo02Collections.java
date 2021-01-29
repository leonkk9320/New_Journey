package JavaSE.Nov13.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
集合工具类

comparator comparable:
comparable： 自己（this）和别人（参数）比较，自己需要实现Comparable接口，重写比较规则的compareTo方法
comparator： 找第三方裁判比较
 */
public class Demo02Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 添加元素
        Collections.addAll(list, "a", "b", "c", "d", "e");
        // 打乱顺序
        Collections.shuffle(list);
        System.out.println(list);

        ArrayList<Integer> l = new ArrayList<>();
        Collections.addAll(l, 1,2,3,6,5,4);

        //排序1
        //public static <T> void sort(List<T> list): 参数只能是List或者其子类
        Collections.sort(l);
        System.out.println(l);

        /*
        排序自定义类只能重写compareTo方法，该方法在Comparable接口当中
         */
        ArrayList<Person> l2 = new ArrayList<Person>();
        l2.add(new Person("1", 18));
        l2.add(new Person("2", 20));
        l2.add(new Person("3", 15));
        Collections.sort(l2);
        System.out.println(l2);


        //排序2
        Collections.sort(l, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(l);

        //排序2的reference type
        ArrayList<Student> l3 = new ArrayList<>();

        l3.add(new Student("迪丽热巴" ,20));
        l3.add(new Student("古力娜扎" ,18));
        l3.add(new Student("玛尔扎哈" ,22));

        Collections.sort(l3, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(l3);

    }
}
