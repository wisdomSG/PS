class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[size(arr)];
        int idx = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i]; j++) {
                answer[idx] = arr[i];
                idx ++;
            }
        }
        return answer;
    }
    
    private int size(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    } 
}