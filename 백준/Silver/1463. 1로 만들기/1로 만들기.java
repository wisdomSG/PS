import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int A;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        A = Integer.parseInt(br.readLine());

    }

    public static void main(String[] args) throws IOException {
        input();
        int[] array = new int[1000001];
        array[1] = 0;

        for(int i =2; i<array.length; i ++) {
            array[i] = array[i-1] + 1;

            if(i%2 ==0) {
                array[i] = Math.min(array[i], array[i/2]+1);
            }
            if(i%3 ==0) {
                array[i] = Math.min(array[i], array[i/3]+1);
            }
        }
        System.out.println(array[A]);
    }
}