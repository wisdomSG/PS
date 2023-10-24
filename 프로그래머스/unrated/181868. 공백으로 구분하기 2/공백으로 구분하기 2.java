import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");

        return Arrays.stream(answer)
                .filter(str -> !str.isEmpty())
                .toArray(String[]::new);
    }
} 