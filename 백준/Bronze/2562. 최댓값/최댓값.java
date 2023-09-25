import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int num = 0;
        int[] select = new int[9];
        for (int i=0; i<9; i++) {
            select[i] = Integer.parseInt(br.readLine());
            if (select[i]> max) {
                max = select[i];
                num = i + 1;
            }
        }
        bw.write(max+ "\n"+ num);
        bw.flush();  // 버퍼의 내용을 실제 출력 스트림에 전송
    }
}
