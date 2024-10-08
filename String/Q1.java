
/* 
 * Given a string S, check if it is palindrome or not.

Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome
Example 2:

Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome
Your Task:
You don't need to read input or print anything. Complete the function isPalindrome()which accepts string S and returns an integer value 1 or 0.

Expected Time Complexity: O(Length of S)
Expected Auxiliary Space: O(1)

Constraints:
1 <= Length of S<= 2*105
 */


// level => easy 
import java.util.Scanner;

public class Q1 {
    public static int isPalindrome(String S) {
        // code here
        int n = S.length()-1, i = 0, count = 0;
        while (i < n) {
            if (S.charAt(i) != S.charAt(n)) {
                count++;
                break;
            }
            i++;
            n--;
        }
        if (count == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string --->");
        String str = sc.next();
        System.out.println(isPalindrome(str));
    }
}