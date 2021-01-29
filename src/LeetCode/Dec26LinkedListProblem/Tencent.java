package LeetCode.Dec26LinkedListProblem;

public class Tencent {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        LinkedList ll = new LinkedList();
        ll.add(n1);
        ll.add(n2);
        ll.add(n3);
        ll.inverse();
        ll.traverse();
    }
}

class LinkedList {
    private Node head = new Node(0);

    public void add(Node node){
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = node;
    }

    //反转链表的本质是头插法
    public void inverse(){
        if(head.next == null || head.next.next == null){
            return;
        }

        Node reverse = new Node(0);
        Node cur = head.next;
        Node next = null;
        while(cur != null) {
            next = cur.next;
            cur.next = reverse.next;
            reverse.next = cur;
            cur = next;
        }
        head = reverse;
    }

    public void traverse(){
        Node tmp = head;
        if(tmp.next == null){
            System.out.println("empty LL");
        }
        while(tmp.next != null){
            System.out.println(tmp.next);
            tmp = tmp.next;
        }
    }



}

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return "Node: " + value;
    }
}
