import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        return Math.toIntExact(Arrays.stream(array)
            .filter(arr -> arr > height)
            .count());
    }
}
