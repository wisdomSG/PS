import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int n = s.length();

        // 1. 문자열 회전
        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

            // 2. 스택을 사용하여 올바른 괄호 문자열인지 확인
            for (int j = 0; j < n; j++) {
                char c = s.charAt((i + j) % n);
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty() || !isPair(stack.pop(), c)) {
                        isValid = false;
                        break;
                    }
                }
            }

            // 3. 올바른 괄호 문자열이면 answer 증가
            if (isValid && stack.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }

    // 2-2. 괄호의 짝이 맞는지 확인하는 함수
    private boolean isPair(char open, char close) {
        return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
    }
}
