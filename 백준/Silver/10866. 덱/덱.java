import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());

        // 1. Deque 인터페이스 생성
        Deque<Integer> deque = new ArrayDeque<>();

        // 2. A 만큼 반복
        for (int i = 0; i < A; i++) {
            String commandLine = br.readLine();
            StringTokenizer st = new StringTokenizer(commandLine);
            String command = st.nextToken();

            switch (command) {
                // 정수 X를 덱의 앞에 넣는다.
                case "push_front":
                    int numFront = Integer.parseInt(st.nextToken());
                    deque.addFirst(numFront);
                    break;
                // 정수 X를 덱의 뒤에 넣는다.
                case "push_back":
                    int numBack = Integer.parseInt(st.nextToken());
                    deque.addLast(numBack);
                    break;
                // 덱의 가장 앞에 있는 수를 출력한다.
                case "front":
                    System.out.println(deque.isEmpty() ? -1 : deque.getFirst());
                    break;
                // 덱의 가장 뒤에 있는 수를 출력한다.
                case "back":
                    System.out.println(deque.isEmpty() ? -1 : deque.getLast());
                    break;
                // 덱에 들어있는 정수의 개수를 출력한다.
                case "size":
                    System.out.println(deque.size());
                    break;
                // 덱이 비어있으면 1, 아니면 0을 출력한다.
                case "empty":
                    System.out.println(deque.isEmpty() ? 1 : 0);
                    break;
                // 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다.
                case "pop_front":
                    System.out.println(deque.isEmpty() ? -1 : deque.pollFirst());
                    break;
                // 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다.
                case "pop_back":
                    System.out.println(deque.isEmpty() ? -1 : deque.pollLast());
                    break;
            }
        }
    }
}
