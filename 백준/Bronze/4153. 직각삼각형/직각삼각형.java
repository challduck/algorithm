import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int max = a;
            if (b > max) max = b;
            if (c > max) max = c;
            
            if (a==0 && b==0 && c==0){
                System.out.println(sb.deleteCharAt(sb.length() - 1));
                break;
            }
            
            if (a == max){
                if (Math.pow(c,2) + Math.pow(b,2) == Math.pow(a,2)){
                    sb.append("right").append("\n");
                } else {
                    sb.append("wrong").append("\n");
                }   
            } else if (b == max) {

                if (Math.pow(c,2) + Math.pow(a,2) == Math.pow(b,2)){
                    sb.append("right").append("\n");
                } else {
                    sb.append("wrong").append("\n");
                }
            } else if (c == max) {

                if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)){
                    sb.append("right").append("\n");
                } else {
                    sb.append("wrong").append("\n");
                }
            }
        }
    }
}