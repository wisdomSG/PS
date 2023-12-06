class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        int first = arr[0];
        int min = arr[0];
        int q = 0;
        int cnt = 1;
        int cnt2 = 1;
        for (int i =1; i< arr.length; i++) {
            if (arr[i] ==first) {
                cnt ++;
            } else {
                if(q == arr[i]) {
                    cnt2 ++;
                } 
                q = arr[i];   
            }
        }
        

        
        for (int j: arr) {
            if(j<min) {
                min = j;
            }
        }
        if (cnt == 4) {
            return 1111*first;
        } else if (cnt == 3) {
            return (10*first + q)*(10*first + q);
        } else if (cnt2 == 3) {
            return (10*q + first)*(10*q + first);
        } else if (cnt ==2 && cnt2 ==2) {
            return (first+q)*Math.abs(first-q);
        } else if (a == b) {
            return c * d;
        } else if (a == c) {
            return b * d;
        } else if (a == d) {
            return b * c;
        } else if (b == c) {
            return a * d;
        } else if (b == d) {
            return a * c;
        } else if (c == d) {
            return a * b;
        } else {
            return min;
        }

    }
}