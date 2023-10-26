class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean toUpper = true;
        
        for(char c : s.toCharArray()) {
            if(!Character.isAlphabetic(c)) {
                answer.append(c);
                toUpper = true;
            } else {
                if(toUpper) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                toUpper = !toUpper;
            }
        }
        
        return answer.toString();
    }
}