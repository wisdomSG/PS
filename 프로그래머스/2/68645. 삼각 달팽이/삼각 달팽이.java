class Solution {

    // 방향 3가지 설정 
    private static final int[] dx = {0, 1, -1}; // [오른쪽, 아래, 대각선 위]
    private static final int[] dy = {1, 0, -1}; // [오른쪽, 아래, 대각선 위]

    public int[] solution(int n) {
        int[][] arr = new int[n][n];
        int x = 0;
        int y = 0;
        int d = 0;
        int total = (n * (n + 1)) / 2;  // 총 숫자의 개수

        // 1. 총 개수까지 반복
        for(int i=1; i<=total; i++) {
            arr[y][x] = i;
            int nx = x + dx[d];
            int ny = y + dy[d];
            
            // 2. 방향 변경
            if(nx==n || ny==n || nx==-1 || ny==-1 || arr[ny][nx] !=0) {
                d = (d + 1) % 3;
                nx = x + dx[d];
                ny = y + dy[d];
            }
                x = nx;
                y = ny;
        }

        // 2차원 배열 -> 1차원 배열 
        int[] result = new int[total];
        int index =0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                result[index++] = arr[i][j];
            }
        }
        return result;
    }
}