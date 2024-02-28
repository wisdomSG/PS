import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        Map<String, Integer> mapX = new TreeMap<>();
        Map<String, Integer> mapY = new TreeMap<>();
        StringBuilder answer =  new StringBuilder();

        for(String key: X.split("")) {
            mapX.put(key, mapX.getOrDefault(key, 0)+1);
        }
        
        for(String key: Y.split("")) {
            mapY.put(key, mapY.getOrDefault(key, 0)+1);
        }
        
        
        for(String key: mapX.keySet()) {
            if(!mapY.containsKey(key)) continue;
            
            int min = Math.min(mapX.get(key), mapY.get(key));
            answer.append(key.repeat(min));
        }
        
        // answer가 빈 문자열("")이면 X와 Y에 공통으로 있는 문자가 없다는 뜻이므로 -1을 반환
        if (answer.length() == 0) {
            return "-1";
        }

        // answer가 "0"만 있는 경우 "0"을 한 번만 포함하도록 수정
        if (answer.toString().equals("0".repeat(answer.length()))) {
            return "0";
        }
        
        return answer.reverse().toString();
    }
}