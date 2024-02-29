class Solution {
    public int solution(String myString, String pat) {
        String str = "";
        
        for(char c: myString.toCharArray()) {
            if(c == 'A') str += "B";
            else str += "A";
        }

        return (str.contains(pat) ? 1 : 0 );
    }
}