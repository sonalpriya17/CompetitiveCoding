package String;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> br = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(isOpening(c)){
                br.push(c);
            }
            else {
                if(br.isEmpty()){
                    return false;
                }
                if (!isMatching(br.peek(), c)) {
                    return false;
                }
                else{
                    br.pop();
                }
            }
        }
        return br.isEmpty();
    }
    public static boolean isOpening(char c){
        return c=='('|| c=='{'||c=='[';
    }
    public static boolean isMatching(char a, char b){
        return (a=='('&& b== ')')|| (a=='{'&& b== '}')||(a=='['&& b== ']');
    }

    public static void main(String[] args) {
        System.out.println(" isValid : "+isValid("()[]{}"));
    }
}
