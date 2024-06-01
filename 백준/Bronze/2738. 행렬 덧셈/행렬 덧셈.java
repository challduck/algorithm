import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr_length = br.readLine().split(" ");
        int[][] arr_a = new int[Integer.parseInt(arr_length[0])][Integer.parseInt(arr_length[1])];
        int[][] arr_b = new int[Integer.parseInt(arr_length[0])][Integer.parseInt(arr_length[1])];

        for (int i = 0; i < Integer.parseInt(arr_length[0]); i++) {
            String[] element = br.readLine().split(" ");
            for (int j = 0; j < Integer.parseInt(arr_length[1]); j++) {
                arr_a[i][j] = Integer.parseInt(element[j]);
            }
        }
        for (int i = 0; i < Integer.parseInt(arr_length[0]); i++) {
            String[] element = br.readLine().split(" ");
            for (int j = 0; j < Integer.parseInt(arr_length[1]); j++) {
                arr_b[i][j] = Integer.parseInt(element[j]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Integer.parseInt(arr_length[0]); i++) {
            for (int j = 0; j < Integer.parseInt(arr_length[1]); j++) {
                sb.append((arr_a[i][j] + arr_b[i][j]) + " ");
            }
            System.out.println(sb.toString());
            sb.setLength(0);
        }
    }
}