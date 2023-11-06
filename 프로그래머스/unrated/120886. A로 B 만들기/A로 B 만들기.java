class Solution {
    public int solution(String before, String after) {
        char[] beforeArr = before.toCharArray(); 
        for(char c: after.toCharArray()) {
            int index = before.indexOf(c);
            if(index == -1) {
                return 0;
            } else {
                StringBuilder beforeBuilder = new StringBuilder(before);
                before = beforeBuilder.deleteCharAt(index).toString();
            }
        }
        return 1;
    }
}