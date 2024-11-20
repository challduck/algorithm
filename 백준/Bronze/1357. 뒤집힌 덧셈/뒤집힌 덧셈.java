import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int y = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
    
        System.out.print(Integer.parseInt(new StringBuilder().append(x + y).reverse().toString()));
    }
}