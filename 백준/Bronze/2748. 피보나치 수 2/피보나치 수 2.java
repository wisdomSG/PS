import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int A;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        A = Integer.parseInt(br.readLine());

    }

    public static void main(String[] args) throws IOException {
        input();
        long[] fibo = new long[91];
        fibo[0] = 0L;
        fibo[1] = 1L;
        for(int i=2; i<fibo.length; i++) {
            fibo[i] = fibo[i-2] + fibo[i-1];
        }
        System.out.println(fibo[A]);
    }
}