class Solution {
    public int calculate(String str) {
        Stack<Integer> s = new Stack<>();
        int num = 0, res = 0;
        int sign = 1;
        for(int i = 0; i < str.length(); i++){
            Character c = str.charAt(i);
            if(Character.isDigit(c))
                num = num*10 + (c-'0');
            else if(c == '+'){
                res += sign*num;
                sign = 1;
                num = 0;
            }
            else if(c == '-'){
                res += sign*num;
                sign = -1;
                num = 0;
            } else if(c == '('){
                s.push(res);
                s.push(sign);
                sign = 1;
                res = 0;
            } else if(c == ')'){
                res += sign*num;
                num = 0;
                res *= s.pop();
                res += s.pop();
            }
        }
        if(num != 0) res += sign*num;
        return res;
    }
}