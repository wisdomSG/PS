import java.util.*;

class Solution {
    int h;
    int w;
    int[] answer = new int[]{0,0};
    List<List<Integer>> errorList = new ArrayList<>();

    public int[] solution(String[] park, String[] routes) {
        h = park.length;
        w = park[0].length();

        for (int i = 0; i < h; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int j = 0; j < w; j++) {
                rowList.add(park[i].charAt(j) == 'X' ? 1 : 0);
                if (park[i].charAt(j) == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
            errorList.add(rowList);
        }

        for(String s: routes) {
            String[] parts = s.split(" ");
            String direction = parts[0];
            int num = Integer.parseInt(parts[1]);
            switch (direction) {
                case "E":
                    checkAndUpdate(0, num);
                    break;
                case "W":
                    checkAndUpdate(1, num);
                    break;
                case "S":
                    checkAndUpdate(2, num);
                    break;
                case "N":
                    checkAndUpdate(3, num);
                    break;
            }
        }
        return answer;
    }
    
    private void checkAndUpdate(int direction, int num) {
        switch (direction) {
            case 0: // E
                if (answer[1] + num < w) {
                    for(int i=0; i<=num; i++) {
                        if(errorList.get(answer[0]).get(answer[1] + i) == 1) {
                            return;
                        }
                    }
                    answer[1] += num;
                }
                break;
            case 1: // W
                if (answer[1] - num >= 0 && errorList.get(answer[0]).get(answer[1] - num) == 0) {
                    for(int i=0; i<=num; i++) {
                        if(errorList.get(answer[0]).get(answer[1] - i) == 1) {
                            return;
                        }
                    }
                    answer[1] -= num;
                }
                break;
            case 2: // S
                if (answer[0] + num < h) {
                    for(int i=0; i<=num; i++) {
                        if(errorList.get(answer[0]+i).get(answer[1]) == 1) {
                            return;
                        }
                    }
                    answer[0] += num;
                }
                break;
            case 3: // N
                if (answer[0] - num >= 0 && errorList.get(answer[0] - num).get(answer[1]) == 0) {
                    for(int i=0; i<=num; i++) {
                        if(errorList.get(answer[0]-i).get(answer[1]) == 1) {
                            return;
                        }
                    }
                    answer[0] -= num;
                }
                break;
        }
    }
}
