import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> groupCounts = new HashMap<>();
        int result = 0;
        
        for(String str: strArr) {
            int length = str.length();
            groupCounts.put(length, groupCounts.getOrDefault(length, 0) + 1);
        }
        
        for(int max : groupCounts.values()) {
            result = Math.max(result, max);
        }
        
        return result;
                    
    }
}