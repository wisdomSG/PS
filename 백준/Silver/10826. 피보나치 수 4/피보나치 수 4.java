import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

  static int N;


  public static void input() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    N = Integer.parseInt(br.readLine());

  }

  public static void main(String[] args) throws IOException {
    input();
    BigInteger[] dy = new BigInteger[N+2];
    // 1. 초기값 구하기
    dy[0] = BigInteger.ZERO;
    dy[1] = BigInteger.ONE;

    // 2. 점화식을 토대로 dy 배열 채우기
    for(int i=2; i<N+1; i++) {
      dy[i] = dy[i-1].add(dy[i-2]);
    }
    System.out.println(dy[N]);
  }
}