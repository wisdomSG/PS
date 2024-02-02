import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
    
        // 열 이름을 기반으로 열 순서를 저장하는 맵
        Map<String, Integer> order = new HashMap<>();
        order.put("code", 0);
        order.put("date", 1);
        order.put("maximum", 2);
        order.put("remain", 3);
        
        // 지정된 기준에 따라 데이터를 필터링
        int[][] filterData = Arrays.stream(data).filter(x -> x[order.get(ext)] < val_ext).toArray(int[][]::new);
        
        // 필터링된 데이터를 지정된 열을 기준으로 정렬
        Arrays.sort(filterData, (o1, o2) -> o1[order.get(sort_by)] - o2[order.get(sort_by)]);
        
        // 필터링 및 정렬된 데이터를 반환
        return filterData;

    }
}
