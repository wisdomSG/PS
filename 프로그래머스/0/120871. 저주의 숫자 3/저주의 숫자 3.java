class Solution {
    public int solution(int n) {
        int[] answer = new int[100];
        int num = 1;
        int i=0;
        while(i<100) {
            if(num%3==0 || Integer.toString(num).contains("3")) {
                num ++;
                continue;
            }
            answer[i] = num;
            i++;
            num ++;
            
        }
        return answer[n-1];
    }
}