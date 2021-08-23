class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}

//Runtime: 1 ms, faster than 76.97% of Java online submissions for Remove Duplicates from Sorted Array.
//Memory Usage: 40.4 MB, less than 50.61% of Java online submissions for Remove Duplicates from Sorted Array.
