import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());

    char[][] board = new char[A][B]; // 이차원 char 배열로 판을 표현
    for (int i = 0; i < A; i++) {
      String line = br.readLine();
      for (int j = 0; j < B; j++) {
        board[i][j] = line.charAt(j);
      }
    }

    int[][] boardNum1 = new int[A][B];
    int[][] boardNum2 = new int[A][B];

    for (int i=0; i<A; i++) {
      for (int j=0; j<B; j++) {
        if ((i + j) %2 == 0) { // 짝
            if(board[i][j] == 'B') {
              boardNum1[i][j] = 0;
              boardNum2[i][j] = 1;
            } else {
              boardNum1[i][j] = 1;
              boardNum2[i][j] = 0;
            }
        } else { // 홀
          if(board[i][j] == 'W') {
            boardNum1[i][j] = 0;
            boardNum2[i][j] = 1;
          } else {
            boardNum1[i][j] = 1;
            boardNum2[i][j] = 0;
          }
        }
      }
    }

    int minDiff = 64;
    for (int x = 0; x <= A- 8; x++) {
      for (int y = 0; y <= B - 8; y++) {
        int diff1 = 0;
        int diff2 = 0;
        for (int i = 0; i < 8; i++) {
          for (int j = 0; j < 8; j++) {
            diff1 += boardNum1[x + i][y + j];
            diff2 += boardNum2[x + i][y + j];
          }
        }
        int currentMin = Math.min(diff1, diff2);
        if (currentMin < minDiff) {
          minDiff = currentMin;
        }
      }
    }

    System.out.println(minDiff);
  }
}