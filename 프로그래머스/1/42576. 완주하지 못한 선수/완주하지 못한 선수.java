import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (int i = 0; i < completion.length; i++) {
            String p = participant[i];
            String c = completion[i];
            if (!p.equals(c)) {
                return participant[i];
            }
        }

        return participant[completion.length];
    }
}
