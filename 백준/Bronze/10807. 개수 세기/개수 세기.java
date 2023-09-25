import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int A,B;
    static int[] select;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        A = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        select = new int[A];
        for (int i=0; i<A; i++) {
            select[i] = Integer.parseInt(st.nextToken());
        }
        B = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        input();
        int sum = 0;
        for(int i=0; i<A; i++) {
            if(select[i] == B) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}