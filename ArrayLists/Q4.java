/* 
 Given an array arr containing only 0s, 1s, and 2s. Sort the array in ascending order.

Examples:

Input: arr[]= [0, 2, 1, 2, 0]
Output: 0 0 1 2 2
Explanation: 0s 1s and 2s are segregated into ascending order.
Input: arr[] = [0, 1, 0]
Output: 0 0 1
Explanation: 0s 1s and 2s are segregated into ascending order.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= arr.size() <= 106
0 <= arr[i] <= 2


 */


// level midium => logic
import java.util.ArrayList;
import java.util.Collections;

public class Q4 {

    public void sort012(ArrayList<Integer> arr) {
        int n = arr.size();
        int low = 0, high = n - 1, mid = 0;

        // Using the Dutch National Flag algorithm
        while (mid <= high) {
            if (arr.get(mid) == 0) {
                Collections.swap(arr, mid++, low++);
            } else if (arr.get(mid) == 1) {
                mid++;
            } else {
                Collections.swap(arr, mid, high--);
            }
        }
    }

    public static void main(String[] args) {

    }
}
