// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

 

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]
 

// Constraints:

// 1 <= nums.length <= 104
// -231 <= nums[i] <= 231 - 1
 


class Solution {
    public static void moveZeroes(int[] nums) {
        int index=0;
        for(int iter=0;iter<nums.length;iter++){
            if(nums[index]!=0){
                while(nums[index]==0 && index < nums.length)
                {
                    index++;
                    if(nums[index]==0)
                        break;
                }
            }
            if(nums[iter]!=0){
                swap(nums,iter,index);
                index++;
            }
        }
    }
    public static void swap(int nums[],int index1,int index2)
    {
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
}



//Runtime
// 2 ms
// Beats
// 60.86%
// Memory
// 44 MB
// Beats
// 53.26%
