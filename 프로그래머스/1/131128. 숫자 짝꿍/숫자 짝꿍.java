import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        // X, Y에서 각 문자의 등장 횟수를 저장할 TreeMap 생성
        Map<String, Integer> mapX = countCharacters(X);
        Map<String, Integer> mapY = countCharacters(Y);
        
        // X와 Y에서 공통으로 등장하는 문자를 찾아서 가장 작은 횟수만큼 answer에 추가
        StringBuilder answer = new StringBuilder();
        for(String key: mapX.keySet()) {
            if(mapY.containsKey(key)) {
                int min = Math.min(mapX.get(key), mapY.get(key));
                answer.append(key.repeat(min));
            }
        }
        
        // answer가 빈 문자열("")이면 X와 Y에 공통으로 있는 문자가 없다는 뜻이므로 -1을 반환
        if (answer.length() == 0) {
            return "-1";
        }

        // answer가 "0"만 있는 경우 "0"을 한 번만 포함하도록 수정
        if (answer.toString().equals("0".repeat(answer.length()))) {
            return "0";
        }
        
        // 결과를 뒤집어서 반환
        return answer.reverse().toString();
    }
    
    // 문자열에서 각 문자의 등장 횟수를 TreeMap으로 반환하는 메서드
    private Map<String, Integer> countCharacters(String str) {
        Map<String, Integer> map = new TreeMap<>();
        for(String key: str.split("")) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return map;
    }
}
