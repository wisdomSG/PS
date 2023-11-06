import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        
        int totalSum = 45;
        
        for(int i: numbers) {
            totalSum -= i;
        }
        return totalSum;
    }
}