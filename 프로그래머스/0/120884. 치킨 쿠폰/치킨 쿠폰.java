class Solution {
    public int solution(int chicken) {
        String num = chicken + "";
        int answer = 0;
        for(int i=0; i<num.length(); i++) {
            answer += chicken/10;
            chicken = chicken%10 + chicken/10;
        }
        return answer;
    }
}