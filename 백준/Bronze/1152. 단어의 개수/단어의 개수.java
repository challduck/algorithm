import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("")) {
                list.add(str[i]);
            }
        }

        System.out.println(list.size());
    }
}
