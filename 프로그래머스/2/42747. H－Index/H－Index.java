import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int end = citations.length;
        Arrays.sort(citations);
        
        for(int i=end; i>=1; i--) {
            int h = citations[i-1];
            if(i <= citations[end-i]) return i;
        }
        
        return 0;
    }
}