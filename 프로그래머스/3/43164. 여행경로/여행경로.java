import java.util.*;

class Solution {
    
    public Queue<String> result = new PriorityQueue<>();
    public int[] visited;
    
    public String[] solution(String[][] tickets) {
        visited = new int[tickets.length];
        dfs("ICN", "ICN", tickets, 0);
        String[] answer = result.peek().split(" ");
        return answer;
    }
    
    private void dfs(String start, String route, String[][]tickets, int count) {
        if(count == tickets.length) {
            result.add(route);
            return; 
        }
        for(int i=0; i<tickets.length; i++) {
            if(visited[i]==0 && tickets[i][0].equals(start)) {
                visited[i] = 1;
                dfs(tickets[i][1], route + " " + tickets[i][1], tickets, count+1);
                visited[i] = 0;
            }
        }
    }
}