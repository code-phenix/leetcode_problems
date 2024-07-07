// Given a string s, find the length of the longest 
// substring
//  without repeating characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

// Constraints:

// 0 <= s.length <= 5 * 104
// s consists of English letters, digits, symbols and spaces.

class Solution {
    public int lengthOfLongestSubstring(String s) {
            int start=0,end=0;
            int maxLen=s.length()==0 ? 0:1;
            Set<Character> hs=new HashSet<>();
            while(end<s.length()){
                while(hs.contains(s.charAt(end))){
                    hs.remove(s.charAt(start));
                    start++;
                }
                maxLen=Math.max(maxLen,(end-start+1));
                hs.add(s.charAt(end));
                end++;
            }    
            return maxLen;    
    }
}

//Runtime
// 862
// ms
// Beats
// 5.06%
// Analyze Complexity
// Memory
// 45.23
// MB
// Beats
// 7.28%
