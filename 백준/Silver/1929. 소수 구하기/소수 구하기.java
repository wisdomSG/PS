import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] select = new int[2];

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 2; i++) {
            select[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {
        input();

        int A = select[0];
        int B = select[1];
        boolean[] isPrime = new boolean[B + 1];

        // 초기화 -> 일단 전부 true
        for (int i = 2; i <= B; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체
        for (int i = 2; i <= Math.sqrt(B); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= B; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 결과 출력 -> true 출력: 소수
        for (int i = A; i <= B; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}