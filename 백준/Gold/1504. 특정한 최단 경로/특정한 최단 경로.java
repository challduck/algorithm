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

        for (int i = 0; i <= v; i++) {
            nodes[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());

            nodes[from].add(new Node(to, value));
            nodes[to].add(new Node(from, value));
        }
        st = new StringTokenizer(br.readLine());

        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());
        int[] oneToV = dijkstra(1, v);
        int[] v1ToV = dijkstra(v1 , v);
        int[] v2ToV = dijkstra(v2 , v);

        long path1 = (long)oneToV[v1] + v1ToV[v2] + v2ToV[v];
        long path2 = (long)oneToV[v2] + v2ToV[v1] + v1ToV[v];

        long answer = Math.min(path1, path2);
        if (answer >= Integer.MAX_VALUE){
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }

    private static int[] dijkstra(int start, int v) {
        visited = new boolean[v + 1];
        distance = new int[v + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
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

        return distance;
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