import java.util.Scanner;

public class LinkedListpos{
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    public LinkedListpos() {
        head = null;
    }

    public void insertEnd(int val) {
        Node newnode = new Node(val);

        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void insertBegin(int s) {
        Node newnode = new Node(s);

        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void insertAtPosition(int val, int pos) {
        Node newnode = new Node(val);

        if (pos == 1) {
            newnode.next = head;
            head = newnode;
        } else {
            Node temp = head;
            int count = 1;
            while (temp != null && count < pos - 1) {
                temp = temp.next;
                count++;
            }

            if (temp == null) {
                System.out.println("Position out of bounds");
                return;
            }

            newnode.next = temp.next;
            temp.next = newnode;
        }
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedListpos list = new LinkedListpos();

        System.out.print("Enter the number of elements: ");
        int m = sc.nextInt();
        if (m <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        for (int i = 0; i < m; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int val = sc.nextInt();
            list.insertEnd(val);
        }

        System.out.print("Enter the element to insert at the beginning: ");
        int s = sc.nextInt();
        list.insertBegin(s);

        System.out.print("Enter the position to insert a new element: ");
        int pos = sc.nextInt();
        System.out.print("Enter the element to insert at position " + pos + ": ");
        int newVal = sc.nextInt();
        list.insertAtPosition(newVal, pos);

        list.display();
    }
}