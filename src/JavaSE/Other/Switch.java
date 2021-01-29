package JavaSE.Other;


/*
switch 后面只能是以下数据类型
基本数据类型： byte/short/char/int
引用数据类型： String enum
 */
public class Switch {
    public static void main(String[] args){
        int num = 1;
         switch(num){
            case 1:
                System.out.println("M");
                //break;
            case 2:
                System.out.println("T");
                break;
            case 3:
                System.out.println("W");
                break;
            case 4:
                System.out.println("Th");
                break;
            case 5:
                System.out.println("F");
                break;
            case 6:
                System.out.println("Sa");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("incorrect number");
                break;
        }
    }
}
/*
另外， 如果不写break， 会继续从匹配的case执行，直到下一个break， 或switch整体结束而结束。遇到下一个case， case会穿透，直接执行case下的语句
break： 结束本层循环
continue： 结束本层本次循环
 */