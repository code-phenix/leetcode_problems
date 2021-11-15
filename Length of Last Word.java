// Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.

// A word is a maximal substring consisting of non-space characters only.

 

// Example 1:

// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.
// Example 2:

// Input: s = "   fly me   to   the moon  "
// Output: 4
// Explanation: The last word is "moon" with length 4.
// Example 3:

// Input: s = "luffy is still joyboy"
// Output: 6
// Explanation: The last word is "joyboy" with length 6.
 

// Constraints:

// 1 <= s.length <= 104
// s consists of only English letters and spaces ' '.
// There will be at least one word in s.

class Solution {
    public int lengthOfLastWord(String s) {
        int len=0;
        for(int iterI=s.length()-1;iterI>=0;iterI--){
            if(s.charAt(iterI)!=' '){
                len++;
            }
            else{
                if(len>0)
                    return len;
            }
        }
        return len;
    }
}
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
//Memory Usage: 37.3 MB, less than 80.77% of Java online submissions for Length of Last Word.
