class Solution {
    public int solution(String[][] board, int h, int w) {
        int[] x = {-1, 1, 0, 0}; //down, up, right, left;
        int[] y = {0, 0, 1, -1};
        
        int answer = 0;
        
        for(int i=0; i<4; i++) {
            int moveX = h + x[i];
            int moveY = w + y[i];
            
            if(moveX>=0 && moveX<board.length && moveY>=0 && moveY<board.length) {
                if(board[h][w].equals(board[moveX][moveY])){
                    answer++;
                }
            }
            
        }
        
        return answer;
    }
}