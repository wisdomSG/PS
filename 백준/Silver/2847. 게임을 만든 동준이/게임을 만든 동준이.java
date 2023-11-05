import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int maxLv;
    static int[] levelArr;
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        maxLv = Integer.parseInt(br.readLine());
        levelArr = new int[maxLv];
        for(int i=0; i<maxLv; i++) {
            levelArr[i]= Integer.parseInt(br.readLine());
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        // maxExp : 최고레벨의 최고 경험치
        int maxExp = levelArr[maxLv-1];
        // result : 변경횟수
        int result = 0;
        for(int i=maxLv-2; i>=0; i--) {
            if(maxExp <= levelArr[i]) {
                int before = levelArr[i];
                levelArr[i] = maxExp -1;
                result += (before - levelArr[i]);

            }
            maxExp = levelArr[i];
        }
        System.out.println(result);
    }
}