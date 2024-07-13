import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Puzzle> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken().toUpperCase();
            int num = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken()) -1;

            pq.add(new Puzzle(num, str.charAt(target)));
        }
        StringBuilder sb = new StringBuilder();

        while (!pq.isEmpty()) {
            sb.append(pq.poll().getCh());
        }

        System.out.println(sb);
    }
}

class Puzzle implements Comparable<Puzzle> {
    private int priority;
    private char ch;

    public char getCh (){
        return this.ch;
    }
    
    Puzzle(int prirorty, char ch){
        this.priority = prirorty;
        this.ch = ch;
    }
    
    @Override
    public int compareTo(Puzzle other) {
        return this.priority - other.priority;
    }
}
