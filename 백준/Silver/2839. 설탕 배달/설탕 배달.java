import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int A;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        A = Integer.parseInt(br.readLine());

    }

    public static void main(String[] args) throws IOException {
        input();
        int[] array = new int[5016];
        Arrays.fill(array, -1);

        for (int k=0; k<5001; k+=5) {
            // k가 5의 배수
            for (int i=0; i<15; i+= 3) {
                if(k==0 && i==0) {
                    array[0] = -1;
                } else {
                    int n = k +i;
                    array[n] = k/5 + i/3;
                }

            }
        }
        System.out.println(array[A]);
    }
}