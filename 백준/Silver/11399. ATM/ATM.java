import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int peopleNum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        peopleNum = Integer.parseInt(br.readLine());
        int[] people = new int[peopleNum];
        int result = 0;
        int max = peopleNum;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<peopleNum; i++) {
            people[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(people);
        for(int i=0; i<peopleNum; i++) {
            result += people[i]*max;
            max--;
        }

        System.out.println(result);

    }
}