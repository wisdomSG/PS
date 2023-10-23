class Solution {
    public int solution(int[] num_list) {
        int length = num_list.length; // 배열의 길이는 .length
        int answer;
        if(length>=11) {
            answer =0;
            for(int i: num_list) {
                
                answer += i;
            }
        } else {
            answer = 1;
            for(int i: num_list) {
                answer *= i;
            }
        }
        return answer;
    }
}