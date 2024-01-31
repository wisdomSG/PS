class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int horizontalLine = board[0]/2;
        int heightLine = board[1]/2;
        int horizontal = 0;
        int height = 0;
        for(int i=0; i<keyinput.length; i++) {
            switch(keyinput[i]) {
                case "left":
                    horizontal -= 1;
                    break;
                case "right":
                    horizontal += 1;
                    break;
                case "down":
                    height -= 1;
                    break;
                case "up":
                    height += 1;
                    break;
            }
            
            // num1과 horizontalLine의 절댓값을 비교해서 num1이 크다면
            if (Math.abs(horizontal) > Math.abs(horizontalLine)) {
                // 추가 처리: horizontal을 가로 경계에 맞게 조정
                horizontal = (horizontal > 0) ? horizontalLine : -horizontalLine;
            } 
            
            if (Math.abs(height) > Math.abs(heightLine)) {
                // 추가 처리: horizontal을 가로 경계에 맞게 조정
                height = (height > 0) ? heightLine : -heightLine;
            } 
            
            
        }
        
        int[] location = {horizontal, height};
        return location;
    }
}