class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }
    
    private void dfs(int[] numbers, int target, int idx, int result) {
        if(idx == numbers.length) {
            if(target == result) {
                answer ++;
            }
            return;
        }
        
        dfs(numbers, target, idx+1, result+numbers[idx]);
        dfs(numbers, target, idx+1, result-numbers[idx]);
    }
}