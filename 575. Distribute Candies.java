// Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor.

// The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice.

// Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.

 

// Example 1:

// Input: candyType = [1,1,2,2,3,3]
// Output: 3
// Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of each type.
// Example 2:

// Input: candyType = [1,1,2,3]
// Output: 2
// Explanation: Alice can only eat 4 / 2 = 2 candies. Whether she eats types [1,2], [1,3], or [2,3], she still can only eat 2 different types.
// Example 3:

// Input: candyType = [6,6,6,6]
// Output: 1
// Explanation: Alice can only eat 4 / 2 = 2 candies. Even though she can eat 2 candies, she only has 1 type.
 

// Constraints:

// n == candyType.length
// 2 <= n <= 104
// n is even.
// -105 <= candyType[i] <= 105


class Solution {
    public int distributeCandies(int[] candyType) {
        if(candyType.length<=0)
            return 0;
        int min=candyType[0],max=candyType[0],cnt=0,iter=0,types=0;
        for(int iterI:candyType){
            min=min<iterI?min:iterI;
            max=max>iterI?max:iterI;
            cnt++;
        }
        boolean arr[]=new boolean[max-min+1];
        while(iter<cnt && types<cnt/2){
            if(!arr[candyType[iter]-min]){
                types++;
                arr[candyType[iter]-min]=true;
            }
            iter++;
        }
        return types;
    }
}
// Runtime
// 5 ms
// Beats
// 100%
// Memory
// 44.7 MB
// Beats
// 62.88%


class Solution {
    public int distributeCandies(int[] candyType) {
        if(candyType.length<=0)
            return 0;
        HashSet<Integer>hs =new HashSet<>();
        for(int iter:candyType){
            hs.add(iter);
        }
        return hs.size()<candyType.length/2?hs.size():candyType.length/2;
    }
}

// Runtime
// 36 ms
// Beats
// 74.10%
// Memory
// 45.4 MB
// Beats
// 23.8%
