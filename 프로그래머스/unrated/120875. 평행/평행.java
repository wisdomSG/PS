class Solution {
    public int solution(int[][] dots) {
        // 두 직선의 기울기를 저장할 변수
        double slope1, slope2;
        
        // 첫 번째 선분과 두 번째 선분을 비교
        slope1 = calculateSlope(dots[0], dots[1]);
        slope2 = calculateSlope(dots[2], dots[3]);
        if (slope1 == slope2) {
            return 1;
        }
        
        // 첫 번째 선분과 세 번째 선분을 비교
        slope1 = calculateSlope(dots[0], dots[2]);
        slope2 = calculateSlope(dots[1], dots[3]);
        if (slope1 == slope2) {
            return 1;
        }
        
        // 첫 번째 선분과 네 번째 선분을 비교
        slope1 = calculateSlope(dots[0], dots[3]);
        slope2 = calculateSlope(dots[1], dots[2]);
        if (slope1 == slope2) {
            return 1;
        }
        
        // 모든 경우에 대해 평행한 선분이 없으면 0을 반환
        return 0;
    }
    
    // 두 점의 기울기를 계산하는 함수
    private double calculateSlope(int[] point1, int[] point2) {
        // 두 점이 같은 경우에는 기울기를 구할 수 없으므로 Double.MAX_VALUE를 반환
        if (point1[0] == point2[0] && point1[1] == point2[1]) {
            return Double.MAX_VALUE;
        }
        // 두 점이 다른 경우에는 기울기를 계산하여 반환
        return (double) (point2[1] - point1[1]) / (point2[0] - point1[0]);
    }
}