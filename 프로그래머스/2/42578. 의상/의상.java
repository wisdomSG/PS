import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String kind = clothes[i][1];
            map.put(kind, map.getOrDefault(kind, 0) + 1);
        }
        

        for (Integer value : map.values()) {
            answer *= (value + 1);
            
        }
        // 공식 : (의상 수 + 1) * (의상 수 + 1) * (의상 수 + 1)  - 1 : +1은 의상을 입지않는 경우의수를 생각, -1은 다벗은 경우를 빼줌 
        return answer -1;
    }
}