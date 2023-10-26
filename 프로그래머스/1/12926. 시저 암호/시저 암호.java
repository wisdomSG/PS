class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(" ");
            } else {
                char encryptedChar;
                if (Character.isUpperCase(c)) {
                    encryptedChar = (char) ((c - 'A' + n) % 26 + 'A');
                } else {
                    encryptedChar = (char) ((c - 'a' + n) % 26 + 'a');
                }
                answer.append(encryptedChar);
            }
        }
        return answer.toString();
    }
}
