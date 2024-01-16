import java.util.*;

class Solution {
    // 네트워크 개수를 세기 위한 메소드
    public int solution(int n, int[][] computers) {
        int cnt = 0;  // 네트워크 개수를 저장할 변수
        boolean[] visited = new boolean[n];  // 방문 여부를 나타내는 배열

        // 모든 컴퓨터를 돌면서 방문하지 않은 컴퓨터를 찾아 BFS 탐색 수행
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfs(computers, visited, i);  // BFS 탐색 수행
                cnt++;  // 네트워크 개수 증가
            }
        }
        // 최종적으로 찾아진 네트워크 개수 반환
        return cnt;
    }
    
    // BFS 탐색을 수행하는 메소드
    private void bfs(int[][] computers, boolean[] visited, int v) {
        Queue<Integer> queue = new LinkedList<>();  // BFS를 위한 큐
        visited[v] = true;  // 시작 노드를 방문했다고 표시
        queue.add(v);  // 큐에 시작 노드 추가

        // 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            Integer w = queue.poll();  // 큐에서 노드를 꺼냄
            for (int i = 0; i < computers.length; i++) {
                // 현재 노드와 연결된 노드 중 방문하지 않은 노드를 큐에 추가
                if (computers[w][i] == 1 && !visited[i]) {
                    visited[i] = true;  // 해당 노드를 방문했다고 표시
                    queue.add(i);  // 큐에 방문한 노드 추가
                }
            }
        }
    }
}
