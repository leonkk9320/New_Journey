package LeetCode.Dec25LinkedList;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        Node node1 = new Node(1, "宋江", "及时雨");
        Node node2 = new Node(2, "卢俊义", "玉麒麟");
        Node node3 = new Node(3, "吴用", "智多星");
        Node node4 = new Node(4, "林冲", "豹子头");

        SingleLinkedList sll = new SingleLinkedList();
        sll.addByOrder(node4);
        sll.addByOrder(node3);
        sll.addByOrder(node2);
        sll.addByOrder(node1);
        sll.addByOrder(node1);
        sll.deleteNode(1);
        sll.deleteNode(5);

        sll.traverse();
    }
}

class SingleLinkedList {
    private Node head = new Node(0,"","");
    //尾端添加
    public void add(Node node){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    //删除节点
    public boolean deleteNode(int no){
        Node tmp = head;
        while(tmp.next != null){
            if(tmp.next.no == no){
                break;
            }
            tmp = tmp.next;
        }
        if(tmp.next == null){
            System.out.println("没有此节点！");
            return false;
        }else{
            tmp.next = tmp.next.next;
            return true;
        }


    }

    //中间添加，按照排名添加，如果有这个排名，添加失败
    public boolean addByOrder(Node node){
        Node temp = head;
        while(temp.next != null){
            //重复
            if(temp.next.no == node.no){
                return false;
            }
            //小于，指向下一个
            if(temp.next.no < node.no) {
                temp = temp.next;
                continue;
            }
            //大于，退出循环
//            if(temp.next.no > node.no){
//                break;
//            }
            break;
        }
        //非链表尾
        node.next = temp.next;
        temp.next = node;
        return true;
    }

    //遍历链表
    public void traverse(){
        if(head.next == null){
            System.out.println("空!");
            return;
        }
        Node temp = head;
        while(temp.next != null){
            System.out.println(temp.next);
            temp = temp.next;
        }
    }
}

class Node {
    public int no;
    public String name;
    public String nickName;
    public Node next; // 指向下一个节点， next 存的是一个地址， 是一个指针！

    //constructor
    public Node(int no, String name, String nickName){
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}