import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = br.readLine();
            if (str.equals("*")) {
                break;
            }
            boolean flag = true;
            for (int i = 'a'; i <= 'z'; i++) {
                if (str.indexOf(i) == -1) {
                    flag = false;
                    break;
                }
            }      

            if (flag) {
                sb.append("Y").append("\n");
            }else{
                sb.append("N").append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}
