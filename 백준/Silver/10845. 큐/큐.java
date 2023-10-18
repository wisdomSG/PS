import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());

        // 1. Queue 인터페이스 생성
        Queue<Integer> queue = new LinkedList<>();

        // 2. A 만큼 반복
        for (int i = 0; i < A; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                // 정수 X를 큐에 넣는다.
                case "push":
                    int num = Integer.parseInt(command[1]);
                    queue.offer(num);
                    break;
                // 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 큐에 들어있는 정수가 없으면 -1 출력
                case "pop":
                    System.out.println(queue.isEmpty() ? -1: queue.poll());
                    break;
                // 큐에 들어있는 정수의 개수 출력
                case "size":
                    System.out.println(queue.size());
                    break;
                // 큐가 비어있으면 1, 아니면 0 출력
                case "empty":
                    System.out.println(queue.isEmpty() ? 1 : 0);
                    break;
                // 큐의 가장 앞에 있는 정수 출력, 큐에 들어있는 정수가 없으면 -1 출력
                case "front":
                    System.out.println(queue.isEmpty() ? -1 : queue.peek());
                    break;
                // 큐의 가장 뒤에 있는 정수 출력, 큐에 들어있는 정수가 없으면 -1 출력
                case "back":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        int lastElement = 0;
                        for (int item : queue) {
                            lastElement = item;
                        }
                        System.out.println(lastElement);
                    }
                    break;
            }
        }
    }
}
