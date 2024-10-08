// Linkdin =>

// import java.util.LinkedList;

public class Basic {
    public static void main(String[] args) {

        // ========================== Inbuilt linked list ==================>
        // // declaration =>
        // LinkedList<Integer> list = new LinkedList<>();

        // // adding element =>
        // list.add(1);
        // list.add(3);
        // list.add(1, 2);
        // list.addFirst(0);
        // list.addLast(5);

        // System.out.println(list);

        // // change element =>
        // list.set(1, 3);
        // System.out.println(list);

        // // remove element =>
        // list.remove(1);
        // list.removeFirst();
        // list.removeLast();

        // System.out.println(list);

        // // iterate element in linkedlist =>
        // for (int i = 0; i < list.size(); i++) {
        // System.out.println(list.get(i));
        // }

        // // size =>
        // System.out.println(list.size()+"<---size");

        // ====================== Custom linkedLists ==========================>
        LinkedList ll = new LinkedList();
        ll.insertLast(1);
        ll.insertLast(2);
        ll.insertLast(3);
        ll.insertLast(4);

        // ll.deleteLast();
        ll.changeDataAt();
        ll.traverse();
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertAt(int data, int index) {
        Node newNode = new Node(data);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        // Inserting the new node
        newNode.next = current.next;
        current.next = newNode;
    }

    // insert first =>
    public void insertFirst(int data) {
        if (head == null) {
            Node newNode = new Node(data);
            head = newNode;
        } else {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }

    // insert last =>
    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currenNode = head;
            while (currenNode.next != null) {
                currenNode = currenNode.next;
            }
            currenNode.next = newNode;
        }
    }

    // delete first =>
    public void deleteFirst() {
        if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            current = current.next;
            head = current;
        }
    }

    // delete last=>
    public void deleteLast() {
        if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    public void changeDataAt() {
        Node current = head;
        Node data = current.next.next;
        current.next.next = current.next;
        current.next = data;
     }

    // traverse =>
    public void traverse() {
        if (head == null) {
            System.out.print(" ");
        } else {
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
        }
    }
}