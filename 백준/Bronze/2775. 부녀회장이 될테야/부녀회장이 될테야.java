import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[][] fibo = new long[15][15];

        // 0층의 사는 사람 수 초기화
        for(int i=0; i<15; i++) {
            fibo[0][i] = i+1;
            fibo[i][0] = 1L;
        }

        // 다른 층의 사는 사람 수 계산
        for(int i=1; i<15; i++) {
            for(int j=1; j<15; j++) {
                fibo[i][j] = fibo[i][j-1] + fibo[i-1][j];
            }
        }

        int A = Integer.parseInt(br.readLine());

        for(int i = 0; i <A; i++) {
            int k = Integer.parseInt(br.readLine());  // 층
            int n = Integer.parseInt(br.readLine());  // 호
            bw.write(fibo[k][n-1] + "\n");
        }
        bw.flush();
    }
}
