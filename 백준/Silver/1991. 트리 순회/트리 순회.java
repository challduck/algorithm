import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Map<String, List<String>> graph;
    static StringBuilder leftSb;
    static StringBuilder centSb;
    static StringBuilder rightSb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        graph = new HashMap<>();

        for (int i = 0; i < n; i++) {
            graph.put(Character.toString(65 + i), Arrays.asList(".", "."));
        }
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            String left = st.nextToken();
            String right = st.nextToken();
            graph.put(key, Arrays.asList(left, right));
        }

        leftSb = new StringBuilder();
        centSb = new StringBuilder();
        rightSb = new StringBuilder();

        left("A");
        cent("A");
        right("A");

        System.out.println(leftSb);
        System.out.println(centSb);
        System.out.println(rightSb);
    }

    private static boolean isDot (String str){
        if (str.equals(".")) {
            return true;
        }
        return false;
    }

    private static void left(String node){
        if (isDot(node)) return;
        leftSb.append(node);
        left(graph.get(node).get(0));
        left(graph.get(node).get(1));
    }
    private static void cent(String node){
        if (isDot(node)) return;
        cent(graph.get(node).get(0));
        centSb.append(node);
        cent(graph.get(node).get(1));
    }
    private static void right(String node){
        if (isDot(node)) return;
        right(graph.get(node).get(0));
        right(graph.get(node).get(1));
        rightSb.append(node);
    }
}
