import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Birth> births = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            births.add(new Birth(st.nextToken(),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())));
        }

        List<Birth> sortedBirths = births.stream()
                .sorted(Comparator.comparingInt((Birth b) -> b.year)
                        .thenComparingInt(b -> b.month)
                        .thenComparingInt(b -> b.day))
                .collect(Collectors.toList());

        System.out.println(sortedBirths.get(sortedBirths.size() - 1).name); // 가장 나이가 많은 사람
        System.out.println(sortedBirths.get(0).name); // 가장 나이가 어린 사람
    }
}

class Birth{
    String name;
    int day;
    int month;
    int year;

    public Birth(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }
}