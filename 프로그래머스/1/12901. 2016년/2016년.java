class Solution {
    public String solution(int a, int b) {
        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"THU","FRI","SAT","SUN","MON","TUE","WED"};        
        int days = b;
        for(int i=1; i<a; i++) {
            days += month[i];
        }
        
        return week[days%7];
    }
}