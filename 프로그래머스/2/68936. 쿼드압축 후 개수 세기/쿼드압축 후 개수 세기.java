class Solution {
    public int[] solution(int[][] arr) {
        Count count = count(0, 0, arr.length, arr);
        return new int[] {count.zero, count.one};
    }
    
    // 0과 1의 개수를 저장하는 클래스
    private static class Count {
        public final int zero;
        public final int one;
    
        
        public Count(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }
        
        public Count add(Count other) {
            return new Count(zero + other.zero, one + other.one);
        }
    }
    
    private Count count(int x, int y, int size, int[][] arr) {
        int h = size/2;
        for(int i=x; i<x+size; i++) {
            for(int j=y; j<y+size; j++) {
                if(arr[j][i] != arr[y][x]) {
                    return count(x, y, h, arr)
                        .add(count(x+h, y, h, arr))
                        .add(count(x, y+h, h, arr))
                        .add(count(x+h, y+h, h, arr));
                }
            }
        }
        
        // 만약 모든 원소가 같은 값이라면 해당 값에 따라 Count 객체를 반환
        if(arr[y][x] == 1) {
            return new Count(0,1);
        }
        
        return new Count(1, 0);
    }
    
}