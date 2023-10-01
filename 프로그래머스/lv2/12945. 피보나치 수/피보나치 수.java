class Solution {
    public int solution(int n) {
        int[] men = new int[n+1];
        men[0] = 0;
        men[1] = 1;
        
        for (int i=2; i<men.length; i++) {
            men[i] = (men[i-2] + men[i-1])%1234567;
        }
        
        return men[n];
    }
}