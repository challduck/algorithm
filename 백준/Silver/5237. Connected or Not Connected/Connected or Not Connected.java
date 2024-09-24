import java.util.*;

public class Main {

    private static boolean checkIfConnected(int numberOfSites, int[][] connections) {

        /* Your program should set the following variable to true if the graph formed
         * by the specified onnections is connected, i.e., there is a path from every 
         * site to every other site. */
        boolean isConnected = false;

        /* ------------------- INSERT CODE HERE ---------------------*/
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < numberOfSites; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int[] is : connections) {
            graph.get(is[0]).add(is[1]);
            graph.get(is[1]).add(is[0]);
        }

        boolean[] visited = new boolean[numberOfSites];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            List<Integer> list = graph.get(current);

            for (int i : list) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

        for (boolean bool : visited) {
            if (bool) {
                isConnected = true;
            } else {
                isConnected = false;
                break;
            }
        }

        /* -------------------- END OF INSERTION --------------------*/

        return isConnected;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCases = sc.nextInt();

        for(int i = 0; i < numCases; i++)
        {
            int numberOfSites = sc.nextInt();
            int numberOfConnections = sc.nextInt();

            int[][] connections = new int[numberOfConnections][2];

            for(int j = 0; j < numberOfConnections; j++) {
                connections[j][0] = sc.nextInt();
                connections[j][1] = sc.nextInt();
                assert(connections[j][0] < numberOfSites);
                assert(connections[j][1] < numberOfSites);
            }

            if(checkIfConnected(numberOfSites, connections)) {
                System.out.println("Connected.");
            } else {
                System.out.println("Not connected.");
            }
        }
    }
}
