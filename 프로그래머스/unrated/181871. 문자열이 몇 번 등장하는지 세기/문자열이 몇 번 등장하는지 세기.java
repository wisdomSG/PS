class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int len = myString.length() - pat.length() + 1;
        
        for(int i=0; i<len; i++) {
            String sliceStr = myString.substring(i,i+pat.length());
            answer += (sliceStr.equals(pat)) ? 1 : 0;
        }
        return answer;
    }
}