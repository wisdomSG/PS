import java.util.*;

public class Solution {
    // State 클래스 정의: 현재 위치와 이동 거리 정보를 저장하는 클래스
    private static class State {
        public final int x;  // 현재 x 좌표
        public final int y;  // 현재 y 좌표
        public final int step;  // 현재까지의 이동 거리

        // State 클래스의 생성자
        private State(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }

    // 이동 방향을 나타내는 배열
    private static final int[] dx = {0, 1, 0, -1};
    private static final int[] dy = {-1, 0, 1, 0};

    // 주어진 지도에서 최단 경로의 길이를 찾는 메소드
    public int solution(int[][] maps) {
        // 각 위치의 방문 여부를 저장하는 배열
        boolean[][] isVisited = new boolean[maps.length][maps[0].length];

        // BFS를 위한 큐 선언과 초기 위치 정보 추가
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(0, 0, 1));
        isVisited[0][0] = true;

        // BFS 반복 수행
        while (!queue.isEmpty()) {
            // 큐에서 상태 정보를 꺼내옴
            State state = queue.poll();

            // 도착 지점에 도달하면 현재까지의 이동 거리 반환
            if (state.y == maps.length - 1 &&
                    state.x == maps[state.y].length - 1) {
                return state.step;
            }

            // 네 방향에 대해 이동 가능한지 확인하고 큐에 추가
            for (int d = 0; d < 4; d++) {
                int nx = state.x + dx[d];
                int ny = state.y + dy[d];

                // 범위를 벗어나면 무시
                if (ny < 0 || ny >= maps.length ||
                        nx < 0 || nx >= maps[ny].length) {
                    continue;
                }

                // 벽이면 무시
                if (maps[ny][nx] != 1) {
                    continue;
                }

                // 이미 방문한 곳이면 무시
                if (isVisited[ny][nx]) {
                    continue;
                }

                // 방문한 곳으로 표시하고 큐에 추가
                isVisited[ny][nx] = true;
                queue.add(new State(nx, ny, state.step + 1));
            }
        }

        // 도착 지점까지 도달할 수 없는 경우 -1 반환
        return -1;
    }
}
