/* 
 Print GFG n times without the loop.
Example:

Input:
5
Output:
GFG GFG GFG GFG GFG
Your Task:
This is a function problem. You only need to complete the function printGfg() that takes N as parameter and prints N times GFG recursively. Don't print newline, it will be added by the driver code.


Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N) (Recursive).

Constraint:
1<=N<=1000
 */


// Answer => (brute force approaches)
import java.util.*;

public class Q5 {
    void printGfg(int N) {
        if (N < 1) {
            return;
        }
        System.out.print("GFG" + " ");
        printGfg(N - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of N => ");
        int N = sc.nextInt();

        Q5 obj = new Q5();
        obj.printGfg(N);
    }
}
