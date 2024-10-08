import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {

    public static ArrayList<Integer> swapTwoValue(ArrayList<Integer> list, int n, int a, int b) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (i == a) {
                temp = list.get(i);
                list.set(i, list.get(b));
            }
        }
        for (int i = 0; i < n; i++) {
            if (i == b) {
                list.set(i, temp);
            }
        } 
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array lists -->");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("enter the value in the array -->");
            list.add(sc.nextInt());
        }

        System.out.println("swap the value from array --> a ");
        int a = sc.nextInt();

        System.out.println("swap the value from array --> b ");
        int b = sc.nextInt();

        System.out.println(swapTwoValue(list, n, a, b) + "  <---- swapped value is!");
    }
}
