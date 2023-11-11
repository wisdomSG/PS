import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, K;
    static int[] moneyArr;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        moneyArr = new int[N];

        for (int i=0; i<N; i++) {
            moneyArr[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        int result = 0;
        int money = K;

        for(int i=N-1; i>=0; i--) {
            if((K / moneyArr[i]) > 0) {
                result += money/moneyArr[i];
                money = K%moneyArr[i];
            }

        }
        System.out.println(result);
    }
}
