// Reverse the array lists =>

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the arrayLists --->");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("enter the value in the array list -->" + i);
            list.add(sc.nextInt());
        }

        // Logic =>
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
