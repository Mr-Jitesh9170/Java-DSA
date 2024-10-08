/* 
 * Given a string s consisting of lowercase Latin Letters. Return the first non-repeating character in s. If there is no non-repeating character, return '$'.

Note : When you return '$' driver code will output -1.

Examples:

Input:
s = hello
Output: h
Explanation: In the given string, the first character which is non-repeating is h, as it appears first and there is no other 'h' in the string.
Input:
s = zxvczbtxyzvy
Output: c
Explanation: In the given string, 'c' is the character which is non-repeating. 
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(Number of distinct characters).
Note: n = |S|

Constraints:
1 <= n <= 105 
 */

import java.util.Scanner;

public class Q4 {
    public static char nonrepeatingCharacter(String S) {
        // Your code here
        char value = '$';
        for (int i = 0; i < S.length(); i++) {
            int count = 0;
            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(i) == S.charAt(j)) {
                    count++;
                    if (count > 1) {
                        break;
                    }
                }
            }
            if (count == 1) {
                return S.charAt(i);
            }
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        nonrepeatingCharacter(S);
    }
}
