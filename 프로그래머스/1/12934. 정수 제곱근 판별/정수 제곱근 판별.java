class Solution {
    public long solution(long n) {
        double answer = Math.sqrt(n);
        if(answer%1==0) {
            return (long)Math.pow(answer + 1, 2);
        }
        return -1;
    }
}