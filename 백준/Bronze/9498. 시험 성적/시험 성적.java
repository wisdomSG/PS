import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int A;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        A = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        input();
        if( A >= 90) {
            System.out.println("A");
        } else if (A>=80){
            System.out.println("B");
        } else if(A>=70) {
            System.out.println("C");
        } else if(A>=60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}