import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int currentWeight = 0;
        int index = 0;

        // 1. 모든 대기 트럭 반복 : 트럭이 바로 다리에 안올라갈수도 있기 때문에 while문 사용 
        while (index < truck_weights.length) {
            time++; 

            // 2. 다리를 건너는 트럭이 다리 길이만큼 되면 큐에서 제거
            if (bridge.size() == bridge_length) {
                currentWeight -= bridge.poll();
            }

            // 3-1. 다음 트럭이 다리에 올라갈 수 있는지 확인
            if (currentWeight + truck_weights[index] <= weight) {
                bridge.offer(truck_weights[index]);
                currentWeight += truck_weights[index];
                index++; // index는 다리에 트럭이 올라가야지만 증가 
            } else {
                // 3-2. 다음 트럭이 다리에 올라갈 수 없으면 0을 큐에 추가하여 시간 경과 표시 
                bridge.offer(0);
            }
        }

        // 4. 마지막 트럭이 다리를 건너는 시간(다리 길이)만큼 더해줌
        time += bridge_length;

        return time;
    }
}
