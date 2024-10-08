/* 
 * 
 * Given an array arr, return the second largest distinct element from an array. If the second largest element doesn't exist then return -1.

Examples:

Input: arr = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
Input: arr = [10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist so answer is -1.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
2 ≤ arr.size() ≤ 105
1 ≤ arri ≤ 105

 
 * 
 */

// level easy
import java.util.Scanner;

public class Q5 {
    public static int print2largest(int[] arr) {
        // Code Here
        int l = -1, sl = -1;
        for (int i = 0; i < arr.length; i++) {
            if (l > arr[i]) {
                if (sl < arr[i]) {
                    sl = arr[i];
                }
            } else {
                if (sl < l && l != arr[i]) {
                    sl = l;
                }
                l = arr[i];
            }
        }
        if (l > sl) {
            return sl;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array---> ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter the value in array --->" + i);
            arr[i] = sc.nextInt();
        }

        System.out.println(print2largest(arr) + "<---- second large value!");
    }
}
