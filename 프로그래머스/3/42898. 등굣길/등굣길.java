class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] answer = new int[n + 1][m + 1];
        int div = 1000000007;
        answer[1][1] = 1;

        // 웅덩이 초기화
        for (int[] puddle : puddles) {
            int x = puddle[1];
            int y = puddle[0];
            answer[x][y] = -1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // 물 웅덩이를 만나면
                if (answer[i][j] == -1) {
                    answer[i][j] = 0;
                    continue;
                }

                answer[i][j] += (answer[i-1][j]+answer[i][j-1]) % div;
            }
        }

        return answer[n][m];
    }
}