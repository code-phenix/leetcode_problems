class Solution {
    public static void push(char var,char[] stack,int count){
        stack[count]=var;
    }
    public boolean isValid(String s) {
        int top=0;
        int count=-1;
        char stack[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                count++;
                push(s.charAt(i),stack,count);
            }
            else if(count<0&&(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'))
                return false;
            else{
                // System.out.println(stack[count]);
                if(s.charAt(i)==')'){
                    if(stack[count]!='(')
                        return false;
                    count--;
                }
                else if(s.charAt(i)==']'){
                    if(stack[count]!='[')
                        return false;
                    count--;
                }
                else{
                    if(stack[count]!='{')
                        return false;
                    count--;
                }
            }
        }
        if(count>=0)
            return false;
        return true;
    }
}

//Runtime: 1 ms, faster than 98.62% of Java online submissions for Valid Parentheses.
//Memory Usage: 36.8 MB, less than 93.89% of Java online submissions for Valid Parentheses.
