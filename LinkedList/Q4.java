public class Q4 {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;
    Node tail;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

     public void removeElements(int val) {
         while (head != null && head.data == val) {
            head = head.next;
        }

         Node current = head;

        while (current != null && current.next != null) {
            if (current.next.data == val) {
                 current.next = current.next.next;
            } else {
                 current = current.next;
            }
        }
    }

     public void printLinkedList() {
        Node current = head;
        while (current != null) {
             current = current.next;
        }
     }

    public static void main(String[] args) {
        Q4 ll = new Q4();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(6);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

         ll.printLinkedList();

        ll.removeElements(6);

         ll.printLinkedList();
    }
}
