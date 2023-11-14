import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // 1. 중복 제거를 위해 HashSet 생성
        HashSet<Integer> hashSet = new HashSet<>();

        // 1-1. 배열을 HashSet으로 변환
        for (int num : nums) {
            hashSet.add(num);
        }
        
        // 2. 중복을 제거한 배열의 길이
        int hashCnt = hashSet.size();
        
        // 3. 배열의 길이의 반과 중복을 제거한 배열의 길이 중 작은 값을 선택
        answer = Math.min(nums.length / 2, hashCnt);
        
        return answer;
    }
}
