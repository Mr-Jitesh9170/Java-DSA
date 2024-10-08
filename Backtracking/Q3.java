import java.util.*;

// traverse 1d array using recursion =>

public class Q3 {
    public static void traverse1darray(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        System.out.print(arr[i] + " ");
        traverse1darray(arr, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value size array ->");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the value in array ->");
            arr[i] = sc.nextInt();
        }
        int i = 0;
        traverse1darray(arr, i);
    }
}
