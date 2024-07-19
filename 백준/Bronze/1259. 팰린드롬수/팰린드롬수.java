import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true){
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean flag = true;
            if (Integer.parseInt(str) == 0){
                break;
            }

            if (str.length() % 2 == 1){
                for (int i = 0; i < str.length(); i++) {
                    if (i == str.length() / 2){
                        continue;
                    }

                    if (i < str.length() / 2){
                        stack.push(str.charAt(i));
                    } else {
                        char ch = stack.pop();
                        if (str.charAt(i) != ch){
                            flag = false;
                            break;
                        }
                    }
                }
            } else {
                for (int i = 0; i < str.length(); i++) {
                    if (i < str.length() / 2){
                        stack.push(str.charAt(i));
                    } else {
                        char ch = stack.pop();
                        if (str.charAt(i) != ch){
                            flag = false;
                            break;
                        }
                    }
                }
            }

            if (flag){
                sb.append("yes").append("\n");
            }else {
                sb.append("no").append("\n");
            }
        }
        System.out.println(sb);
    }
}
