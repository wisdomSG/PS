import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x"))
                     .filter(str -> !str.isEmpty()) // 빈 문자열 제거
                     .sorted()
                     .toArray(String[]::new);
    }
}
