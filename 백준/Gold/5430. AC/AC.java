import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String command = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String[] element = br.readLine().replaceAll("[\\[\\] ]", "").split(",");
            Deque<Integer> deque = new ArrayDeque<>();
            StringBuilder innerSb = new StringBuilder();

            for (int j = 0; j < n; j++) {
                deque.add(Integer.parseInt(element[j]));
            }

            innerSb.append("[");
            boolean flag = true;

            for (int j = 0; j < command.length(); j++) {
                char ch = command.charAt(j);

                if (ch == 'R' && flag) {
                    flag = false;
                } else if (ch == 'R' && !flag) {
                    flag = true;
                }

                if (ch == 'D') {
                    if (deque.isEmpty()) {
                        innerSb = new StringBuilder();
                        innerSb.append("error");
                        break;
                    } else {
                        if (flag) {
                            deque.pollFirst();
                        } else {
                            deque.pollLast();
                        }
                    }
                }

                if (j == command.length() - 1) {
                    boolean isVal = deque.isEmpty() ? true : false;
                    while (!deque.isEmpty()) {
                        if (flag) {
                            innerSb.append(deque.pollFirst()).append(",");
                        } else {
                            innerSb.append(deque.pollLast()).append(",");
                        }
                    }
                    if (!isVal) {
                        innerSb.deleteCharAt(innerSb.length() - 1);
                    }
                    innerSb.append("]");
                }
            }

            sb.append(innerSb.toString()).append("\n");
        }
        System.out.println(sb);
    }
}