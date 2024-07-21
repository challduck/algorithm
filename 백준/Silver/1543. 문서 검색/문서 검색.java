import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String docs = br.readLine();
        String word = br.readLine();
        int cnt = 0;
        while (docs.contains(word)){
            docs = docs.replaceFirst(word, " ");
            cnt++;
        }
        System.out.println(cnt);
    }

}
