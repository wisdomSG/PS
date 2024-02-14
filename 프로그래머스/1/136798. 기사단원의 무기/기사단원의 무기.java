class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<number+1; i++) {
            if(countDivisors(i)>limit) {
                answer+= power;
            } else answer += countDivisors(i);
        }
        return answer;
    }
    
    private int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // 약수가 발견되면 count를 2씩 증가시킵니다.
                // 예를 들어, i가 1이면 n을 나누면 몫도 약수이므로 2개가 됩니다.
                if (i * i == n) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}