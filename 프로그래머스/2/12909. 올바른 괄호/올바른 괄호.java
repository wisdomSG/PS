import java.util.Stack;

class Solution {
    boolean solution(String s) {

        Stack<Character> stack = new Stack<>();

        // '(' 와 ')' 짝 맞추기 
        for(char c: s.toCharArray()) {
            if(c=='(') {
                stack.push(c);
            } else if(c==')') {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        
        // 짝이 제대로 맞았으면 stack은 비워있어야함.
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}