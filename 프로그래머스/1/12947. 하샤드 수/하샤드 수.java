class Solution {
    public boolean solution(int x) {
        String answer = String.valueOf(x);
        int k = 0;
        for(char c: answer.toCharArray()) {
            k += Character.getNumericValue(c);
        }
        if(x % k ==0) return true;
        return false;
    }
}