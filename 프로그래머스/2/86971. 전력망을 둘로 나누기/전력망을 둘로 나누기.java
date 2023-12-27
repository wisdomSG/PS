import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int[][] graph;
    
    // bfs() : BFS를 통해 송전탑의 개수의 차이(절대값) 계산 
    private int bfs(int n, int start) {
        int[] visited = new int[n+1]; // 노드의 방문여부 확인 배열 
        int count = 1; // 연결된 송전탑의 개수 
        
        Queue<Integer> queue = new LinkedList<Integer>();
        
        visited[start] = 1;
        queue.offer(start);
        
        while(!queue.isEmpty()) {
            int temp = queue.poll();
            
            // 현재 노드와 연결된 노드를 확인하며 큐에 추가 
            for(int i=1; i<=n; i++) {
                if(graph[temp][i] == 1 & visited[i] != 1) {
                    visited[i] = 1;
                    queue.offer(i);
                    count++;
                }
            }
        }
        
        // 네트워크 크기 차이 반환 (한 네트워크 크기 - 다른 네트워크 크기)
        return Math.abs(count - (n - count));
    }
    
    // n : 송전탑의 개수, wires[][] : 전선 정보
    public int solution(int n, int[][] wires) {
        int answer = n;
        graph = new int[n+1][n+1];
        
        // 1. 주어진 선 정보로 그래프 초기화 -> 연결되어진 선은 1로 표시 
        for(int i=0; i< wires.length; i++) {
            int from = wires[i][0], to = wires[i][1];
            graph[from][to] = 1;
            graph[to][from] = 1; 
        }
        
        // 2. 각 선을 하나씩 끊어보며 네트워크 크기 차이의 최솟값을 찾음
        for(int i=0; i<wires.length; i++) {
            int from = wires[i][0], to = wires[i][1];
            
            // 2-1. 선을 끊음
            graph[from][to] = 0;
            graph[to][from] = 0;
            
            // 2-2. 네트워크 크기 차이의 최솟값 갱신
            answer = Math.min(answer, bfs(n, from));
            
            // 2-3. 선을 다시 연결
            graph[from][to] = 1;
            graph[to][from] = 1;
        }
        
        return answer;
    }
}