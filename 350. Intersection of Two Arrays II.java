// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [4,9]
// Explanation: [9,4] is also accepted.
 

// Constraints:

// 1 <= nums1.length, nums2.length <= 1000
// 0 <= nums1[i], nums2[i] <= 1000
 

// Follow up:

// What if the given array is already sorted? How would you optimize your algorithm?
// What if nums1's size is small compared to nums2's size? Which algorithm is better?
// What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
// Accepted
// 1M
// Submissions
// 1.8M
// Acceptance Rate
// 55.9%

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>hs=new HashMap<>();
        int temp,cnt=0;
        for(int iter:nums1){
            temp=hs.getOrDefault(iter,0);
            temp++;
            hs.put(iter,temp);
        }
        for(int iter:nums2){
            temp=hs.getOrDefault(iter,0);
            if(temp!=0){
                nums2[cnt++]=iter;
                if(temp==1)
                    hs.remove(iter);
                else{
                    temp--;
                    hs.put(iter,temp);
                }
            }
        }
        return Arrays.copyOfRange(nums2,0,cnt);
    }
}

// Runtime
// 2 ms
// Beats
// 96.5%
// Memory
// 45 MB
// Beats
// 5.38%
