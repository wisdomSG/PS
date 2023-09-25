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
        A = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        select = new int[A];
        for (int i=0; i<A; i++) {
            select[i] = Integer.parseInt(st.nextToken());
        }}

    public static void main(String[] args) throws IOException {
        input();
        Arrays.sort(select);

        System.out.println(select[0] + " " + select[A-1]);
    }
}