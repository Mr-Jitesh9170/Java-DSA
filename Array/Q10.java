/* 
 * Given an array of strings arr. Return the longest common prefix among each and every strings present in the array. If there's no prefix common in all the strings, return "-1".

Examples :

Input: arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
Output: gee
Explanation: "gee" is the longest common prefix in all the given strings.
Input: arr[] = ["hello", "world"]
Output: -1
Explanation: There's no common prefix in the given strings.
Expected Time Complexity: O(n*min(|arri|))
Expected Space Complexity: O(min(|arri|))

Constraints:
1 ≤ |arr| ≤ 103
1 ≤ |arr[i]| ≤ 103


 */
public class Q10 {

    public String longestCommonPrefix(String arr[]) {
        // code here
        String str = "-1";
        for (int i = 0; i < arr[0].length(); i++) {
            int count = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[0].charAt(i) == arr[j].charAt(i)) {
                    count++;
                } else {
                    break;
                }
            }

            if (count == arr.length - 1) {
                str = str + arr[0].charAt(i);
            } else {
                break;
            }
        }
        return str;
    }

    public static void main(String[] args) {

    }
}
