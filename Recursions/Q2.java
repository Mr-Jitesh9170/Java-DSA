/* 
 * 
 * Given a number and its reverse. Find that number raised to the power of its own reverse.
Note: As answers can be very large, print the result modulo 109 + 7.

Example 1:

Input:
N = 2, R = 2
Output: 4
Explanation: The reverse of 2 is 2 and after raising power of 2 by 2 we get 4 which gives remainder as 4 when divided by 1000000007.
Example 2:

Input:
N = 12, R = 21
Output: 864354781
Explanation: The reverse of 12 is 21and 1221 when divided by 1000000007 gives remainder as 864354781.
Your Task:
You don't need to read input or print anything. You just need to complete the function pow() that takes two parameters N and R denoting the input number and its reverse and returns power of (N to R)mod(109 + 7).

Expected Time Complexity: O(LogN).
Expected Auxiliary Space: O(LogN).

Constraints:
1 <= N <= 109
 * 
 */

// Solutions is right => (brute force)
import java.util.Scanner;

public class Q2 {

    long value = 1;
    int count = 1;

    public long power(int N, int R) {
        if (count > R) {
            return value;
        }
        value = value * N;

        count++;
        return power(N, R);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of  -> N");
        int N = sc.nextInt();
        System.out.println("enter the value of -> R");
        int R = sc.nextInt();

        Q2 obj = new Q2();
        System.out.println("The value ---> " + obj.power(N, R));
    }
}
