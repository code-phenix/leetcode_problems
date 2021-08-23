import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
         // int ans[]=new int[2];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[j]==target-nums[i]){
        //             ans[0]=i;
        //             ans[1]=j;
        //             i=nums.length;
        //             // System.out.println("break");
        //             break;
        //         }
        //     }
        // }
        // return ans;
        Map<Integer,Integer> hs=new HashMap<>();
        // int ans[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(hs.containsKey(target-nums[i])){
                return new int[]{i,hs.get(target-nums[i])};
            }
            hs.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}
/*
o(n) solutions 
Runtime: 3 ms, faster than 60.97% of Java online submissions for Two Sum.
Memory Usage: 42.7 MB, less than 5.41% of Java online submissions for Two Sum.
*/
