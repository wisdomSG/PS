public class Solution {
    public int solution(int n) {
        String reversedScale = toReversedTernary(n); // 3진법으로 변경 
        return toDecimal(reversedScale); // 3진법의 수를 10진법으로 변경 
    }

    // 10진법 -> 3진법으로 변경해주는 메서드 (+ 뒤집기)
    private String toReversedTernary(int n) {
        StringBuilder scale = new StringBuilder();
        while (true) {
            if (n < 3) {
                scale.append(n);
                break;
            }
            int remainder = n % 3;
            n = n / 3;
            scale.append(remainder);

        }
        return scale.reverse().toString(); // 읽을 때 반대로 읽어야하기 때문에 reverse 사용 
    }

    // 3진법 -> 10진법으로 변경해주는 메서드
    private int toDecimal(String reversedTernary) { 
        int answer = 0;
        for (int i = 0; i < reversedTernary.length(); i++) {
            int digit = Character.getNumericValue(reversedTernary.charAt(i));
            answer += digit * Math.pow(3, i);
        }
        return answer;
    }
}
