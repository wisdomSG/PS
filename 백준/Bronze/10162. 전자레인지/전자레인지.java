import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int time;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        time = Integer.parseInt(br.readLine());

        if(time%10==0) {
            int time10 = time/10;
            int min30 = time10/30;
            int min6 = (time10 - min30*30)/6;
            int min1 = time10 - min30*30 - min6*6;
            System.out.println(min30 + " " + min6 + " " + min1);
        } else {
            System.out.println(-1);
        }
    }
}