class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int k = 0;
        if(a>b) {
            k = gdc(a,b);
        } else {
            k = gdc(b, a);
        }
        int num = b / k;
        while(num > 1) {
            if(num %2 ==0) {
                num = num / 2;
            } else if (num %5 == 0) {
                num = num / 5;
            } else {
                return 2;
            }
        }
        return 1;
    }
    
    private int gdc(int a, int b) {
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}