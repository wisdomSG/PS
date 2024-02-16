import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] award = new int[k];
        int min = 2000;
        
        // 초기에 가장 낮은 k개의 점수를 award 배열에 복사합니다.
        int changeK = Math.min(k, score.length);
        for (int i = 0; i < changeK; i++) {
            award[i] = score[i];
            min = Math.min(min, award[i]);
            answer[i] = min;
        }
        
        Arrays.sort(award); // 가장 낮은 k개의 점수를 정렬합니다.
        if(k<score.length) {
           // k번째 점수까지는 이미 정해져 있으므로 k+1번째 점수부터 처리합니다.
            for (int i = k; i < score.length; i++) {
                // 새로운 점수를 추가합니다.
                if(award[0]<score[i]) {
                    award[0] = score[i];
                }
                Arrays.sort(award); // 새로운 점수를 추가하고 다시 정렬합니다.
                answer[i] = award[0]; // 명예의 전당에서 최하위 점수를 선택합니다.
            } 
        }
        return answer;
    }
}
