import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int sum = 0;
        int count = 0; 
        int dis = score.length%m;
        for(int i=dis; i<score.length; i++) {
            count++;
            if(count%m==0) sum += m*score[i-m+1];
        } 
        return sum;
    }
}
