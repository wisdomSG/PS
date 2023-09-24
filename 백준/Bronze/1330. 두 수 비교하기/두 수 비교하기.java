import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int A, B;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        input();
        if (A < B) {
            System.out.println("<");
        } else if (A > B) {
            System.out.println(">");
        } else {
            System.out.println("==");
        }
    }
}