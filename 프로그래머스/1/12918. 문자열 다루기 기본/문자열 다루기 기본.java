class Solution {
    public boolean solution(String s) {
        for(char c: s.toCharArray()) {
            if(Character.isAlphabetic(c)) {
                return false;
            }
        }
        
        if(s.length() == 4 || s.length() == 6) {
            return true;
        }
        return false;
    }
}