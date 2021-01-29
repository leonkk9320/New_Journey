package LeetCode.Dec24ArrayQueue;

public class RingQueue {
}


class RingArrayQueue{
    private int maxSize; //数组最大容量
    private int front; //头 第一个数据的index
    private int rear; //尾 是最后一个存有数据的下一个index
    private int[] arr; // 用于存放数据

    //创建队列
    public RingArrayQueue(int max){
        maxSize = max;
        arr = new int[maxSize];
        front = 0;
        rear = 0;
    }

    //判断队列是否满的
    public boolean isFull(){
        return (rear + 1) % maxSize == front; //rear 的下一个index指向 front
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

        arr[rear] = value;
        rear = (rear + 1) % maxSize; //防止越界
    }

    //取出数据，出队列
    public int getQueue(){
        if(this.isEmpty()){
            throw new RuntimeException("队列空，不能取数据～");
        }

        int v = arr[front];
        front = (front + 1) % maxSize;
        return v;
    }

    //显示数据
    public void show(){
        if(this.isEmpty()){
            System.out.println("队列为空，无法遍历～");
            return;
        }

        for(int i = front; i <= front + (rear - front + maxSize) % maxSize; i++){
            System.out.print(arr[i % maxSize] + " ");
        }
        //(rear - front + maxSize) % maxSize 是队列长度
    }
}
