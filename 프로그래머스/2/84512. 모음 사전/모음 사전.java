import java.util.ArrayList;
import java.util.List;

class Solution {
    // "AEIOU"를 담은 상수 문자 배열
    private static final char[] CHARS = "AEIOU".toCharArray();
    
    // 단어를 생성하는 재귀 메서드
    private void generate(String word, List<String> words) {
        // 현재 단어를 리스트에 추가
        words.add(word);
        
        // 단어가 다섯 글자가 되면 종료
        if (word.length() == 5) return;
        
        // "AEIOU" 각 문자를 추가하여 재귀 호출
        for (char c : CHARS) {
            generate(word + c, words);
        }
    }
    
    // 주어진 단어의 인덱스를 찾아 반환하는 메서드
    public int solution(String word) {
        // 생성된 모든 단어를 담을 리스트
        List<String> words = new ArrayList<>();
        
        // 단어 생성 메서드 호출
        generate("", words);
        
        // 주어진 단어의 인덱스 반환
        return words.indexOf(word);
    }
}