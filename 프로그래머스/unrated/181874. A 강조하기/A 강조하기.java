class Solution {
    public String solution(String myString) {
        StringBuilder result = new StringBuilder();
        
        for(char c: myString.toCharArray()) {
            if(c=='a') {
                result.append('A');
            } else if(c=='A') {
                result.append('A');
            } else {
                result.append(Character.toLowerCase(c));
            }
        }
        return result.toString();
    }
}