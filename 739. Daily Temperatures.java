// Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

 

// Example 1:

// Input: temperatures = [73,74,75,71,69,72,76,73]
// Output: [1,1,4,2,1,1,0,0]
// Example 2:

// Input: temperatures = [30,40,50,60]
// Output: [1,1,1,0]
// Example 3:

// Input: temperatures = [30,60,90]
// Output: [1,1,0]class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int result[]=new int[temperatures.length];
        // for(int iter=0;iter<temperatures.length;iter++){
        //     int count=0;
        //     for(int iterI=iter+1;iterI<temperatures.length;iterI++){
        //         if(temperatures[iter]<temperatures[iterI]){
        //             count++;
        //             result[iter]=count;
        //             break;
        //         }
        //         else
        //             count++;
        //     }   
        // }
        // return result;
        //n2 solution

        // using monotmic Stack () either increasing or decreasing stack


        int current=0;
        Stack<Integer> stack=new Stack<>();
        while(current<temperatures.length){
            if(!stack.isEmpty() &&temperatures[stack.peek()] < temperatures[current]){
                while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[current]){
                    int temp=stack.pop();
                    result[temp]=current-temp;
                }
            }
                stack.push(current);
                current++;
        }
        return result;
    }
}

//69
// ms
// Beats
// 42.10%
// Analyze Complexity
// Memory
// 62.17
// MB
// Beats
// 45.09%


