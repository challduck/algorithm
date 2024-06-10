import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        List<Integer>[] graph = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            graph[B].add(A);
        }
        
        int X = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[N + 1];
       
        int result = dfs(X, graph, visited);
       
        System.out.println(result);
    }
    
    public static int dfs(int node, List<Integer>[] graph, boolean[] visited) {
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        
        while (!stack.isEmpty()) {
            int current = stack.pop();
            
            for (int prev : graph[current]) {
                if (!visited[prev]) {
                    visited[prev] = true;
                    count++;
                    stack.push(prev);
                }
            }
        }
        return count;
    }
}
