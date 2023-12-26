import java.util.*;
import java.util.stream.Collectors;

class Solution {
        
    public int solution(String numbers) {
        Set<Integer> primes = new HashSet<>(); // 소수를 저장하기 위한 Set
        List<Integer> nums = numbers.chars() // 입력된 숫자 문자열을 각 자릿수를 분리하여 리스트에 저장
            .map(c -> c - '0') // char를 int로 변환
            .boxed() // int를 Integer로 변환
            .collect(Collectors.toList()); // 리스트로 수집
        getPrimes(0, nums, primes); // 소수를 찾는 재귀 함수 호출
        return primes.size(); // 찾은 소수의 개수 반환
    }
    
    // 재귀적으로 숫자를 조합하여 소수를 찾는 함수
    private void getPrimes(int acc, List<Integer> numbers, Set<Integer> primes) {
        if(isPrime(acc)) primes.add(acc); // 현재 조합된 숫자가 소수인 경우 Set에 추가
        for(int i = 0; i < numbers.size(); i++) {
            int nextAcc = acc * 10 + numbers.get(i); // 다음 자릿수를 현재 숫자에 추가
            List<Integer> nextNumbers = new ArrayList<>(numbers); // 리스트 복사
            nextNumbers.remove(i); // 다음 자릿수를 추가한 숫자를 제외하고 리스트 유지
            getPrimes(nextAcc, nextNumbers, primes); // 재귀 호출
        }
    }
    
    // 소수를 판별하는 함수
    public boolean isPrime(int num){
        if(num <= 1) return false; // 1 이하의 숫자는 소수가 아님
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0) return false; // 2부터 num의 제곱근까지 나눠지는 수가 있으면 소수가 아님
        }
        return true; // 나눠지는 수가 없으면 소수임
    }
}
