import java.util.ArrayList;
import java.util.List;

public class Solution {

    // 주어진 문자열을 지정된 길이로 나누어 리스트에 저장하는 메서드
    private List<String> split(String source, int length) {
        List<String> tokens = new ArrayList<>();
        for (int startIndex = 0; startIndex < source.length(); startIndex += length) {
            int endIndex = startIndex + length;
            // 길이가 남은 경우에는 남은 부분만큼만 잘라서 추가
            if (endIndex > source.length()) endIndex = source.length();
            tokens.add(source.substring(startIndex, endIndex));
        }
        return tokens;
    }

    // 문자열을 압축하고 압축된 문자열의 길이를 반환하는 메서드
    private int compress(String source, int length) {
        StringBuilder builder = new StringBuilder();

        String last = "";
        int count = 0;
        // 문자열을 지정된 길이로 나누어 처리
        for (String token : split(source, length)) {
            if (token.equals(last)) {
                count++;
            } else {
                // 연속된 같은 부분 문자열이 끝나면 압축 정보를 추가
                if (count > 1) builder.append(count);
                builder.append(last);
                // 새로운 부분 문자열로 초기화
                last = token;
                count = 1;
            }
        }
        // 마지막 부분 문자열에 대한 처리
        if (count > 1) builder.append(count);
        builder.append(last);

        // 압축된 문자열의 길이 반환
        return builder.length();
    }

    // 주어진 문자열을 최소 길이로 압축하는 메서드
    public int solution(String s) {
        int min = Integer.MAX_VALUE;
        // 모든 가능한 길이에 대해 가장 짧은 압축된 문자열의 길이를 찾음
        for (int length = 1; length <= s.length(); length++) {
            int compressed = compress(s, length);
            if (compressed < min) {
                min = compressed;
            }
        }
        // 최소 길이 반환
        return min;
    }
}