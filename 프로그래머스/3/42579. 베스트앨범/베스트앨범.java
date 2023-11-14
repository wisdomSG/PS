import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> answer = new ArrayList<>();

        // 장르별 총 재생 횟수 계산
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        // 값이 큰 순서대로 정렬된 엔트리의 장르를 배열에 저장
        String[] sortedGenres = map.entrySet()
                                   .stream()
                                   .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                                   .map(Map.Entry::getKey)
                                   .toArray(String[]::new);

        for (int i = 0; i < sortedGenres.length; i++) {
            int max1 = 0; // 제일 큰값
            int max2 = 0; // 2번째로 큰값
            int maxIndex1 = -1;
            int maxIndex2 = -1;
            for (int j = 0; j < genres.length; j++) {
                if (sortedGenres[i].equals(genres[j])) {
                    if (plays[j] > max1) {
                        max2 = max1;
                        maxIndex2 = maxIndex1;
                        max1 = plays[j];
                        maxIndex1 = j;
                    } else if (plays[j] > max2) {
                        max2 = plays[j];
                        maxIndex2 = j;
                    }
                }
            }
            answer.add(maxIndex1);
            if (maxIndex2 != -1) {
                answer.add(maxIndex2);
            }
        }

        // List<Integer>를 int[] 배열로 변환
        int[] array = answer.stream().mapToInt(Integer::intValue).toArray();

        return array;
    }
}
