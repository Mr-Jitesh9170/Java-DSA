import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length or array ==>");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter the value of array-->" + i);
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    count++;
                    break;
                } else if (arr[i] == arr[j]) {

                }
            }
            if (count == 0) {
                System.out.println(arr[i] + " ");
            }
            count = 0;
        }
    }
}
