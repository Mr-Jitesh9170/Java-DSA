import java.util.ArrayList;

 
// brute force approaches => 
public abstract class Q3 {
    public static boolean isAnagram(String a, String b) {
        // Your code here
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            int count = 0;
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    count++;
                }
            }

            if (count > 0) {
                arr.add(count);
            } else {
                break;
            }

        }

        if (arr.size() != a.length()) {
            return false;
        }

        int trueCount = 0;
        for (int i = 0; i < a.length(); i++) {
            int count = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    count++;
                }
            }

            if (count == arr.get(i)) {
                trueCount++;
            } else {
                break;
            }
        }

        if (trueCount == arr.size()) {
            if (a.length() == b.length()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String a = "abcdef", b = "cdefabmn";
        System.out.println(isAnagram(a, b));
    }
}
