class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int diff1 = common[1] - common[0]; // 등차 또는 등비를 계산하기 위한 차이값
        int diff2 = common[2] - common[1];    
        
        if(diff1 == diff2) {
            answer = common[common.length - 1] + diff1;
        } else if (common[1] % common[0] == 0) { // 첫 번째 원소로 두 번째 원소를 나누었을 때 나머지가 0인 경우
            int ratio = common[1] / common[0]; // 등비 계산
            answer = common[common.length - 1] * ratio; // 등비를 곱하여 다음 숫자를 구함
        } 

        return answer;
    }
}
