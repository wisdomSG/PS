import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int A,B;
    static String[] dnaArr;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        dnaArr = new String[A];

        for (int i=0; i<A; i++) {
            dnaArr[i] = br.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        StringBuilder result = new StringBuilder();

        int minSum = 0;
        for(int i=0; i<B; i++) {
            Map<Character, Integer> map = new LinkedHashMap<>();
            map.put('A', 0);
            map.put('C', 0);
            map.put('G', 0);
            map.put('T', 0);
            for(int j=0; j<A; j++) {
                char c = dnaArr[j].charAt(i);
                map.put(c,map.get(c) +1);
            }
            Character maxKey = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
            int value = map.get(maxKey);
            minSum += (A - value);
            result.append(maxKey);
        }
        System.out.println(result);
        System.out.println(minSum);
    }
}
