class Solution {
    public int[] solution(long n) {
        StringBuilder str = new StringBuilder();
        str.append(n);
        str.reverse();
        String result = str.toString();
        
        int[] resultArray = new int[result.length()];

        for (int i = 0; i < result.length(); i++) {
            resultArray[i] = Character.getNumericValue(result.charAt(i));
        }
        return resultArray;
    }
}
