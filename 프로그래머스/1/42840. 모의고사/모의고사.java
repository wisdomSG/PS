import java.util.stream.IntStream;

class Solution {
    private static final int[][] RULES = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
    
    public int[] solution(int[] answers) {
        // 수포자들의 찍기 규칙 배열
        // RULES[0]: 1번 수포자, RULES[1]: 2번 수포자, RULES[2]: 3번 수포자

        int[] corrects = new int[3]; // 각 수포자의 정답 개수를 저장하는 배열
        int max = 0; // 가장 많이 맞힌 정답 개수

        // 문제당 정답 체크
        for (int problem = 0; problem < answers.length; problem++) {
            int answer = answers[problem];

            // 각 수포자의 찍기 규칙에 따라 정답을 비교하고 정답 개수 업데이트
            for (int person = 0; person < 3; person++) {
                int index = problem % RULES[person].length; // 현재 문제에 대한 찍기 인덱스
                int picked = RULES[person][index]; // 현재 수포자가 찍은 정답
                if (picked == answer && ++corrects[person] > max) {
                    max = corrects[person]; // 가장 많이 맞힌 정답 개수 업데이트
                }
            }
        }
        final int maxCorrects = max; // 람다식에서 사용하기 위해 max를 final 변수로 저장
        
        // 최대 정답 개수를 가진 수포자들의 번호를 반환
        return IntStream.range(0, 3)
                .filter(i -> corrects[i] == maxCorrects)
                .map(i -> i + 1) // 인덱스(0-based)를 번호(1-based)로 변환
                .toArray();
    }
}