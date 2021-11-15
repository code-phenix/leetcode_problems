class Solution {
    // public static int binarySearch(int start,int end,int[] nums,int target){
    //     if(start<=end){
    //         int mid=start+(end-start)/2;
    //         if(nums[mid]==target)
    //             return mid;
    //         else if(nums[mid]>target)
    //             return binarySearch(start,mid-1,nums,target);
    //         else
    //             return binarySearch(mid+1,end,nums,target);
    //     }
    //     return -1;
    // }
    
    public static int binarySearch(int start,int end,int[] nums,int target){
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        return binarySearch(0,nums.length-1,nums,target);
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
//Memory Usage: 40 MB, less than 65.06% of Java online submissions for Binary Search.
