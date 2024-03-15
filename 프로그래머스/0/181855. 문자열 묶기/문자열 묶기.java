import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] strArr) {
        // 길이가 같은 문자열들끼리 그룹의 개수를 카운트하기 위한 HashMap 선언
        Map<Integer, Integer> groupCounts = new HashMap<>();
        // 최종 결과를 저장할 변수 초기화
        int result = 0;
        
        for(String str: strArr) {
            // 현재 문자열의 길이 계산
            int length = str.length();
            // 현재 길이의 그룹 개수를 HashMap에 업데이트
            groupCounts.put(length, groupCounts.getOrDefault(length, 0) + 1);
        }
        
        // HashMap에 저장된 그룹 크기 중 가장 큰 값을 찾음
        for(int max : groupCounts.values()) {
            // 현재까지의 최대 그룹 크기와 현재 그룹의 크기 중 큰 값을 최대 그룹 크기로 설정
            result = Math.max(result, max);
        }
        
        // 가장 큰 그룹의 크기 반환
        return result;
    }
}
