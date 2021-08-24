class Solution {
    public int removeElement(int[] nums, int val) {
       int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[m]=nums[i];
                m++;
            }
        }
        return m;
    }
// }
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
// Memory Usage: 37.7 MB, less than 50.40% of Java online submissions for Remove Element.
