class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[][] arr = {{"one", "1"}, {"two", "2"}, {"three", "3"}, {"four", "4"}, {"five", "5"}, {"six", "6"}, {"seven", "7"}, {"eight", "8"},
                          {"nine", "9"}, {"zero", "0"}};
        for(int i=0; i<arr.length; i++) {
            numbers = numbers.replaceAll(arr[i][0], arr[i][1]);
        }
        
        if(numbers.startsWith("0")) {
            numbers = numbers.substring(1);
        }
        
        return Long.parseLong(numbers);
    }
}