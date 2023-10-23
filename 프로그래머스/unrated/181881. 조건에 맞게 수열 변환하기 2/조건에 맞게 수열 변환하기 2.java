import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        while(true) {
            // 1. arr배열 복사하여 currentArr에 저장 
            int[] currentArr = Arrays.copyOf(arr, arr.length); 
            
            // 2. 조건에 맞게 arr 변경 
            for(int i=0; i<arr.length; i++) {
                int k = arr[i];
                if(k>=50 && k%2==0) {
                    arr[i] = k/2;
                } else if(k<50 && k%2==1) {
                    arr[i] = k*2 + 1;
                }
            }
            
            // 3. 변경된 배열과 기존의 배열이 같은지 확인 
            if(Arrays.equals(currentArr, arr)) {
                break;
            } else {
                answer ++;
            }
        }
        return answer;
    }
}