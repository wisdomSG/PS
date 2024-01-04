class Solution {

    // 이진 탐색 활용 - 최소 시간 찾기
    // n: 목표인월, times: 각 심사관의 처리 시간 배열 
    public long solution(int n, int[] times) {
        long start = 0;
        long end = 1000000000000000000L;

        // 이진 탐색
        while (end > start) {
            long mid = (start + end) / 2;

            if (isValid(mid, n, times)) {
                // mid 시간 내에 n 이상의 사람을 처리할 수 있다면 최소 시간을 줄임
                end = mid;
            } else {
                // mid 시간 내에 n 이상의 사람을 처리할 수 없다면 최소 시간을 증가
                start = mid + 1;
            }
        }
        // 최종적으로 찾은 최소 시간을 반환
        return start;
    }
    
    // 주어진 시간(t) 내에 심사관들이 처리할 수 있는 사람 수가 목표 인원(n) 이상인지 확인합니다.
    // t : 현재 시간, n : 목표 인월, times : 각 심사관의 처리 시간 배열
    private boolean isValid(long t, int n, int[] times) {
        long count = 0;
        for (int time : times) {
            // t 시간 동안 각 심사관이 처리할 수 있는 사람 수를 더함
            count += t / time;
        }
        // 전체 처리 가능한 사람 수(count)가 목표 인원(n) 이상이면 true, 그렇지 않으면 false 반환
        return count >= n;
    }
}
