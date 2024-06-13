import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int cnt = 0;
        int next_milk = 0;
        for (String str : arr){
            int milk_store = Integer.parseInt(str);
            if (milk_store == next_milk){
                cnt++;
                next_milk = (next_milk + 1 ) % 3;
            }
        }
        System.out.println(cnt);
    }
}