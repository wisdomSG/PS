class Solution {
    public int[] solution(String myString) {
        String[] answer = myString.split("x");
        int[] result;
        if(myString.charAt(myString.length()-1) == 'x') {
            result = new int[answer.length+1];
        } else {
            result = new int[answer.length];
        }

        for(int i=0; i<answer.length; i++) {
            result[i] = answer[i].length();
        }
        return result;
    }
}