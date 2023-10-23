class Solution {
    public int solution(String myString, String pat) {

        String mainStrng = myString.toLowerCase();
        String subString = pat.toLowerCase();
        if(mainStrng.contains(subString)) {
            return 1;
        } else {
            return 0;
        }
    }
}