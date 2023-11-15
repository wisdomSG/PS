import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int countS;
    static int countL;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        countS = 0;  // 초기화 추가
        countL = 0;  // 초기화 추가

        char[] seats = br.readLine().toCharArray();  // 문자열을 char 배열로 읽어옴

        for (char seat : seats) {
            if (seat == 'S') {
                countS++;
            } else {
                countL++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        int sum = countS + (countL / 2) + 1;
        int result = Math.min(sum, N);
        System.out.println(result);
    }
}
