import java.util.*;

public class Solution {
    public int solution(int n) {
        String answer = String.valueOf(n);
        int sum = 0;
        for(char c: answer.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}