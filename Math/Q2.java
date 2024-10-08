/* 
 * Your task is to calculate sum  of primes present as digits of given number N.

Example 1:

Input: 333
Output: 9
Explaination: 3 is a prime number. It 
is present 3 times. So 3+3+3 = 9.
Example 2:

Input: 686
Output: 0
Explaination: Neither 6 nor 8 is a 
prime number.
Your Task:
You do not need to read input or print anything. Your task is to complete the function primeSum() which takes N as input parameter and returns the sum of all the prime digits present in the number N.

Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 5*104  
 * 
 */

public class Q2 {
    public static int primeSum(int N) {
        // code here
        int sum = 0;
        while (N > 0) {
            int extr = N % 10;
            N = N / 10;
            int count = 0;

            for (int i = 2; i < extr; i++) {
                int value = extr % i;
                if (value == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && extr != 1) {
                sum += extr;
            }
        }
        if (sum == 0) {
            return 0;
        } else {
            return sum;
        }
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println(primeSum(number));
    }
}