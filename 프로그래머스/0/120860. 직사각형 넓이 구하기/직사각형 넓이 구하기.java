class Solution {
    public int solution(int[][] dots) {
        int weight = 0;
        int height = 0;
        int current1 = dots[0][0];
        int current2 = dots[0][1];
        for(int i=1; i<4; i++) {
            if(dots[i][0] != current1 && dots[i][1] != current2) {
                weight = Math.abs(current1 - dots[i][0]);
                height = Math.abs(current2 - dots[i][1]);
            }
        }
        return weight * height;
    }
}