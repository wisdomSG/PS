class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder answer = new StringBuilder();
        
        for(char c: my_string.toLowerCase().toCharArray()) {
            if(c== alp.charAt(0)) {
                answer.append(Character.toUpperCase(c));
            } else {
                answer.append(c);
            }
        }
        return answer.toString();
    }
}