/* 
 Given an array arr of non-negative numbers. The task is to find the first equilibrium point in an array. The equilibrium point in an array is an index (or position) such that the sum of all elements before that index is the same as the sum of elements after it.

Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists. 

Examples:

Input: arr[] = [1, 3, 5, 2, 2]
Output: 3 
Explanation: The equilibrium point is at position 3 as the sum of elements before it (1+3) = sum of elements after it (2+2). 
Input: arr[] = [1]
Output: 1
Explanation: Since there's only one element hence it's only the equilibrium point.
Input: n = 3, arr[] = [1, 2, 3]
Output: -1
Explanation: There is no equilibrium point in the given array.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= arr.size <= 105
0 <= arr[i] <= 109

 */

// level easy =>

import java.util.Scanner;

public class Q9 {
    public static int equilibriumPoint(long arr[]) {
        int n = arr.length;

        // We store the sum of all array elements.
        long sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];

        // sum2 is used to store prefix sum.
        long sum2 = 0;
        for (int i = 0; i < n; i++) {

            // Leaving out the value of current element from suffix sum.
            sum = sum - arr[i];

            // Checking if suffix and prefix sums are same.
            if (sum2 == sum) {
                // returning the index or equilibrium point.
                return (i + 1);
            }

            // Adding the value of current element to prefix sum.
            sum2 = sum2 + arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array -->");
        int n = sc.nextInt();

        long[] arr = new long[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(("enter the value in the array -->" + arr[i]));
            arr[i] = sc.nextInt();
        }
        System.out.println(equilibriumPoint(arr) + "<---- returned value!");

    }
}