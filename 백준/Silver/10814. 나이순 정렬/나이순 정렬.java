import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        List<Person> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            list.add(new Person(age, i, name));
        }

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.age == o2.age) {
                    return o1.sequence - o2.sequence;
                }
                return o1.age - o2.age;
            }
        });
        for (Person person : list) {
            sb.append(person.age).append(" ").append(person.name).append("\n");
        }

        System.out.println(sb);

    }
}

class Person {
    int age;
    int sequence;
    String name;

    public Person(int age, int sequence, String name) {
        this.age = age;
        this.sequence = sequence;
        this.name = name;
    }
}