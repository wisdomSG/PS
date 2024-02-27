import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public long solution(long n) {
        String answer = String.valueOf(n);
        char[] charArray = answer.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new StringBuilder(new String(charArray)).reverse().toString();
        return Long.parseLong(sortedString);
    }
}
