class Solution {
    public String solution(String myString, String pat) {
        StringBuilder answer = new StringBuilder();
        int lastIndex = myString.lastIndexOf(pat);
        for(int i=0; i<lastIndex+pat.length(); i++) {
            answer.append(myString.charAt(i));
        }
        return answer.toString();
    }
}