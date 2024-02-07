class Solution {
    public int solution(int[] sides) {
        int result = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        for(int i=max-min+1; i<max+min; i++) {
            result ++;
        }
        return result;
    }
}