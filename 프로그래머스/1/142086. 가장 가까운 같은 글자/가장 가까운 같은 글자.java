class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int cnt = 0;
        int result = -1;
        answer[0] = -1;
        for(int i=1; i<s.length(); i++) {
            for(int j=i-1; j>=0; j--) {
                cnt++;
                if(s.charAt(i) == s.charAt(j)) {
                    result = cnt;
                    break;
                }    
            }
            answer[i] = result;
            result = -1;
            cnt = 0;
        }
        return answer;
    }
}