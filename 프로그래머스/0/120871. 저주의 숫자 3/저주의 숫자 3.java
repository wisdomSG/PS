class Solution {
    public int solution(int n) {
        int[] answer = new int[n];
        int num = 1;
        int i = 0;
        while (i < n) {
            if (num % 3 == 0 || Integer.toString(num).contains("3")) {
                num++;
                continue;
            }
            answer[i++] = num++;
        }
        return answer[n - 1];
    }
}
