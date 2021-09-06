// Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

// In the American keyboard:

// the first row consists of the characters "qwertyuiop",
// the second row consists of the characters "asdfghjkl", and
// the third row consists of the characters "zxcvbnm".

 

// Example 1:

// Input: words = ["Hello","Alaska","Dad","Peace"]
// Output: ["Alaska","Dad"]
// Example 2:

// Input: words = ["omk"]
// Output: []
// Example 3:

// Input: words = ["adsdf","sfd"]
// Output: ["adsdf","sfd"]
 

// Constraints:

// 1 <= words.length <= 20
// 1 <= words[i].length <= 100
// words[i] consists of English letters (both lowercase and uppercase). 

class Solution {
    public static String[] check(String[] words,int index){
        String firstRow="qwertyuiop",secondRow="asdfghjkl",thirdRow="zxcvbnm";
        int len=words[index].length();
        String temp=words[index].toLowerCase();
        if(firstRow.indexOf(temp.charAt(0))!=-1){
            // System.out.println("firstRow");
            for(int iterI=1;iterI<len;iterI++){
                if(firstRow.indexOf(temp.charAt(iterI))==-1){
                    words[index]="-1";
                    
                    break;
                }
            }
        }
        else if(secondRow.indexOf(temp.charAt(0))!=-1){
            // System.out.println("secondRow");
            for(int iterI=1;iterI<len;iterI++){
                if(secondRow.indexOf(temp.charAt(iterI))==-1){
                    words[index]="-1";
                    
                    break;
                }
            }
        }
        else if(thirdRow.indexOf(words[index].charAt(0))!=-1){
            // System.out.println("thirdRow");
            for(int iterI=1;iterI<len;iterI++){
                if(thirdRow.indexOf(temp.charAt(iterI))==-1){
                    words[index]="-1";
                    break;
                }
            }
        }
        return words;
    }
    public static String[] findWords(String[] words) {
        int len=words.length;
        int count=len;
        for(int iterI=0;iterI<len;iterI++){
            words=check(words,iterI);
            if(words[iterI].equals("-1")){
                count--;
            }
        }
        int temp=0;
        String res[]=new String[count];
        for(int iterI=0;iterI<len;iterI++){
            if(!words[iterI].equals("-1")){
                res[temp]=words[iterI];
                temp++;
            }
        }
        return res;
    }
}

// Runtime: 0 ms, faster than 100.00% of Java online submissions for Keyboard Row.
// Memory Usage: 36.5 MB, less than 98.24% of Java online submissions for Keyboard Row.
