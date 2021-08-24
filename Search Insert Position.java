/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
Example 4:

Input: nums = [1,3,5,6], target = 0
Output: 0
Example 5:

Input: nums = [1], target = 0
Output: 0
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104*/
class Solution {
    // int mid=0;
    public int binarySearch(int arr[],int start,int end,int key){
        if(start<=end){
            if(arr[start]>key)
                return start;
            if(arr[end]<key)
                return end+1;
            int mid=start+(end-start)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]<key)
                return binarySearch(arr,mid+1,end,key);
            else
                return binarySearch(arr,start,mid-1,key);
        }
        return start;
    }
    public int searchInsert(int[] arr, int key) {
        if(arr[arr.length-1]<key){
            return arr.length;
        }
        if(arr[0]>key)
            return 0;
        
        return binarySearch(arr,0,arr.length-1,key);
    }
// }
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
// Memory Usage: 38.8 MB, less than 34.10% of Java online submissions for Search Insert Position.
