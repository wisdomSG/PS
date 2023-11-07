import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        count = Integer.parseInt(br.readLine());
        String[] change = new String[count];

        for(int i=0; i<count; i++) {
            int money = Integer.parseInt(br.readLine());
            int quarter =  money/25;
            int dime = (money%25)/10;
            int nickel = (money- quarter*25 - dime*10)/5;
            int penny = money- quarter*25 - dime*10-nickel*5;
            change[i] = quarter + " " + dime + " " + nickel + " " + penny;
        }
        for(int i=0; i<count; i++ ){
            System.out.println(change[i]);
        }
    }
}