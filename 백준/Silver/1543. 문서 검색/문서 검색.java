import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  static String A,B;


  static void input() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 입력 받은 두 정수를 A와 B에 각각 할당
    A = br.readLine();
    B = br.readLine();

  }

  public static void main(String[] args) throws IOException {
    input();
    int result = 0;

    while(A.contains(B)) {
      result ++;
      int index = A.indexOf(B);
      A = A.substring(index + B.length());
    }
    System.out.println(result);
  }
}

