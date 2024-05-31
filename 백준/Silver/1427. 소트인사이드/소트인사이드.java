import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = Integer.toString(sc.nextInt());
        Character[] ch = new Character[str.length()];

        for (int i = 0; i < ch.length; i++) {
            ch[i] = str.charAt(i);
        }

        Arrays.sort(ch);
        String as = "";
        for (int i = 0; i < ch.length; i++) {
            as += ch[ch.length - 1 - i];
        }
        System.out.println((as));
    }
}
