class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x<10){
            return true;
        }
        if(x<100)
            if(x%11!=0)
                return false;
        int another=0;
        int a=x;
        while(x>0){
            another*=10;
            another+=x%10;
            x=x/10;
        }
        if(a==another){
            return true;
        }
        return false;
    }
}
//Runtime: 6 ms, faster than 99.97% of Java online submissions for Palindrome Number.
//Memory Usage: 38.6 MB, less than 32.82% of Java online submissions for Palindrome Number.
