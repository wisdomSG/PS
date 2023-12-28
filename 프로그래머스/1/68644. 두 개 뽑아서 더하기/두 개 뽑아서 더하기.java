import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // 주어진 배열에서 두 수의 합을 모두 구하고 중복을 제거한 결과를 반환하는 메서드

        // 중복을 제거하기 위해 Set 사용
        Set<Integer> answer = new LinkedHashSet<>();

        // 배열을 순회
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                // Set(중복허용X)에 두 수의 합 저장
                answer.add(numbers[i] + numbers[j]);
            }
        }

        // Set을 정렬하고 배열로 변환하여 반환
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}