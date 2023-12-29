import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        // 람다 표현식을 사용
        // s.substring(n, n + 1) -> 각 문자열 s에서 인덱스 n부터 n + 1까지의 부분 문자열을 추출. 이 부분 문자열을 기준으로 정렬
        Arrays.sort(strings, Comparator.comparing((s) -> s.substring(n, n + 1)));
        return strings;
    }
}