// Given an integer n, return a string array answer (1-indexed) where:

// answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
// answer[i] == "Fizz" if i is divisible by 3.
// answer[i] == "Buzz" if i is divisible by 5.
// answer[i] == i (as a string) if none of the above conditions are true.
 

// Example 1:

// Input: n = 3
// Output: ["1","2","Fizz"]
// Example 2:

// Input: n = 5
// Output: ["1","2","Fizz","4","Buzz"]
// Example 3:

// Input: n = 15
// Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 

// Constraints:

// 1 <= n <= 104
// Accepted
// 835.6K
// Submissions
// 1.2M
// Acceptance Rate
// 69.1%

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res=new ArrayList<>();
        for(int iterI=1;iterI<=n;iterI++){
            if(iterI%3!=0 && iterI%5!=0){
                res.add(Integer.toString(iterI));
            }
            else {
                String temp="";
                if(iterI%3==0)
                    temp+="Fizz";
                if(iterI%5==0)
                    temp+="Buzz";
                res.add(temp);
            }
        }
        return res;
    }
}

// Runtime
// 3 ms
// Beats
// 57.73%
// Memory
// 48.4 MB
// Beats
// 37.82%
