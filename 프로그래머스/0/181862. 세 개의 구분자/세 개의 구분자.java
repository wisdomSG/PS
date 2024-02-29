import java.util.regex.Pattern;
import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] result = Arrays.stream(myStr.split("[abc]"))
                                .filter(str -> !str.isEmpty())
                                .toArray(String[]::new);
        
        if(result.length == 0) {
            return new String[]{"EMPTY"};
        } else {
            return result; 
        }
    }
}
