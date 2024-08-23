// Medium level =>

/* 
Given a string s, remove all its adjacent duplicate characters recursively. 

Note: For some test cases, the resultant string would be an empty string. In that case, the function should return the empty string only.

Example 1:

Input:
S = "geeksforgeek"
Output: "gksforgk"
Explanation: 
g(ee)ksforg(ee)k -> gksforgk

Example 2:

Input: 
S = "abccbccba"
Output: ""
Explanation: 
ab(cc)b(cc)ba->abbba->a(bbb)a->aa->(aa)->""(empty string)

Your Task:
You don't need to read input or print anything. Your task is to complete the function rremove() which takes the string S as input parameter and returns the resultant string.


Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)


Constraints:
1<=|S|<=105

*/


// logics => 
let i = 0;
let value = "h";
let remove = "";

function removeDuplicates(value) {
    if (i > value.length) {
        if (remove.length > 1) {
            let count = 0;
            for (let j = 0; j < value.length; j++) {
                for (let k = 0; k < value.length; k++) {
                    if (value[j] == value[k]) {
                        count++;
                        break;
                    }
                }
                if (count > 0) {
                    i = 0;
                    value = remove;
                    remove = "";
                    removeDuplicates(value)
                }
            }
        }
        return remove
    }

    if (value[i] == value[i + 1] || value[i] == value[i - 1]) {
        i++;
        removeDuplicates(value)
    }
    else {
        remove = remove + value[i]
        i++;
        removeDuplicates(value)
    }
}

console.log(removeDuplicates(value), "<---- value is")