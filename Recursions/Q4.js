// Medium level =>
/* 
Given a list arr of n integers, return sums of all subsets in it. Output sums can be printed in any order.

Examples:

Input: n = 2, arr[] = {2, 3}
Output: 0 2 3 5
Explanation: When no elements is taken then Sum = 0. When only 2 is taken then Sum = 2. When only 3 is taken then Sum = 3. When element 2 and 3 are taken then Sum = 2+3 = 5.
Example 2:

Input: n = 3, arr = {1, 2, 1}
Output: 0 1 1 2 2 3 3 4
 
Your Task:  
You don't need to read input or print anything. Your task is to complete the function subsetSums() which takes a list/vector and an integer n as an input parameter and returns the list/vector of all the subset sums.

Expected Time Complexity: O(2n)
Expected Auxiliary Space: O(2n)

Constraints:
1 <= n <= 15
0 <= arr[i] <= 104

*/
 
// Answer => 1 (brute force approches)
let sumAll = 0;
let subsetArr = [0];
let arr = [1]
let n = arr.length;
let i = 0;
function subsetSum(arr, n) {
    subsetArr.push(arr[i]);
    sumAll += arr[i];
    for (let j = i + 1; j < n; j++) {
        subsetArr.push(arr[i] + arr[j])
    }
    if (n - 1 == i) {
        subsetArr.push(sumAll)
        return console.log(subsetArr)
    }
    i++;
    subsetSum(arr, n);
}

subsetSum(arr, n)

//=================================================================>>>>>>

// Answer => 2 (best case approches)
function subsetSums(arr, N) {
    let v = [];

    // Helper function to calculate subset sums
    let subsetSumsHelper = (arr, l, r, v, sum = 0) => {
        // Print current subset
        if (l > r) {
            v.push(sum);
            return;
        }

        // Subset including arr[l]
        subsetSumsHelper(arr, l + 1, r, v, sum + arr[l]);

        // Subset excluding arr[l]
        subsetSumsHelper(arr, l + 1, r, v, sum);
    }

    subsetSumsHelper(arr, 0, N - 1, v);                                                    // Call the helper function
    v.sort((a, b) => a - b);                                                              // sort the array in ascending order
    return v;                                                                             // Return the subset sums
}

