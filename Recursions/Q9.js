// Level => Medium 
/* 
A(X) for positive integer X is the sum of factorials of its digits. For example, A(154) = 1! + 5! + 4!= 145.
Given a number N, find the minimum number X such that A(X) = N. You have to return a list of digits (without leading zeros) which represent the number X.

Example 1:

Input: N = 40321
Output: 18
Explanation: A(18)=1!+ 8! =40321 
Note that A(80) and A(81) are also 
40321, But 18 is the smallest 
number.
Example 2:

Input: N = 5040
Output: 7
Explanation: A(7) = 7! = 5040.
Your Task:
You don't need to read or print anything. Your task is to complete the function FactDigit() which takes N as input parameter and returns a list of digits which represent the number X.

Expected Time Complexity: O(X) where X ≤ 106
Expected Space Complexity: O(X)

Constraints:
1 ≤ N ≤ 109
*/

let n = 5040;
const helperFn = (i) => {
    let temp = i;
    let sum = 0;
    while (i !== 0) {
        let extract = i % 10;
        i = Math.floor(i / 10);
        let mul = 1;

        for (let j = extract; j > 0; j--) {
            mul *= j;
        }
        sum += mul;
    }
    if (sum == n) {
        return console.log(temp)
    }
    helperFn(temp + 1)
}
helperFn(1);


/* 
// Logic => In Java 

 int fact[]=new int[10]; //array to store factorials of numbers from 0 to 9
    ArrayList<Integer> arr=new ArrayList<>(); //arraylist to store the digits of the factorial
    ArrayList<Integer> FactDigit(int N) { //function to calculate digits of factorial
        fact[0]=1; //initializing factorial of 0 as 1
        for(int i=1;i<10;i++){ //calculating factorials of numbers from 1 to 9
            fact[i]=fact[i-1]*i; //using the formula n! = (n-1)! * n
        }
        fun(N); //calling the recursive function to find the digits of the factorial
        Collections.sort(arr); //sorting the arraylist in ascending order
        return arr; //returning the arraylist of digits of factorial
    }
    public int fun(int n) { //recursive function to find digits of factorial
        if(n<0)return -1; //if n is negative, return -1
        if(n==0)return 1; //if n is 0, return 1
        for(int i=9;i>=1;i--){ //loop from 9 to 1 to find the largest digit that can be subtracted from n
            int p=fun(n-fact[i]); //recursively calling the function with n-fact[i] to find the remaining digits
            if(p==1){ //if remaining digits are found, add the current digit to the arraylist
                arr.add(i);
                return 1; //return 1 to indicate that digits are found
            }
        }
        return -1; //return -1 if no digits are found
    }
*/

