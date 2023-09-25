import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[] select;

    static int sum;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        select = new int[9];

        for (int i=0; i<9; i++) {
            select[i] = Integer.parseInt(br.readLine());
            sum += select[i];
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        Arrays.sort(select);

        for( int i=0; i<8; i++) {
            int firstNum = select[i];
            for(int j=i+1; j<9; j++) {
                int secondNum = select[j];
                int total = sum - (firstNum + secondNum);
                if(total == 100) {
                    for(int k=0; k<9 ; k++) {
                        if(k!=i && k!=j) {
                            System.out.println(select[k]);
                        }
                    }
                    return;
                }
                total = 0;
            }
        }
    }
}