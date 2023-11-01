import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int N,M;
  static int[][] arr;

  public static void input() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());


    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    arr = new int[N][M];
    for(int i=0; i<N; i++) {
      String str = br.readLine();
      for(int j=0; j<M; j++) {
        arr[i][j] = str.charAt(j) - '0';
      }
    }
  }

  public static void main(String[] args) throws IOException {
    input();
    int len = Math.min(N, M);
    while(len>1) {
      for(int i=0; i<=N-len; i++) {
        for(int j=0; j<=M-len; j++) {
          // 기준점을 기준으로 대각선, 아래, 오른쪽 3개의 꼭짓점이 기준과 같은지 확인
          int standard = arr[i][j];
          if((standard == arr[i][j+len-1]) &&  (standard== arr[i+len-1][j]) && (standard==arr[i+len-1][j+len-1])) {
            System.out.println(len*len);
            return;
          }
        }
      }
      len--;
    }
    System.out.println(len*len);
  }
}
