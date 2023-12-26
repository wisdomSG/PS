class Solution {
    // 최대 탐험 횟수를 저장할 전역 변수
    private int max = 0;

    // 주어진 던전(dungeons)에서 k만큼의 에너지로 탐험할 때 최대 탐험 횟수를 반환하는 메서드
    public int solution(int k, int[][] dungeons) {
        // 각 던전을 방문했는지 여부를 저장할 배열
        int[] visited = new int[dungeons.length];
        
        // 탐험을 시작하는 메서드 호출
        explore(dungeons, visited, k, 0);

        // 최대 탐험 횟수 반환
        return max;
    }

    // 재귀적으로 던전을 탐험하며 최대 탐험 횟수를 찾는 메서드
    private void explore(int[][] dungeons, int[] visited, int k, int count) {
        // 모든 던전을 방문하며 가능한 경우를 체크
        for (int i = 0; i < dungeons.length; i++) {
            // 방문하지 않았고, 현재 남은 에너지가 해당 던전을 탐험하기에 충분한 경우
            if (visited[i] == 0 && k >= dungeons[i][0]) {
                // 던전을 방문했다고 표시
                visited[i] = 1;
                // 던전을 탐험하고, 탐험 횟수와 남은 에너지 갱신
                explore(dungeons, visited, k - dungeons[i][1], count + 1);
                
                // 백트래킹: 다른 경로로의 탐험을 위해 방문 표시 해제
                visited[i] = 0;
            }
        }     
        
        // 현재 경로에서 얻은 최대 탐험 횟수를 업데이트
        if (max < count) {
            max = count;
        }
    }
}