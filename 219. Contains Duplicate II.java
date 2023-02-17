// Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

// Example 1:

// Input: nums = [1,2,3,1], k = 3
// Output: true
// Example 2:

// Input: nums = [1,0,1,1], k = 1
// Output: true
// Example 3:

// Input: nums = [1,2,3,1,2,3], k = 2
// Output: false
 

// Constraints:

// 1 <= nums.length <= 105
// -109 <= nums[i] <= 109
// 0 <= k <= 105


class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k<=0)
            return false;
        HashMap<Integer,Integer> hs =new HashMap<>();
        for(int iter=0;iter<nums.length;iter++){
            if(hs.containsKey(nums[iter])){
                int temp=hs.get(nums[iter])-iter;
                if(temp<0)
                    temp*=-1;
                if(temp<=k){
                    return true;
                }   
            }
            hs.put(nums[iter],iter);
        }
        return false;
    }
}

// Runtime
// 17 ms
// Beats
// 92.4%
// Memory
// 49.9 MB
// Beats
// 99.9%
