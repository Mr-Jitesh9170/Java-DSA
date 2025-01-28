public class AddLast {

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

    public void llAddLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void main(String[] args) {

        // add last =>
        AddLast ll = new AddLast();
        ll.llAddLast(1);
        ll.llAddLast(2);
        ll.llAddLast(3);

    }
}
