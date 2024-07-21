import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int money = n % 5;
        int coinCount = n / 5;

        while (true){
            if (money % 2 == 0){
                coinCount += money / 2;
                System.out.println(coinCount);
                break;
            } else if (coinCount == 0) {
                System.out.println(-1);
                break;
            }
            money += 5;
            coinCount -= 1;
        }
    }

}
