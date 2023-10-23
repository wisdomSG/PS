class Solution {
    public int solution(String myString, String pat) {

        String mainStrng = myString.toLowerCase(); // 소문자로 변경 : toLowerCase()
        String subString = pat.toLowerCase();
        if(mainStrng.contains(subString)) { // 문자열 포함 확인: contains()
            return 1;
        } else {
            return 0;
        }
    }
}