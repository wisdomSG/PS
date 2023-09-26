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
        int length = (int)Math.log10(A)+1;
        long result = 0;
        switch (length) {
            case 1:
                result = A;
                break;
            case 2:
                result = (A-9)*2L + 9;
                break;
            case 3:
                result = (A-99)*3L + 90*2 + 9;
                break;
            case 4:
                result = (A-999)*4L + 900*3 + 90*2 + 9;
                break;
            case 5:
                result = (A-9999)*5L + 9000*4 + 900*3 + 90*2 + 9;
                break;
            case 6:
                result = (A-99999)*6L +  90000*5 + 9000*4 + 900*3 + 90*2 + 9;
                break;
            case 7:
                result = (A-999999)*7L + 900000*6 + 90000*5 + 9000*4 + 900*3 + 90*2 + 9;
                break;
            case 8:
                result = (A-9999999)*8L + 9000000*7 + 900000*6 + 90000*5 + 9000*4 + 900*3 + 90*2 + 9;
                break;
            case 9:
                result = (A-99999999)*9L + 90000000*8 +9000000*7 + 900000*6 + 90000*5 + 9000*4 + 900*3 + 90*2 + 9;
        }
        System.out.println(result);
    }
}