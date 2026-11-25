import java.util.*;

class Node {
    int val;
    Node next;

    Node() {
        this.val = 0;
        this.next = null;
    }

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Main {

    public static int sum(Node head) {
        int total = 0;
        Node temp = head;

        while (temp != null) {
            total += temp.val;
            temp = temp.next;
        }

        return total;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Sum of linked list: " + sum(head));
    }
}
