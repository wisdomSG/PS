import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static String A,B;


  static void input() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    // 입력 받은 두 정수를 A와 B에 각각 할당
    A = st.nextToken();
    B = st.nextToken();

  }

  public static void main(String[] args) throws IOException {
    input();
    int result = 0;
    int lengthA = A.length();
    int lengthB = B.length();

    if (lengthA == lengthB) {
      for (int i = 0; i < lengthB; i++) {
        result += (A.charAt(i) != B.charAt(i)) ? 1 : 0;
      }
    } else {
      int minNum = 50;
      for (int k = 0; k < lengthB - lengthA + 1; k++) {
        int sum1 = 0;
        for (int i = 0; i < lengthA; i++) {
          if (A.charAt(i) != B.charAt(i + k)) {
            sum1++;
          }
        }
        minNum = Math.min(minNum, sum1);
      }
      result = minNum;
    }
    System.out.println(result);
  }
}