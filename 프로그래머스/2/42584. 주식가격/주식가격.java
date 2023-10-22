import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        
        // 1. Stack으로 짝을 찾아줌 : 떨어진 시기 찾기 
        for (int i = 0; i < prices.length; i++) {
            // 1-1. 값이 작아진 경우를 찾아 그 값보다 작은 경우(반복) stack에서 제거 및 기간 배열에 저장 
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int index = stack.pop();
                answer[index] = i - index;
            }
            stack.push(i);
        }
        
        // 2. 스택에 남아있는 인덱스들 처리 : 금액이 떨어진적이 없음 
        while (!stack.isEmpty()) {
            int index = stack.pop();
            answer[index] = prices.length - 1 - index;
        }
        
        return answer;
    }
}