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
    if(N%2==0) {
      System.out.println("SK");
    } else {
      System.out.println("CY");
    }
  }
}

