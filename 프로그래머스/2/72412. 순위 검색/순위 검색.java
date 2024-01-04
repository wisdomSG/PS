import java.util.*;
import java.util.function.Consumer;

public class Solution {
    // 모든 key 조합을 생성하여 action을 수행
    private void generateKeyCombinations(int index, StringBuilder prefix, String[] tokens,
                                         Consumer<String> action) {
        if (index == tokens.length - 1) {
            action.accept(prefix.toString());
            return;
        }

        // 현재 토큰을 추가한 경우
        generateKeyCombinations(index + 1, prefix.append(tokens[index]), tokens, action);
        prefix.setLength(prefix.length() - tokens[index].length());

        // '-'를 추가한 경우
        generateKeyCombinations(index + 1, prefix.append("-"), tokens, action);
        prefix.setLength(prefix.length() - 1);
    }

    // info 배열에서 모든 key의 조합과 해당 key에 대한 점수 리스트를 생성
    private Map<String, List<Integer>> generateScoresMap(String[] info) {
        Map<String, List<Integer>> scoresMap = new HashMap<>();

        for (String s : info) {
            String[] tokens = s.split(" ");
            int score = Integer.parseInt(tokens[tokens.length - 1]);
            generateKeyCombinations(0, new StringBuilder(), tokens, key -> {
                scoresMap.putIfAbsent(key, new ArrayList<>());
                scoresMap.get(key).add(score);
            });
        }

        // 각 점수 리스트를 정렬
        scoresMap.values().forEach(Collections::sort);

        return scoresMap;
    }

    // 이진 탐색을 사용하여 score 이상의 점수 개수를 계산
    private int countScoresGE(int score, List<Integer> scores) {
        int start = 0;
        int end = scores.size() - 1;

        while (end > start) {
            int mid = (start + end) / 2;

            if (scores.get(mid) >= score) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        // scores[start]이 score보다 큰 경우 start까지의 개수 반환
        if (scores.get(start) < score) {
            return scores.size();
        }
        return start;
    }

    // query에 대해 일치하는 점수 개수를 계산
    private int countMatchingScores(String query, Map<String, List<Integer>> scoresMap) {
        String[] queryTokens = query.split(" (and )?");
        StringBuilder key = new StringBuilder();

        // 마지막 토큰을 제외한 나머지 토큰들을 key로 합침
        for (int i = 0; i < queryTokens.length - 1; i++) {
            key.append(queryTokens[i]);
        }

        // scoresMap에 key가 없으면 0 반환
        if (!scoresMap.containsKey(key.toString())) return 0;
        List<Integer> scores = scoresMap.get(key.toString());

        // 마지막 토큰을 기준으로 점수를 가져와서 countScoresGE 메서드 호출
        int score = Integer.parseInt(queryTokens[queryTokens.length - 1]);

        return scores.size() - countScoresGE(score, scores);
    }

    // 주어진 info와 query에 대해 점수를 계산하여 반환
    public int[] solution(String[] info, String[] query) {
        Map<String, List<Integer>> scoresMap = generateScoresMap(info);

        int[] answer = new int[query.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = countMatchingScores(query[i], scoresMap);
        }
        return answer;
    }
}
