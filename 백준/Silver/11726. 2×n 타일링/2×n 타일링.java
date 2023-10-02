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
        int[] array = new int[1001];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        for(int i =3; i<array.length; i++) {
            array[i] = (array[i-1] + array[i-2])%10007;
        }
        System.out.println(array[A]);
    }
}