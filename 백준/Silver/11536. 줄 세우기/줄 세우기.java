import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        List<String> asc = new ArrayList<>();
        List<String> desc = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            arr[i] = str;

            asc.add(str);
            desc.add(str);
        }

        Collections.sort(asc, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        Collections.sort(desc, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        boolean isASC = false;
        boolean isDESC = false;

        if (Arrays.equals(arr, asc.toArray())) {
            isASC = true;
        } else if (Arrays.equals(arr, desc.toArray())) {
            isDESC = true;
        }

        if (isASC) {
            System.out.println("INCREASING");
        } else if (isDESC) {
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }
    }
}