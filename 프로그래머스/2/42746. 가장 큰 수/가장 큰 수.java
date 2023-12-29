import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public String solution(int[] numbers) {
        // 1. int 배열을 String으로 변환하여 Stream 생성
        // 2. 두 숫자를 합쳐서 비교하여 정렬
        // 3. 정렬된 문자열을 이어붙여 최종 결과 생성
        // 4. 결과 문자열의 시작이 0인 경우 0으로 치환
        return Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((s1, s2) -> {
                    int original = Integer.parseInt(s1 + s2);
                    int reversed = Integer.parseInt(s2 + s1);
                    return reversed - original;
                })
                .collect(Collectors.joining(""))
                .replaceAll("^0+", "0");
    }
}