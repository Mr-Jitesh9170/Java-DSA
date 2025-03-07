/*
 * Question 1 :
 * Monotonic ArrayList(EASY)
 * An Arraylist is monotonic if it is either monotone increasing or monotone
 * decreasing.
 * AnArraylist nums ismonotone increasing if for all i <= j, nums.get(i)
 * <=nums.get(j). An
 * Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >=
 * nums.get(j).
 * Given an integer Arraylist nums, return true if the given list is monotonic,
 * or false otherwise.
 * Sample Input 1 : nums = [1,2,2,3]
 * Sample Output 1: true
 * Sample Input 2 : nums = [6,5,4,4]
 * Sample Output 2: true
 * Sample Input 3 : nums = [1,3,2]
 * Sample Output 3: false
 * Constraints:
 * ● 1 <= nums.size() <= 105
 * ●-105 <= nums.get(i) <= 105
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array  -->");
        int n = sc.nextInt();

        ArrayList<Integer> arr1 = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("enter the value in array -->" + i);
            arr1.add(sc.nextInt());
        }
        int incre = 0, decre = 0;
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            if (arr1.get(i) <= arr1.get(j)) {
                incre++;
            } else if (arr1.get(i) >= arr1.get(j)) {
                decre++;
            }
        }
        if (incre == arr1.size() - 1 || decre == arr1.size() - 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}