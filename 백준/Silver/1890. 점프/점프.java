import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        long[][] board = new long[num+1][num+1];
        board[1][1] = 1;

        for (int i = 1; i <= num; i++) {
            String[] rowTokens = br.readLine().split(" ");
            for (int j = 1; j <= num; j++) {
                int moveLen = Integer.parseInt(rowTokens[j-1]);  // 움직이는 길이 
                if(board[i][j] >= 1 && moveLen !=0) {
                    // 오른쪽으로 이동
                    int right = j + moveLen;
                    if(right <=num) { // num보다 작거나 같아야지만 이동가능
                        board[i][right] += board[i][j]; // DP
                    }
                    // 아래
                    int down = i + moveLen;
                    if(down <=num) {
                        board[down][j] += board[i][j];
                    }
                }
            }
        }
        // 출력
        System.out.println(board[num][num]);
    }
}