class Solution {
    public boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == '(' || c == '{' || c == '[')
                s.push(c);
            else{
                if(s.isEmpty())
                    return false;
                else if(c == ')'){
                    if(s.pop() != '(')
                        return false;
                } else if(c == ']'){
                    if(s.pop() != '[')
                        return false;
                } else if(c == '}'){
                    if(s.pop() != '{')
                        return false;
                }
            }
        }
        if(!s.isEmpty())
            return false;
        return true;
    }
}