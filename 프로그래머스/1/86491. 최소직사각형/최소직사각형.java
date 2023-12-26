class Solution {
    public int solution(int[][] sizes) {
        int[] width = new int[sizes.length];
        int[] height = new int[sizes.length];
        
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] >= sizes[i][1]) {
                width[i] = sizes[i][0];
                height[i] = sizes[i][1];
            } else {
                width[i] = sizes[i][1];
                height[i] = sizes[i][0];
            }    
        }
        
        int widthMax = findMax(width);
        int heightMax = findMax(height);
        int answer = widthMax * heightMax;
        
        return answer;
    }

    private int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("배열이 비어 있습니다.");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
