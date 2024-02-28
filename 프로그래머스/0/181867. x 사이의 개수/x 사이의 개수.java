class Solution {
    public int[] solution(String myString) {
        String[] answer = myString.split("x", -1); // 빈 문자열도 유지하기 위해 두 번째 인자에 -1 사용
        int[] result = new int[answer.length];
        
        for (int i = 0; i < answer.length; i++) {
            result[i] = answer[i].length();
        }
        
        return result;
    }
}
