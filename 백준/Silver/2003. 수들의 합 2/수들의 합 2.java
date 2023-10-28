import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int A,B;

    static int[] arr;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        arr = new int[A];

        st = new StringTokenizer(br.readLine()); // 두 번째 줄을 읽어와서 다시 StringTokenizer 사용
        for (int i=0; i<A; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {
        input();

        int sum = 0; // 경우의 수

        // i는 시작점
        for(int i=0; i<arr.length; i++) {
            int k = 0;
            // j를 통해 수열 계산
            for(int j=0; j<arr.length-i; j++) {
                // 1. k에 arr[i]의 다음수를 계속 더해주기
                k += arr[i+j];

                // 2-1. k와 B가 같다면 sum ++;
                if(k==B) {
                    sum ++;
                    break;
                // 2-2. k가 B보다 커지면 break
                } else if(k>B) break;
            }
        }
        System.out.println(sum);
    }
}

