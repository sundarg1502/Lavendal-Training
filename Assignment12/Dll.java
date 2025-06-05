
import java.util.*;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class Dll {
    Node head;

    void add(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.prev = temp;
    }

    void display() {
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insertatbegin(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }

    void insertatend(int data) {
        add(data);
    }

    void insertatpos(int data, int pos) {
        if (pos == 0) {
            insertatbegin(data);
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            insertatend(data);
            return;
        }
        Node newnode = new Node(data);
        newnode.next = temp.next;
        newnode.prev = temp;
        temp.next.prev = newnode;
        temp.next = newnode;
    }

    void deletefirst() {
        if (head == null)
            return;
        if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    void deletelast() {
        if (head == null)
            return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    void deleteatpos(int pos) {
        if (head == null)
            return;
        if (pos == 0) {
            deletefirst();
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null)
            return;
        if (temp.next != null)
            temp.next.prev = temp.prev;
        if (temp.prev != null)
            temp.prev.next = temp.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dll list = new dll();

        System.out.print("Enter number of nodes (N): ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " node values:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        list.display();
        list.insertatbegin(100);
        System.out.println("After inserting 100 at beginning:");
        list.display();
        list.insertatend(200);
        System.out.println("After inserting 200 at end:");
        list.display();
        list.insertatpos(300, 2);
        System.out.println("After inserting 300 at position 3:");
        list.display();
        list.deletefirst();
        System.out.println("After deleting first node:");
        list.display();
        list.deletelast();
        System.out.println("After deleting last node:");
        list.display();
        list.deleteatpos(2);
        System.out.println("After deleting node at position 3:");
        list.display();
    }
}
