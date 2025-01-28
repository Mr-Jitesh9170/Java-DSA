public class AddFirst {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public void llAddFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        AddFirst ll = new AddFirst();
        
        // add first =>
        ll.llAddFirst(1);
        ll.llAddFirst(2);
        ll.llAddFirst(3);

    }
}