public class DoubleLL {
    static Node head = null;
    static Node tail = null;

    public static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public static int removeFirst() {
        if (head == null) {
            return -1;
        }
        if (head.next == null) {
            int removedData = head.data;
            head = tail = null;
            return removedData;
        }
        int removedData = head.data;
        head.next.prev = null;
        head = head.next;
        return removedData;
    }

    public static void printStartDLL() {
        Node temp = head;
        if (head == null) {
            System.out.println("D-LL is empty!");
            return;
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void printLastDLL() {
        Node temp = tail;
        if (head == null || tail == null) {
            System.out.println("D-LL is empty!");
            return;
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        System.out.println(removeFirst());
        System.out.println(removeFirst()); 
    }
}
