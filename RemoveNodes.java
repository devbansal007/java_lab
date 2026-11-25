import java.util.*;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveNodes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        int x = sc.nextInt();

        // Remove matching nodes from the beginning of the list.
        while (head != null && head.val == x) {
            head = head.next;
        }

        // Remove matching nodes from the rest of the list.
        Node temp = head;

        while (temp != null && temp.next != null) {
            if (temp.next.val == x) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        if (head == null) {
            System.out.println("Empty");
        } else {
            temp = head;

            while (temp != null) {
                System.out.print(temp.val);

                if (temp.next != null) {
                    System.out.print(" ");
                }

                temp = temp.next;
            }

            System.out.println();
        }

        sc.close();
    }
}
