import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        String[] str = reader.readLine().split(" ");
        List<Double> list = new ArrayList<>();
        double sum = 0;
        for (int i = 0; i < str.length; i++) {
            list.add(Double.parseDouble(str[i]));
        }
        Collections.sort(list);
        if (list.size() == 1) {
            System.out.println(100);
        } else {
            for (int i = 0; i < list.size(); i++) {
                sum += (double) list.get(i) / (double) list.get(list.size() - 1) * 100L;
            }
            System.out.println(sum / (double) list.size());
        }
    }

}