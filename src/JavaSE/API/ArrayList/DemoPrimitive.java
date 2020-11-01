package JavaSE.API.ArrayList;
import java.util.ArrayList;
/*
需要"包装类" 来向array list 中储存基本数据类型
基本类型        包装类（引用类型， 位于java.lang）
byte            Byte
short           Short
int             Integer (special)
long            Long
float           Float
double          Double
char            Character (special)
boolean         Boolean

JDK 1.5 开始
自动装箱： 基本类型 -> 包装类型
自动拆箱： 包装类型 -> 基本类型
 */
public class DemoPrimitive {
    public static void main(String[] args) {
        //不可，范型内只能是引用类型
        //ArrayList<int> list2 = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        System.out.println(list2);

        String s;
    }
}
