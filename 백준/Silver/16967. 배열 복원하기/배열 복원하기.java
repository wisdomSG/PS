import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int A,B, X, Y;

    static int[][] arrB, arrA;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());

        arrB = new int[A+X][B+Y];

        for (int i=0; i<A+X; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<B+Y; j++) {
                arrB[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();

        arrA = new int[A][B];

        // 1개 겹치는 경우 (상,하)
        for(int i=0; i<X; i++) {
            for(int j=0; j<B; j++) {
                arrA[i][j] = arrB[i][j];
                arrA[i+A-X][j] =arrB[i+A][j+Y];
            }
        }

         //1개 겹치는 경우 (좌,우)
        for(int i=X; i<A; i++) {
            for(int j=0; j<Y; j++) {
                arrA[i][j] = arrB[i][j];
                arrA[i-X][j+B-Y] = arrB[i][j+B];
            }
        }

        // 2개 겹치는 경우
        for(int i=X; i<A; i++) {
            for(int j=Y; j<B; j++) {
                arrA[i][j] = arrB[i][j] - arrA[i-X][j-Y];
            }
        }

        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                System.out.print(arrA[i][j] + " ");
            }
            System.out.println(); // 각 행의 끝에서 줄 바꿈
        }
    }
}

