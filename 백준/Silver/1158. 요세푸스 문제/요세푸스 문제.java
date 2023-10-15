import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int A,B;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

    }

    public static void main(String[] args) throws IOException {
        input();
        // Queue 사용 이유 : 제거되는 사람들의 순서를 쉽게 관리하기 위해서 
        Queue<Integer> queue = new LinkedList<>();

        // 1. Queue: 1~A까지 숫자 저장
        for(int i=1; i<=A; i++) {
            queue.add(i);
        }

        
        StringBuilder result = new StringBuilder("<");
        
        // 숫자가 하나 남을 때 까지 반복
        while (queue.size() > 1) {
            for(int i=0; i<B-1; i++) {
                // 2. B - 1 번째까지의 숫자는 빼서 다시 큐의 뒤로 넣기
                queue.add(queue.poll()); // poll() : 요소를 제거하고 그 요소를 반환 
            }
            // 3. B 번째의 값 문자열에 저장, 큐에서는 제거  
            result.append(queue.poll()).append(", ");
        }
        // 4. 마지막 남은 숫자 문자열에 저장, 큐에서 제거 
        result.append(queue.poll()).append(">");

        System.out.println(result);
    }
}