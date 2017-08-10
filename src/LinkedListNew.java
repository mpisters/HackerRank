import java.util.LinkedList;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedListNew {
    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }

    public static  Node insert(Node head,int data) {
        Node current = head;
        if (head != null) {
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        } else{
            head = new Node(data);
        }
        return head;
    }


}
