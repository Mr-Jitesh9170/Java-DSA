import java.util.*;

// traverse 2d array using recursion =>
public class Q4 {
    public static void traverse1darray(int[][] arr, int i, int j, int n, int m) {
        if (i > n - 1) {
            return;
        }
        if (j > m-1) {
            System.out.println("");
            traverse1darray(arr, i + 1, j = 0, n, m);
        } else {
            System.out.print(arr[i][j] + " ");
            traverse1darray(arr, i, j + 1, n, m);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of row ->");
        int n = sc.nextInt();

        System.out.println("enter the value of column ->");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("enter the value in array ->" + arr[i][j]);
                arr[i][j] = sc.nextInt();
            }
        }

        int i = 0, j = 0;
        traverse1darray(arr, i, j, n, m);
    }
}
