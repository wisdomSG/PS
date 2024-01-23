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
            
            // 현재위치에서 오른쪽으로 진행한 후 'A'가 아닌 문자를 만날 때 까지의 이동거리 계산하고 오른쪽으로 진행한 거리에서 왼쪽으로 돌아가는 거리(i)를 더함
            move = Math.min(move, i * 2 + name.length() - count);
            // 현재 위치에서 왼쪽으로 진행한 후 'A'가 아닌 문자를 만날 때까지의 이동거리 계산하고 왼쪽으로 진행한 거리에서 오른쪽으로 돌아가는 거리(i)를 더함 
            move = Math.min(move, (name.length() - count) * 2 + i);
        }
        
        return answer + move;
    }
}