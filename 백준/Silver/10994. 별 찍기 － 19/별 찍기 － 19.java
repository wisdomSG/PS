import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  static int A;
  static int[][] arr;

  public static void input() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    A = Integer.parseInt(br.readLine());
  }
  
  public static void main(String[] args) throws IOException {
    input();
    int maxStar = 4*A -3;
    arr = new int[maxStar][maxStar];
    createStar(A, 0);

    for(int i=0; i<arr.length; i++) {
      StringBuilder result = new StringBuilder();
      for(int j=0; j<arr.length; j++) {
        if(arr[i][j] == 1) {
          result.append("*");
        } else {
          result.append(" ");
        }
      }
      System.out.println(result);
    }

  }
  public static void createStar(int n, int depth) {
    // 종료 조건: n이 1보다 작거나 같으면 1을 설정하고 재귀 종료
    if (n <= 1) {
      arr[depth][depth] = 1;
      return;
    }

    int start = depth;
    int finish = arr.length - depth - 1;

    // 점화식 적용
    for (int k = start; k <= finish; k++) {
      arr[start][k] = 1;
      arr[finish][k] = 1;
      arr[k][start] = 1;
      arr[k][finish] = 1;
    }

    // 재귀 호출
    createStar(n - 1, depth + 2);
  }
}
