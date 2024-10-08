import java.util.ArrayList;

public class basics {
    public static void main(String[] args) {

        //======= declaration of 1D-array lists =>
        ArrayList<Integer> arr1 = new ArrayList<Integer>();

        // (1) add value in arrayLists =>
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);

        // change value in arrayLists =>
        arr1.set(0, 0);
        arr1.set(1, 10);

        // delete value from arraylists =>
        arr1.remove(1);

        // get (or) iterate the value from arrayLists =>
        arr1.get(0);
        arr1.get(1);

        // size of the arrayLists =>
        arr1.size();

        for (int i = 0; i < arr1.size(); i++) {
            System.out.println("arr1 value ---> " + arr1.get(i));
        }

        //======== declaration of 2D-array lists ===>
        ArrayList<ArrayList<Integer>> arr2 = new ArrayList<>();

        // adding value in 2d array =>
        arr2.add(0, new ArrayList<>());
        arr2.get(0).add(1);
        arr2.get(0).add(12);
        arr2.add(arr1);

        // change value in 2d array =>
        arr2.get(0).set(0, 10);

        // delete value in 2d array =>
        arr2.get(0).remove(1);
        System.out.println(arr2);

    }
}
