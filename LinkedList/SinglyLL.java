public class SinglyLL {

    static Node head;
    static Node tail;
    static int size = 0;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add First, Time complexity => O(1)
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            size++;
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Remove first , Time complexity => O(1)
    public static int removeFirst() {
        if (head == null) {
            return -1;
        }
        size--;
        int removedData = head.data;
        head = head.next;
        return removedData;
    }

    // Retrive LL, Time complexity => O(n)
    public static void retriveData() {
        Node temp = head;
        if (head == null) {
            System.out.println("LL is Empty!");
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Add Last, Time complexity => O(n)
    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Remove Last, Time complexity => O(n)
    public static int removeLast() {
        if (head == null) {
            return -1;
        }
        size--;
        if (head.next == null) {
            int removeData = head.data;
            head = null;
            return removeData;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int removeData = temp.next.data;
        temp.next = null;
        return removeData;
    }

    public static void main(String[] args) {
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        System.out.println(removeLast());
        System.out.println(size);
    }
}