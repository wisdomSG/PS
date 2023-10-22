import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        
        // 1. 각 작업의 완료 예상 일수 큐에 저장 
        for (int i = 0; i < progresses.length; i++) {
            int days = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            queue.offer(days);
        }
        
        List<Integer> result = new ArrayList<>();
        
        // 2. 배포 가능한 작업 수 찾기 
        while (!queue.isEmpty()) {
            int count = 1; // 배포 가능한 작업의 수 (첫 번째 작업은 무조건 배포 가능)
            int prev = queue.poll(); // 현재 작업의 완료 예상 일수
            
            // 2-1. 현재 작업보다 완료 예상 일수가 작거나 같은 작업을 찾아 배포 가능한 작업의 수 증가
            while (!queue.isEmpty() && prev >= queue.peek()) {
                queue.poll();
                count++;
            }
            
            // 2-2. 배포 가능한 작업의 수를 결과 리스트에 추가
            result.add(count);
        }
        
        // 3. 배열로 반환 
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}
