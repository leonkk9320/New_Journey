package JavaSE.Dec14.CollectionStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
获取stream流两种方法
与
常用方法（demo07讲了 filter 与 forEach）

stream流只能使用一次，使用之后就进入下一个流，上一个流就不能再调用方法了，所以一般用链式编程
 */
public class Demo08StreamMethods {
    public static void main(String[] args) {
        //获取流方法1
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        //获取流方法2
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵强");
        list.add("张强");
        list.add("张三丰");
        Stream<String> stream1 = list.stream();

        //map 方法 String->int
        Stream<String> stream2 = Stream.of("1", "2", "3", "4", "5");
//        Stream<Integer> stream3 = stream2.map((String s) -> {
//            return Integer.parseInt(s);
//        });
        Stream<Integer> stream3 = stream2.map((String s) -> Integer.parseInt(s));

        //count 方法 终结方法，返回long
        long count = stream3.count();
        System.out.println(count);//5

        //limit 方法，选取前n个元素
        Stream<String> stream4 = stream.limit(3);
        stream4.forEach(name -> System.out.println(name));//张三 李四 王五

        //skip 方法，跳过前n个元素
        Stream<String> stream5 = stream1.skip(1);
        stream5.forEach(name -> System.out.println(name));//周芷若 赵强 张强 张三丰 注：从1开始，跳过了第一个元素

        //concat 静态方法，合并流
        Stream<String> s1 = Stream.of("a","b");
        Stream<String> s2 = Stream.of("c","d");
        Stream.concat(s1, s2).forEach(name-> System.out.println(name));//a b c d


    }
}
