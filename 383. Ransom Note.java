// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

// Each letter in magazine can only be used once in ransomNote.

 

// Example 1:

// Input: ransomNote = "a", magazine = "b"
// Output: false
// Example 2:

// Input: ransomNote = "aa", magazine = "ab"
// Output: false
// Example 3:

// Input: ransomNote = "aa", magazine = "aab"
// Output: true
 

// Constraints:

// 1 <= ransomNote.length, magazine.length <= 105
// ransomNote and magazine consist of lowercase English letters.
// Accepted
// 651.9K
// Submissions
// 1.1M
// Acceptance Rate
// 57.7%



class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length())
            return false;
        HashMap<Character,Integer> hs =new HashMap();
        for(int iterI=0;iterI<magazine.length();iterI++){
            if(!hs.containsKey(magazine.charAt(iterI)))
                hs.put(magazine.charAt(iterI),1);
            else
                hs.put(magazine.charAt(iterI),(hs.get(magazine.charAt(iterI)))+1);
        }
        for(int iterI=0;iterI<ransomNote.length();iterI++){
            if(!hs.containsKey(ransomNote.charAt(iterI)))
                    return false;
            else{
                if(hs.get(ransomNote.charAt(iterI))==1)
                    hs.remove(ransomNote.charAt(iterI));
                else
                    hs.put(ransomNote.charAt(iterI),(hs.get(ransomNote.charAt(iterI))-1));
            }
        }
        return true;
    }
}

// Runtime
// 36 ms
// Beats
// 30.8%
// Memory
// 52.2 MB
// Beats
// 26.20%
