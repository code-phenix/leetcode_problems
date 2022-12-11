// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

// Return the running sum of nums.

 

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
// Example 2:

// Input: nums = [1,1,1,1,1]
// Output: [1,2,3,4,5]
// Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
// Example 3:

// Input: nums = [3,1,2,10,1]
// Output: [3,4,6,16,17]
 

// Constraints:

// 1 <= nums.length <= 1000
// -10^6 <= nums[i] <= 10^6
// Accepted
// 1.1M
// Submissions
// 1.3M
// Acceptance Rate
// 89.0%

  class Solution {
    public int[] runningSum(int[] nums) {
        if(nums.length==0||nums.length==1)
            return nums;
        int iterI=1;
        while(iterI<nums.length){
            nums[iterI]+=nums[iterI-1];
            iterI++;
        }
        return nums;
    }
}

// Runtime
// 0 ms
// Beats
// 100%
// Memory
// 43.3 MB
// Beats
// 46.80%
