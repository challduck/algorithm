import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] asc = {1,2,3,4,5,6,7,8};
        int[] desc = {8,7,6,5,4,3,2,1};
        int[] arr = new int[8];
        for (int i = 0; i <8 ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (Arrays.equals(asc, arr)) {
            System.out.println("ascending");
        } else if (Arrays.equals(desc, arr)){
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}