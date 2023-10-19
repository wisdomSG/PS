class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int x = arr1.length;
        int y = arr2[0].length;
        
        int[][] answer = new int[x][y];
        
        for(int i=0; i<x; i++) {
            for(int j=0; j<y; j++) {
                int result = 0;
                for(int k=0; k<arr1[0].length; k++) {
                    result += arr1[i][k]*arr2[k][j];
                }
                answer[i][j] = result;
            }
        }
        
        return answer;
    }
}