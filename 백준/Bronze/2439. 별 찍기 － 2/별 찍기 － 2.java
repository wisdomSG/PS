import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i=1; i<=num; i++) {
            bw.write(" ".repeat(num-i));
            bw.write("*".repeat(i) +"\n");
        }
        bw.flush();  // 버퍼의 내용을 실제 출력 스트림에 전송
    }
}
