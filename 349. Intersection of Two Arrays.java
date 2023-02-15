// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.
 

// Constraints:

// 1 <= nums1.length, nums2.length <= 1000
// 0 <= nums1[i], nums2[i] <= 1000
// Accepted
// 810.7K
// Submissions
// 1.1M
// Acceptance Rate
// 70.7%


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1=new HashSet<>();
        
        
        int temp=0;
        for(int iter:nums1){
            hs1.add(iter);
        }
        HashSet<Integer> res=new HashSet<>();
        for(int iter:nums2){
            if(hs1.contains(iter))
                res.add(iter);
        }
        int result[]=new int[res.size()];
        Iterator iter=res.iterator();
        while(iter.hasNext()){
            result[temp++]=(int)iter.next();
            
        }
        return result;
    }
}


// Runtime
// 2 ms
// Beats
// 96.68%
// Memory
// 42 MB
// Beats
// 95.33%
