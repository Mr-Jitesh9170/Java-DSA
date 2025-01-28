/* 
 * 
 * 
 * Convert binary to decimal to given singly link lists , where each node of data is in form of 0 or 1?
 * 
 */

public class Q6 {

    public class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    ListNode head;
    ListNode tail;

    public void addLast(int value) {
        ListNode newNode = new ListNode(value);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public int getDecimalValue(ListNode head) {

        ListNode temp = head;
        int size = 0;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        ListNode lil = head;
        int sum = 0;

        while (size > 0) {
            size--;
            sum = sum + (int) Math.pow(2, size) * lil.data;
            lil = lil.next;
        }

        return sum;

    }

    public static void main(String[] args) {
        Q6 ll = new Q6();
         ll.addLast(0);
 
        System.out.println(ll.getDecimalValue(ll.head));
    }
}