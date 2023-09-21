import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringTokenizer sb = new StringTokenizer(br.readLine());
    int max = 0;

    Integer A = Integer.parseInt(st.nextToken());
    Integer B = Integer.parseInt(st.nextToken());

    int result;
    int[] numbers = new int[A];
    for (int i=0; i < A; i++) {
      numbers[i] = Integer.parseInt(sb.nextToken());
    }

    for (int i=0; i<A-2; i++) {
      for (int j=i+1; j<A-1; j++) {
        for (int k=j+1; k<A; k++) {
          int sum = numbers[i] + numbers[j] + numbers[k];
          if (sum <= B && sum > max) {
            max = sum;
          }
        }
      }
    }

    System.out.println(max);
  }
}