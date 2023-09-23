import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int A;
    static int[] select;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());  // 새로운 토큰을 위해 다시 초기화
        select = new int[A];
        for (int i = 0; i < A; i++) {
            select[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();

        Arrays.sort(select);
        int result = select[0] * select[A-1];

        System.out.println(result);
    }
}