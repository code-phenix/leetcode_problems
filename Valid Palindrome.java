// Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
 

// Constraints:

// 1 <= s.length <= 2 * 105
// s consists only of printable ASCII characters.

class Solution {
      private boolean isAlphanumeric(char c) {
        return 'a' <= c && c <= 'z'
            || 'A' <= c && c <= 'Z'
            || '0' <= c && c <= '9';
    }

    private char lowerCase(char c) {
        return 'A' <= c && c <= 'Z' ? (char) (c - 'A' + 'a') : c;
    }
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
       int startPointer=0,endPointer=s.length()-1;
        while(startPointer<endPointer){
            while(!isAlphanumeric(s.charAt(startPointer))&& startPointer<endPointer)
                startPointer++;
            while(!isAlphanumeric(s.charAt(endPointer)) && startPointer<endPointer)
                endPointer--;
            if(lowerCase(s.charAt(startPointer))!=lowerCase(s.charAt(endPointer)))
                return false;
            startPointer++;
            endPointer--;
        }
        return true;
    }
}
//Runtime: 3 ms, faster than 67.69% of Java online submissions for Valid Palindrome.
//Memory Usage: 40.4 MB, less than 13.32% of Java online submissions for Valid Palindrome.
