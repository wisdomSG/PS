import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();

        // 1. 문자열 길이 구하기
        int length = A.length();

        // 2. 접미사 배열을 저장할 배열 선언
        String[] suffixes = new String[length];

        // 3. 모든 접미사를 배열에 저장
        for(int i=0; i<length; i++) {
            suffixes[i] = A.substring(i);
        }

        // 접미사 사전순으로 정렬
        Arrays.sort(suffixes);

        // 정렬된 접미사 출력 (향상된 for문)
        for(String suffix : suffixes) {
            System.out.println(suffix);
        }
    }
}
