class Solution {
    public String makeFancyString(String s) {
        StringBuilder result = new StringBuilder ();
        result.append (s.charAt (0));
        char pre=s.charAt(0);
        int fre=1;
        for(int i=1;i<s.length();i++){
            if(pre==s.charAt(i))
                fre++;
            else{
                fre=1;
                pre=s.charAt(i);
                }
            if(fre<3)
                result.append(s.charAt(i));
                
    }
        return result.toString();
}
}
//Runtime: 33 ms, faster than 81.55% of Java online submissions for Delete Characters to Make Fancy String.
//Memory Usage: 39.9 MB, less than 96.32% of Java online submissions for Delete Characters to Make Fancy String.
