import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static List<Node>[] nodes;
    static boolean[] visited;
    static int[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        nodes = new ArrayList[v + 1]; 
        visited = new boolean[v + 1];
        distance = new int[v + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        int start = Integer.parseInt(br.readLine());

        for (int i = 0; i <= v; i++) {
            nodes[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            nodes[from].add(new Node(to, value));
        }

        dijkstra(start);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= v; i++) {
            if (distance[i] == Integer.MAX_VALUE) {
                sb.append("INF").append("\n");
            } else {
                sb.append(distance[i]).append("\n");
            }
        }

        System.out.println(sb.toString());
    }

    private static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        distance[start] = 0;
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            visited[cur.to] = true;
            for(Node node : nodes[cur.to]){
                if (visited[node.to]){
                    continue;
                }
                if (distance[cur.to] + node.weight < distance[node.to]) {
                    distance[node.to] = distance[cur.to] + node.weight;
                    pq.offer(new Node(node.to, distance[node.to]));
                }
            }
        }
    }
}

class Node implements Comparable<Node> {
    public int to;
    public int weight;

    @Override
    public int compareTo(Node o) {
        return this.weight - o.weight;
    }

    public Node(int end, int cost){
        this.to = end;
        this.weight = cost;
    }
}