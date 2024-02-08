class Solution {
    public int solution(String A, String B) {
        int last = A.length();
        
        if(A.equals(B)) return 0;
        
        for(int i=1; i<last; i++) {
            String left = A.substring(last-i, last) + A.substring(0, last-i);
            if(left.equals(B)) {
                return i;
            }
        }
        
        return -1;
    }
}