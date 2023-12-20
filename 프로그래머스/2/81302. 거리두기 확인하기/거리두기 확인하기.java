public class Solution {
    // 이동 방향을 나타내는 배열
    private static final int dx[] = {0, -1, 1, 0};
    private static final int dy[] = {-1, 0, 0, 1};

    // 자리 옆에 다른 응시자가 있는지 확인하는 메서드 (빈테이블인 경우 사용)
    private boolean isNextToVolunteer(char[][] room, int x, int y, int exclude) {
        for (int d = 0; d < 4; d++) {
            // 해당 방향이 제외된 방향이면 건너뛰기
            if (d == exclude) continue;

            // 새로운 좌표 계산
            int nx = x + dx[d];
            int ny = y + dy[d];

            // 새로운 좌표가 유효한 범위를 벗어나면 건너뛰기
            if (ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length)
                continue;

            // 해당 방향에 응시자가 있다면 true 반환
            if (room[ny][nx] == 'P') return true;
        }
        return false;
    }

    // 응시자 간의 거리가 적절한지 확인하는 메서드
    private boolean isDistanced(char[][] room, int x, int y) {
        for (int d = 0; d < 4; d++) {
            // 새로운 좌표 계산
            int nx = x + dx[d];
            int ny = y + dy[d];

            // 새로운 좌표가 유효한 범위를 벗어나면 건너뛰기
            if (ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length)
                continue;

            switch (room[ny][nx]) {
                // 응시자가 있다면 거리가 1이므로 바로 false 반환
                case 'P': return false;
                // 빈 테이블(O)이 있다면 그 방향으로 응시자가 있는지 확인
                case 'O':
                    if (isNextToVolunteer(room, nx, ny, 3 - d)) return false;
                    break;
            }
        }
        // 모든 방향에서 확인이 끝나면 true 반환
        return true;
    }

    // 각 방의 상태를 확인하여 거리두기를 잘 지키고 있는지 확인하는 메서드
    private boolean isDistanced(char[][] room) {
        for (int y = 0; y < room.length; y++) {
            for (int x = 0; x < room[y].length; x++) {
                // 응시자(P)가 있는 위치인 경우에만 거리두기 확인
                if (room[y][x] != 'P') continue;
                if (!isDistanced(room, x, y)) return false;
            }
        }
        // 모든 응시자에 대한 거리두기가 확인되면 true 반환
        return true;
    }

    // 주어진 여러 방의 상태에 대해 거리두기를 지켰는지 확인하는 메서드
    public int[] solution(String[][] places) {
        // 결과를 저장할 배열
        int[] answer = new int[places.length];

        // 각 방의 상태를 확인하고 결과를 배열에 저장
        for (int i = 0; i < answer.length; i++) {
            // 문자열로 표현된 방의 상태를 char 배열로 변환
            String[] place = places[i];
            char[][] room = new char[place.length][];
            for (int j = 0; j < room.length; j++) {
                room[j] = place[j].toCharArray();
            }

            // 거리두기가 잘 지켜졌는지 확인하여 결과 배열에 저장
            if (isDistanced(room)) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }

        // 최종 결과 반환
        return answer;
    }
}
