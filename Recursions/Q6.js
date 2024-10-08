// Easy level =>
/* 
Print a sequence of numbers starting with n, without using a loop. Replace n with n - 5, n−5... until n≤0. Then, replace n with n+5, n + 5, n+5 until n regains its initial value. Complete the function pattern(n) which takes n as input and returns a list containing the pattern.

Examples

Input: n = 16
Output: 16 11 6 1 -4 1 6 11 16
Explanation: The value decreases until it is greater than 0. After that it increases and stops when it becomes 16 again.
Input: n = 10
Output: 10 5 0 5 10
Explanation: It follows the same logic as per the above example.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
-105 ≤ n ≤ 105
*/

let n = 23;
let temp = n;
console.log(n + " ")

function pattern(n) {
    if (temp > 0 && n) {
        return;
    }

    if (temp >= n && n > 0) {
        temp = n;
        n = n - 5;
        console.log(n + " ")
        pattern(n)
    } else if (n >= temp || temp > n) {
        temp = n;
        n = n + 5;
        console.log(n + " ");
        pattern(n)
    }

}

pattern(n);
