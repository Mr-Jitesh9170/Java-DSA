//Stack implementation using array!
//1️⃣ Fixed Size (Limited Capacity)
//2️⃣ Inefficient Memory Usage

public class StackUsingArray {
    int size;
    int[] arr;
    int top;

    StackUsingArray(int size) {
        this.size = size;
        arr = new int[size];
        this.top = -1;
    }

    // Push in Stack =>
    // Time complexity => T=O(1)
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is Full! Cannot push.");
            return;
        }
        top++;
        arr[top] = data;
    }

    // Pop in Stack =>
    // Time complexity => T=O(1)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty! Cannot pop.");
            return -1;
        }
        int removedData = arr[top];
        top--;
        return removedData;
    }

    // Stack is empty =>
    // Time complexity => T=O(1)
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    // Stack is full =>
    // Time complexity => T=O(1)
    public boolean isFull() {
        if (top == arr.length - 1) {
            return true;
        }
        return false;
    }

    // Stack is peek =>
    // Time complexity => T=O(1)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot peek.");
            return -1;
        }
        return arr[top];
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        stack.push(1);
        stack.pop();
        stack.peek();
        stack.isEmpty();
        stack.isFull();
    }
}