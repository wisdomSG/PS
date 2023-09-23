import java.io.IOException;
import java.util.Scanner;

public class Main {

  static int A;
  static String B;
  static String[] select;


  static void input() {
    Scanner scanner = new Scanner(System.in);

    A = scanner.nextInt();
    scanner.nextLine();  // Consume the newline left-over
    B = scanner.nextLine();

    // B를 잘라서 배열로 만들어야함
    select = new String[A];
    select = B.split(" ");
  }


  public static void main(String[] args) throws IOException {
    input();
    int num = 0;
    int result = 0;
    for (int i=0; i<A; i++) {
      int K = Integer.parseInt(select[i]);
      for (int j=1; j<=K; j++) {
        if ( K % j == 0) {
          num += 1;
        }
      }
      if(num ==2) {
        result += 1;
      }
      num = 0;
    }
  System.out.println(result);
  }
}