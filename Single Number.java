import java.util.HashMap;
import java.util.Map;
class Solution {
    public int singleNumber(int[] nums) {
//         HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
//         for(int i=0;i<nums.length;i++){
//             if(!hs.containsKey(nums[i]))
//                 hs.put(nums[i],1);
//             else{
//                 int temp=hs.get(nums[i]);
//                 temp++;
//                 hs.put(nums[i],temp);
//             }
                
//         }
//         for(Map.Entry<Integer,Integer> set:hs.entrySet()){
//             if(set.getValue()==1)
//                 return set.getKey();
                
//         }
//         return -1;
        int result=0;
        for(int i=0;i<nums.length;i++){
            result^=nums[i];
        }
        return result;
    }
 }
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Single Number.
// Memory Usage: 38.9 MB, less than 90.64% of Java online submissions for Single Number.
