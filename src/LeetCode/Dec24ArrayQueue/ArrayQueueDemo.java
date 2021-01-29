package LeetCode.Dec24ArrayQueue;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue aq = new ArrayQueue(5);
        aq.addQueue(1);
        aq.addQueue(2);
        aq.addQueue(3);
        aq.addQueue(4);
        aq.addQueue(5);
        System.out.println("取第1次： " + aq.getQueue());
        System.out.println("取第2次： " + aq.getQueue());
        System.out.println("取第3次： " + aq.getQueue());
        System.out.println("取第4次： " + aq.getQueue());
        System.out.println("取第5次： " + aq.getQueue());
        //System.out.println("取第6次： " + aq.getQueue());

        System.out.println("=====");

        ArrayQueue aq1 = new ArrayQueue(5);
        aq1.addQueue(1);
        aq1.addQueue(2);
        aq1.addQueue(3);
        aq1.addQueue(4);
        System.out.println("取第1次： " + aq1.getQueue());
        System.out.println("取第2次： " + aq1.getQueue());
        aq1.show();
    }
}

//使用数组模拟队列
class ArrayQueue{
    private int maxSize; //数组最大容量
    private int front; //头
    private int rear; //尾
    private int[] arr; // 用于存放数据

    //创建队列
    public ArrayQueue(int max){
        maxSize = max;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
    }

    //判断队列是否满的
    public boolean isFull(){
        return rear == maxSize-1;
    }

    //判断队列是否为空
    public boolean isEmpty(){
        return front == rear;
    }

    //添加数据到队列,入队列
    public void addQueue(int value){
        if(this.isFull()){
            System.out.println("队列满，不能加入数据~");
            return;
        }

        rear++;
        arr[rear] = value;
    }

    //取出数据，出队列
    public int getQueue(){
        if(this.isEmpty()){
            throw new RuntimeException("队列空，不能取数据～");
        }

        front++;
        return arr[front];
    }

    //显示数据
    public void show(){
        if(this.isEmpty()){
            System.out.println("队列为空，无法遍历～");
            return;
        }

        for(int i = front+1; i <= rear; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
