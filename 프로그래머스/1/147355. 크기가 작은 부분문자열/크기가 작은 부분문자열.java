class Solution {
    public int solution(String t, String p) {
        int end = t.length() - p.length();
        int answer = 0;
        long longP = Long.parseLong(p);
        for(int i=0; i<=end; i++) {
            Long compare = Long.parseLong(t.substring(i, i+p.length()));
            if(compare <= longP) {
                answer ++;
            }
        }
        return answer;
    }
}