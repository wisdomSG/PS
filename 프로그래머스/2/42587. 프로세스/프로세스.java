import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int num: priorities) {
            maxHeap.add(num);
        }
        int answer = 0;
        while(!maxHeap.isEmpty()) {
            for(int i=0; i<priorities.length; i++) {
                if(priorities[i] == maxHeap.peek()) { 
                    maxHeap.poll(); // 최댓값 삭제 
                    answer ++;
                    if(i == location) return answer;
                }
            }
        }
        return answer;
    }
}