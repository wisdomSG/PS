import java.util.*;


class Solution {
    public String[] solution(String[] strArr) {
        List<String> answer = new ArrayList();
        for(String str: strArr) {
            if(!str.contains("ad")) {
                answer.add(str);
            } 
        }
        
        // stream() 이용 : list -> Stringp[]
        return answer.stream().toArray(String[]::new);
    }
}