import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  static int N;


  public static void input() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    N = Integer.parseInt(br.readLine());

  }

  public static void main(String[] args) throws IOException {
    input();
    int[][] dy = new int[N+1][2];
    // 1. 초기값 구하기
    dy[1][0] = 0;
    dy[1][1] = 1;
    
    // 2. 점화식을 토대로 dy 배열 채우기 
    for(int i=2; i<N+1; i++) {
      dy[i][0] = dy[i-1][1];
      dy[i][1] = dy[i-1][0] + dy[i-1][1];
    }
    System.out.print(dy[N][0] + " " + dy[N][1]);
  }
}
