import java.util.stream.IntStream;

class Solution {
    private static final int[][] RULES = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
    
    public int[] solution(int[] answers) {
        int[] corrects = new int[3];
        int max = 0;
        
        for(int problem = 0; problem < answers.length; problem++) {
            int answer = answers[problem];
            
            for(int person=0; person<3; person++) {
                int index = problem % RULES[person].length;
                int picked = RULES[person][index];
                if(picked==answer && ++corrects[person]>max) {
                    max = corrects[person];
                }
            }
        }
        final int maxCorrects = max; 
        return IntStream.range(0, 3)
                .filter(i -> corrects[i] == maxCorrects)
                .map(i -> i + 1)
                .toArray();
        
    }
}