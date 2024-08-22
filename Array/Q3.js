// Easy level =>
/* 
Given an array arr of size n which contains elements in range from 0 to n-1, you need to find all the elements occurring more than once in the given array. Return the answer in ascending order. If no such element is found, return list containing [-1]. 

Examples:

Input: n = 4, arr[] = [0,3,1,2]
Output: -1
Explanation: There is no repeating element in the array. Therefore output is -1.
Input: n = 5, arr[] = [2,3,1,2,3]
Output: 2 3 
Explanation: 2 and 3 occur more than once in the given array.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

Constraints:

1 <= n <= 105
0 <= arr[i] <= 105, for each valid i
*/

// Answer => Logic (Brute force approches)
function duplicates(a, n) {
    // your code here 
    let dupArr = [];
    for (let i = 0; i < n; i++) {
        let count = 0;
        for (let j = 0; j < n; j++) {
            if (a[i] == a[j]) {
                count++
            }
        }
        if (count > 1) {
            let exists = 0;
            for (let k = 0; k < dupArr.length; k++) {
                if (dupArr[k] == a[i]) {
                    exists++;
                }
            }
            if (exists == 0) {
                dupArr.push(a[i])
            }
        }
    }
    if (dupArr.length == 0) {
        return [-1];
    } else {
        return dupArr.sort((a, b) => a - b);
    }
}