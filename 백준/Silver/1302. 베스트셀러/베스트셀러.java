import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());

        // 1. 책의 판매량을 key, value 형식으로 저장
        Map<String, Integer> bookSales = new HashMap<>();

        // 2. 판매기록을 Map에 저장
        for(int i=0; i<A; i++) {
            String B = br.readLine();
            bookSales.put(B, bookSales.getOrDefault(B, 0) + 1);
            // getOrDefault() : 주어진 key에 해당하는 값을 반환, key가 Map에 존재하지 않는 경우  defaultValue로 지정한 값을 반환 
        }

        // 3. 가장 많이 팔린 책의 판매수 찾기 
        int maxSales = Collections.max(bookSales.values());

        // 4. 가장 많이 팔린 책의 제목 저장할 리스트 생성
        List<String> bestSellingBooks = new ArrayList<>();

        // 5. maxSales와 일치하는 key값 찾아 리스트에 저장 
        for(Map.Entry<String, Integer> entry: bookSales.entrySet()) {
            if(entry.getValue() == maxSales) {
                bestSellingBooks.add(entry.getKey());
            }
        }

        // 6. 사전순으로 나열 
        Collections.sort(bestSellingBooks);

        System.out.println(bestSellingBooks.get(0));

    }
}
