import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        int num = -1;
        
        for(int i=0; i<arr.length; i++) {
            int currentNum = arr[i];
            if(num != currentNum) {
                queue.offer(currentNum);
            }
            num = arr[i];
        }
        
        int size = queue.size();
        int[] answer = new int[size];
        
        for(int j=0; j<size; j++) {
            answer[j] = queue.poll();
        }

        return answer;
    }
}