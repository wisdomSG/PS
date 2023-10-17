class Solution {
    public int[] solution(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int k = arr[i];
            if(k>=50 && k%2==0) {
                arr[i] = k/2;
            } else if(k<50 && k%2==1) {
                arr[i] = k*2;
            }
        }
        return arr;
    }
}