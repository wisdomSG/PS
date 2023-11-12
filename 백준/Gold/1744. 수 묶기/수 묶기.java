import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;

    static int positive, negative;

    static int sum;
    static int[] numArr;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        N = Integer.parseInt(st.nextToken());

        numArr = new int[N];


        for (int i=0; i<N; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
            if(numArr[i]>1) {
                positive ++; // 양수 갯수 구하기 (1 제외) 
            } else if(numArr[i]<=0) {
                negative ++; // 음수 갯수 구하기 (0 포함)
            } else if(numArr[i]==1) {
                sum ++; // 1은 따로 더해주는게 더 큰 수를 만들 수 있기 때문에 바로 sum에 더해주기 
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        Arrays.sort(numArr);

        // 음수 계산
        for(int i=0; i<negative-1; i+=2) {
            sum += (numArr[i] * numArr[i+1]);
        }

        if(negative%2==1) { //0을 포함한 음수의 갯수가 홀수 인 경우 남은 수 하나를 더해줘야 함
            sum += numArr[negative-1];
        }

        // 양수 계산
        for(int i=numArr.length-1; i>numArr.length-positive; i-=2) {
            sum += (numArr[i] * numArr[i-1]);
        }

        if(positive%2==1) { // 1보다 큰 양수의 갯수가 홀수 인 경우 나머지 하나를 더해줌 
            sum += numArr[numArr.length-positive];
        }
        System.out.println(sum);
    }
}
