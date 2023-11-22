import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] rowTokens = br.readLine().split(" ");
        int[] jump = new int[num+1];
        Arrays.fill(jump,1001); // 최댓값을 넣어 놓음
        jump[1] = 0;

        for (int i = 1; i <= num; i++) {
            int moveLen = Integer.parseInt(rowTokens[i-1]); // 움직일 수 있는 거리 
            for(int j = i+1; j<=moveLen+i; j++) {
                if(j > num) break;
                jump[j] = Math.min(jump[i]+1, jump[j]); // 작은 값만 저장
            }
        }
        // 출력
        System.out.println(jump[num]==1001?-1:jump[num]);
    }
}