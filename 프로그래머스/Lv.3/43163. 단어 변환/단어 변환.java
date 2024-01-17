import java.util.LinkedList;
import java.util.Queue;

public class Solution {
   
    private static class State {
        public final String word;  // 현재 단어
        public final int step;     // 이 상태에 도달하기까지의 단계 수

        private State(String word, int step) {
            this.word = word;
            this.step = step;
        }
    }

    // 두 단어가 단 하나의 문자만 다르게끔 변환될 수 있는지 확인하는 메서드
    private boolean isConvertible(String src, String dst) {
        char[] srcArr = src.toCharArray();
        char[] dstArr = dst.toCharArray();

        int diff = 0;
        for (int i = 0; i < srcArr.length; i++) {
            if (srcArr[i] != dstArr[i]) diff++;
        }
        return diff == 1;
    }

    // 주어진 단어 목록을 사용하여 시작 단어에서 목표 단어까지의 최단 변환 순서를 찾는 메서드
    public int solution(String begin, String target, String[] words) {
        // 방문한 단어 여부 확인 배열 
        boolean[] isVisited = new boolean[words.length];

        // 최단 변환 순서를 찾기 위해 너비 우선 탐색을 수행하기 위한 큐를 생성
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(begin, 0));  // 초기 상태를 단계 0으로 큐에 추가합니다.

        while (!queue.isEmpty()) {
            State state = queue.poll();  // 큐에서 가장 앞에 있는 상태를 꺼냅니다.

            if (state.word.equals(target)) {
                return state.step;  // 목표 단어에 도달했다면 단계 수를 반환합니다.
            }

            for (int i = 0; i < words.length; i++) {
                String next = words[i];

                // 현재 단어에서 다음 단어로 변환 가능한지 확인합니다.
                if (!isConvertible(state.word, next)) {
                    continue;
                }

                // 다음 단어가 이미 방문되었는지 확인합니다.
                if (isVisited[i]) {
                    continue;
                }

                // 다음 단어를 방문되었다고 표시합니다.
                isVisited[i] = true;

                // 단계 수를 증가시켜 다음 상태를 큐에 추가합니다.
                queue.add(new State(next, state.step + 1));
            }
        }

        return 0;  // 변환할 수 없는 경우 0을 반환 
    }
}
