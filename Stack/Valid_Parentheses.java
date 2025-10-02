import java.util.*;
public class Solution{
    static boolean isValid(String str){
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='[' || ch=='{' || ch=='('){//openning bracket
                s.push(ch);
            }else{//closing bracket
                if(s.isEmpty()){//empty case
                return false;
                }
                if((s.peek()=='['&& ch==']')|| (s.peek()=='{'&& ch=='}') || (s.peek()=='('&& ch==')')){//matching case
                    s.pop();
                }else{//Not matching case
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        System.out.println("Hello!");
        System.out.println(isValid("()[]{}"));
    }
}
