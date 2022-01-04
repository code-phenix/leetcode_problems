// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

// Increment the large integer by one and return the resulting array of digits.

 

// Example 1:

// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].
// Example 2:

// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Incrementing by one gives 4321 + 1 = 4322.
// Thus, the result should be [4,3,2,2].
// Example 3:

// Input: digits = [9]
// Output: [1,0]
// Explanation: The array represents the integer 9.
// Incrementing by one gives 9 + 1 = 10.
// Thus, the result should be [1,0].
 

// Constraints:

// 1 <= digits.length <= 100
// 0 <= digits[i] <= 9
// digits does not contain any leading 0's.

class Solution {
    public int[] plusOne(int[] digits) {
        int size=digits.length;
           if(digits[size-1]!=9){//when last index is zero
               digits[size-1]++;
               return digits;
           }
        
            int temp=size-1;
            while(digits[temp]==9 && temp>0 && digits[temp-1]==9){//this is used to find the continous last '9' from last
                temp--;
            }
            if(temp!=0){//when last '9' is not at 0th index
                int temp1=temp;
                while(temp<size){
                    digits[temp]=0;
                    temp++;
                }
                temp1--;
                
                digits[temp1]++;
                return digits;
                
            }
            //when last '9' is at oth index
            int res[]=new int[size+1];
            res[0]=1;
            for(int iterI=1;iterI<size+1;iterI++){
                res[iterI]=0;
            }
        return res;
    }
}

// Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
// Memory Usage: 37.1 MB, less than 95.77% of Java online submissions for Plus One
