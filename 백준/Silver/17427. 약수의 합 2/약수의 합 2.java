import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int A;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());

    }

    public static void main(String[] args) throws IOException {
        input();
        long sum = 0;
        for (int i=1; i<=A; i++) {
            int num = i;
            for (int k=i; k<=A; k += i) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}