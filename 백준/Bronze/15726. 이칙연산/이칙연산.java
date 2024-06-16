import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sb.readLine());
        Double a = Double.parseDouble(st.nextToken());
        Double b = Double.parseDouble(st.nextToken());
        Double c = Double.parseDouble(st.nextToken());

        System.out.println(Math.max((int)(a * b / c), (int)(a / b * c)));

    }
}