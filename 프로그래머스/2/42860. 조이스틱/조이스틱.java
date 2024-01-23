import java.util.*;

class Solution {
    public int solution(String name) {
        int answer = 0;
        int count;
        int move = name.length() - 1; 

        for(int i=0; i<name.length(); i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
            
            count = i+1;
            while(count<name.length() && name.charAt(count)=='A') {
                count++;
            }
            
            move = Math.min(move, i * 2 + name.length() - count);
            move = Math.min(move, (name.length() - count) * 2 + i);
        }
        
        return answer + move;
    }
}