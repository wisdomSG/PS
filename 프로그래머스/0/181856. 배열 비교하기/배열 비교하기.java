import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int arrLength1 = arr1.length;
        int arrLength2 = arr2.length;

        int lengthComparison = Integer.compare(arrLength1, arrLength2);
        if (lengthComparison != 0) {
            return lengthComparison;
        }

        int sum1 = Arrays.stream(arr1).sum();
        int sum2 = Arrays.stream(arr2).sum();

        return Integer.compare(sum1, sum2);
    }
}
