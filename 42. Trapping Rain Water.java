// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 

// Example 1:


// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
// Example 2:

// Input: height = [4,2,0,3,2,5]
// Output: 9
 

// Constraints:

// n == height.length
// 1 <= n <= 2 * 104
// 0 <= height[i] <= 105

class Solution {
    public int trap(int[] height) {
        // int leftHeight[]=new int[height.length];
        // int rightHeight[]=new int[height.length];

        // int max=-1;
        // for(int iter=0;iter<height.length;iter++){
        //     if(height[iter]>=max)
        //         max=height[iter];
        //     leftHeight[iter]=max;
        // }
        // max=-1;
        // for(int iter=height.length-1;iter>=0;iter--){
        //     if(height[iter]>=max){
        //         max=height[iter];
        //     }
        //     rightHeight[iter]=max;
        // }
        // int result=0;
        // for(int iter=0;iter<height.length;iter++){
        //     result+=Math.min(leftHeight[iter],rightHeight[iter])-height[iter];
        // }

        // return result;
        int result=0;
        int left=0,right=height.length-1,leftMax=-1,rightMax=-1;
        while(left<right){
            leftMax=Math.max(leftMax,height[left]);
            rightMax=Math.max(rightMax,height[right]);

            if(leftMax<rightMax){
                result+=leftMax-height[left];
                left++;
            }
            else{
                result+=rightMax-height[right];
                right--;
            }
        }
        return result;
    }
}

//Runtime
// 0
// ms
// Beats
// 100.00%
// Analyze Complexity
// Memory
// 46.36
// MB
// Beats
// 27.50%
