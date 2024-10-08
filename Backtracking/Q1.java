// Array backtracking =>

import java.util.Scanner;

public class Q1 {
    public static void ArrayBacktracking(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        arr[i] = i + 1;
        System.out.print(arr[i] + " ");
        ArrayBacktracking(arr, i + 1); // recursion
        arr[i] = arr[i] - 2;// backtracking
        System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ->");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the value in array ->" + i);
            arr[i] = sc.nextInt();
        }
        ArrayBacktracking(arr, 0);
       
    }
}