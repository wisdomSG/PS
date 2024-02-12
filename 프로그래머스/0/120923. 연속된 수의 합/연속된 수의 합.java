class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        if(num %2 == 0) {
            int n = num / 2;
            answer[0] = total/num - n + 1; 
        } else {
            int n = num / 2;
            answer[0] = total/num - n; 
        }
        
        for(int i=1; i<num; i++) {
            answer[i] = answer[i-1] + 1;
        }
        return answer;
    }
}