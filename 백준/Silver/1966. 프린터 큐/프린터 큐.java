import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] docs = br.readLine().split(" ");
            int docs_length = Integer.parseInt(docs[0]);
            int docs_index = Integer.parseInt(docs[1]);
            String[] list = br.readLine().split(" ");
            Queue<Docs> queue = new LinkedList<>();
            
            for (int j = 0; j < docs_length; j++) {
                queue.add(new Docs(j, Integer.parseInt(list[j])));
            }
            int order = 0;
            while (!queue.isEmpty()) {
                Docs current = queue.poll();
                boolean is_high_sequence = false;

                for (Docs doc : queue) {
                    if (doc.sequence > current.sequence) {
                        is_high_sequence = true;
                        break;
                    }
                }

                if (is_high_sequence) {
                    queue.add(current);
                } else {
                    order++;
                    if (current.index == docs_index) {
                        System.out.println(order);
                        break;
                    }
                }
            }
        }

        
    }
}

class Docs {
    int index;
    int sequence;
    Docs(int index, int sequence){
        this.index = index;
        this.sequence = sequence;
    }
}