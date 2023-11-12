import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static String[] str;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        str = new String[N]; // 배열을 생성하여 초기화

        for(int i=0; i<N; i++) {
            str[i] = br.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        int result = 0;
        for(int i=1; i<str.length; i++) {
            int count = 0;
            for(char c: str[0].toCharArray()) {
                if(str[i].indexOf(c) == -1) { // 같은 값이 없다면 count ++;
                    count ++;
                } else { // 같은 값이 있다면 그 값을 빈문자열로 변경
                    str[i] = str[i].replaceFirst(String.valueOf(c), "");
                }
            }
            if(count <=1 && str[i].length()<=1) { // count가 1이하이고 남은 문자열이 1개이하 일때만 비슷한 단어
                result ++;
            }
        }
        System.out.println(result);
    }
}
