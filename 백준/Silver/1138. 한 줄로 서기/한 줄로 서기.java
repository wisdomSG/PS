import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int[] lineup, condition;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        lineup = new int[N];
        condition = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            condition[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        for(int i=1; i<=N; i++) {
            int sequence = condition[i-1];
            int count = 0;
            int j = 0;
            while(count!=sequence) { // 0의 갯수와 sequence가 같아지는 지점에서 멈춤
                if(lineup[j]==0) { // 0 : 자신보다 숫자가 큰 사람이 오는 자리 
                    count++;
                }
                j++; 
            }
            int index = findSequence(j); 

            lineup[index]=i;
        }

        // 결과값 출력
        StringBuilder result = new StringBuilder();
        for(int i: lineup) {
            result.append(i + " ");
        }
        
        System.out.println(result);
    }

    // 깂이 0인 자리 찾기 ( 0이 아니면 그 자리는 다른 숫자가 먼저 선점한 자리 ) 
    static int findSequence(int count) { 
        if (count < lineup.length && lineup[count] != 0) {
            // 재귀 호출
            return findSequence(count + 1);
        }
        // 재귀 종료 조건에 도달하면 현재 count 값을 반환
        return count;
    }
}
