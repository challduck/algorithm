import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 1000 - Integer.parseInt(br.readLine());
        int cnt = 0;
        while (n != 0){
            if (n >= 500){
                n -= 500;
                cnt++;
            } else if (n >= 100){
                n -= 100;
                cnt++;
            } else if (n >= 50){
                n -= 50;
                cnt++;
            } else if (n >= 10){
                n -= 10;
                cnt++;
            } else if (n >= 5){
                n -= 5;
                cnt++;
            } else if (n >= 1){
                n -= 1;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}