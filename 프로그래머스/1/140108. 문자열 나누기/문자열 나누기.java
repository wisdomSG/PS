class Solution {
    public int solution(String s) {
        int answer = 1;
        int check = 1;
        int current = s.charAt(0);
        for(int i=1; i<s.length(); i++) {
            if(check == 0) {
                answer ++;
                current = s.charAt(i);
            }
            check += (current == s.charAt(i)? +1 : -1);
        
         }
        return answer;
     }
}