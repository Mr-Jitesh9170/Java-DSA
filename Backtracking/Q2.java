/* 
 * Given a N x M grid. Find All possible paths from top left to bottom right.From each cell you can either move only to right or down.

Example 1:

Input: 1 2 3
       4 5 6
Output: 1 4 5 6
        1 2 5 6 
        1 2 3 6
Explanation: We can see that there are 3 
paths from the cell (0,0) to (1,2).
Example 2:

Input: 1 2
       3 4
Output: 1 2 4
        1 3 4
Your Task:
You don't need to read input or print anything. Your task is to complete the function findAllPossiblePaths() which takes two integers n,m and grid[][]  as input parameters and returns all possible paths from the top left cell to bottom right cell in a 2d array.

Expected Time Complexity: O(2^N*M)
Expected Auxiliary Space: O(N)


Constraints:
1 <= n,m <= 10 
1 <= grid[i][j] <= n*m
n * m < 20
 */

// Easy level =>  
import java.util.Scanner;
import java.util.*;;

public class Q2 {
    public static ArrayList<ArrayList<Integer>> findAllPossiblePaths(int n, int m, int[][] grid) {
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of row ->");
        int n = sc.nextInt();
        System.out.println("enter the value of column ->");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        // insert value in 2d array =>
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("enter the value in the array ->" + arr[i][j]);
                arr[i][j] = sc.nextInt();
            }
        }

        // print 2d array =>
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
