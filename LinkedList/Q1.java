/* 
 * Given a linked list, your task is to complete the function isLengthEven() which contains the head of the linked list, and check whether the length of the linked list is even or not. Return true if it is even, otherwise false.

Examples:

Input: Linked list: 12->52->10->47->95->0

Output: true
Explanation: The length of the linked list is 6 which is even, hence returned true.
Input: Linked list: 9->4->3

Output: false
Explanation: The length of the linked list is 3 which is odd, hence returned false.
Expected Time Complexity: O(n)
Expected Auxillary Space: O(1)

Constraints:
1 <= number of nodes <= 105
1 <= elements of the linked list <= 105
 */

//  basic =>

import org.w3c.dom.Node;

public class Q1 {

    public boolean isLengthEven(Node head) {
        // code here
        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }

        if (count % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
