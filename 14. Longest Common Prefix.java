// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

 

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
 class Solution {
    public String longestCommonPrefix(String[] strs) {
        String sml=strs[0];
        for(String tmp:strs){
            if(sml.length()>tmp.length()){
                sml=tmp;
            }
        }
        while(sml.length()>0){
            boolean flag=false;
        for(String tmp:strs){
                if(!tmp.startsWith(sml))
                    flag=true;
        }
        if(flag){
            sml=sml.substring(0,sml.length()-1);
        }
        else
            return sml;
        }
        return "";
    }
}

// Runtime
// 0 ms
// Beats
// 100%
// Memory
// 40.4 MB
// Beats
// 73.66%
