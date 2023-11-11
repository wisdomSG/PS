import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strArr = str.split("-"); // "-"를 기준으로 문자열은 잘라서 배열로 저장한다.
        int result = 0;
        for(int i=0; i< strArr.length; i++) {
            String[] add = strArr[i].split("\\+"); // 정규표현식에서 +는 특별한 의미를 가지고있기때문에 \\를 사용 
            int addResult = 0;
            for(int j=0; j<add.length; j++) {
                addResult += Integer.parseInt(add[j]);
            }
            if(i==0) {
                result += addResult;
            } else {
                result -= addResult;
            }
        }
        System.out.println(result);
    }
}