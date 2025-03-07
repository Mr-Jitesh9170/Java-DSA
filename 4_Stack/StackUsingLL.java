
public class StackUsingLL {
    // creating node =>
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    // push in stack=>
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // pop in stack=>
    public int pop() {
        if (head == null) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1;
        }
        int removedData = head.data;
        head = head.next;
        return removedData;
    }

    // isEmpty stack =>
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    // peek in stack =>
    public int peek() {
        if (head == null) {
            System.out.println("Stack is empty! Cannot peek.");
            return -1;
        }
        int peekData = head.data;
        return peekData;
    }

    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
    }
}