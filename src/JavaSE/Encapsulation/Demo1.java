package JavaSE.Encapsulation;
/*
面对对象三大特性： 封装， 继承， 多态

封装性：1.方法  2.private

封装就是将细节隐藏，对于外界不可见
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] array = {5, 15, 25, 20, 100};
        int max = getMax(array);
        System.out.println("最大值： " + max);
    }

    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }

        }
        return max;
    }
}
