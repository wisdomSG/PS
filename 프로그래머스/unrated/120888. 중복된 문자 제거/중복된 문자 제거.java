class Solution {
    public String solution(String my_string) {
        String result = "";
        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            if (result.indexOf(currentChar) == -1) {
                result += currentChar;
            }
        }
        return result;
    }
}
