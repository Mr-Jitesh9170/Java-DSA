/* 
 * You are given a sorted array arr[] that may contain duplicate elements. Your task is to find the index of the last occurrence of any duplicate element and return the index along with the value of that element. If no duplicate element is found, return [-1, -1].

Examples :

Input : arr[] = [1, 5, 5, 6, 6, 7]
Output : [4, 6]
Explanation: Last duplicate element is 6 having index 4.
Input : arr[] = [1, 2, 3, 4, 5]
Output: [-1, -1]
Explanation: No duplicate elements are present in the array.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 106
 * 
 */

//  level => Basic 
// Anwer => best case

public class Q7 {
    public int[] dupLastIndex(int[] arr) {
        // Complete the function
        int[] temp = { -1, -1 };

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                temp[0] = i + 1;
                temp[1] = arr[i + 1];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        String value = "no";
        System.out.println(value);
    }
}
