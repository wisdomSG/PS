class Solution {
    public int solution(String[] spell, String[] dic) {
        for (int i = 0; i < spell.length; i++) {
            for (int j = 0; j < dic.length; j++) {
                dic[j] = dic[j].replaceFirst(spell[i], "1");
            }
        }

        int len = spell.length;
        int count = 0;

        for (String word : dic) {
            for (char text : word.toCharArray()) {
                if (text == '1') {
                    count++;
                }
            }
            if (count == len) {
                return 1;
            }
            count = 0; // 다음 단어를 위해 count를 리셋
        }

        return 2;
    }
}
