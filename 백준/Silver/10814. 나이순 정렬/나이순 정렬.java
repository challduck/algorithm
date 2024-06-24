import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String age = (st.nextToken());
            String name = st.nextToken();

            arr[i][0] = age;
            arr[i][1] = name;

        }

        
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2){
                
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });
        StringBuilder sb = new StringBuilder();

        for (String[] strings : arr) {
            sb.append(strings[0]).append(" ").append(strings[1]).append("\n");
        }
        System.out.println(sb.deleteCharAt(sb.length()-1));
    }

}
