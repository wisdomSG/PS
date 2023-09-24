import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] select = new int[3];

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<3; i++) {
            select[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        Arrays.sort(select);
        int A = select[0];
        int B = select[1];
        int C = select[2];
        int result;
        if (A == B && B == C) {
            result = 10000 + A*1000;
        } else if (A == B || B == C) {
            result = 1000 + B*100;
        } else {
            result = C*100;
        }
        System.out.println(result);
    }
}