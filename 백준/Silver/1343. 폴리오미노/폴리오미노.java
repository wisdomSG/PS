import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  static String board;
  static StringBuilder result = new StringBuilder();


  public static void input() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    board = br.readLine();

  }

  public static void main(String[] args) throws IOException {
    input();
    int count = 0;

    for(char c: board.toCharArray()) {
      if(c=='X') {
        count ++;
      } else {
        mino(count);
        if(count%2==1&&count!=0) {
          System.out.println(-1);
          return;
        }
        result.append(c);
        count = 0;
      }
    }
    if(count!=0) {
      mino(count);
      if(count%2==1) {
        System.out.println(-1);
        return;
      }
    }
    System.out.println(result);
  }

  public static void mino(int count) {
    if(count % 2==0 && count!=0) {
      int numA = (count / 4) *4;
      int numB = count - numA;
      result.append("A".repeat(numA));
      result.append("B".repeat(numB));
    }
  }
}
