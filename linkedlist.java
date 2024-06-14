//import java.util.LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedlist {
    Node head = null;

    public void insertFirst() {
        Node newNode = new Node(5);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void insertLast() {
        Node newNode = new Node(9);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curNode = head;
        while(curNode.next!= null){
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    public void insertMiddle() {
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("list empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("list empty");
            return;
        }
        Node curNode = head;
        Node t2 = head.next;
        while (curNode.next != null) {
            t2 = curNode;
            curNode = curNode.next;
        }
        t2.next = null;
    }

    public void deleteMiddle() {
    }

    public static void main(String[] args) {
       //// LinkedList obj = new LinkedList();
    }

}
