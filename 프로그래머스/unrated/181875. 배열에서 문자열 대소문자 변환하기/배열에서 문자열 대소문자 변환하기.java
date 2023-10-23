class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i=0; i<strArr.length; i++) {
            String str = strArr[i];
            if(i%2==0) {
                answer[i] = str.toLowerCase();
            } else { // 홀수는 대문자
                answer[i] = str.toUpperCase();
            }
        }
        return answer;
    }
}