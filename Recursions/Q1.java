
/* 
 * 
 * Print numbers from 1 to n without the help of loops. You only need to complete the function printNos() that takes N as parameter and prints number from 1 to N recursively.

Don't print newline, it will be added by the driver code.

Examples

Input: n = 10
Output: 1 2 3 4 5 6 7 8 9 10
Input: n = 5
Output: 1 2 3 4 5
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n) (Recursive).

Constraints:
1 <= n <= 1000

 * 
 */
//  Answer Logic => (brute force approches).
import java.util.Scanner;

public class Q1 {
    int count = 1;

    public void printNos(int N) {
        if (count > N) {
            return;
        }
        System.out.print(count + " ");
        count++;
        printNos(N);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Q1 obj = new Q1();
        obj.printNos(N);
    }
}
