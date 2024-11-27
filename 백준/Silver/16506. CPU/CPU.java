import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Map<String, String> map = new HashMap<>();

        map.put("ADD", String.format("%04d", Integer.parseInt(Integer.toBinaryString(0))));
        map.put("SUB", String.format("%04d", Integer.parseInt(Integer.toBinaryString(1))));
        map.put("MOV", String.format("%04d", Integer.parseInt(Integer.toBinaryString(2))));
        map.put("AND", String.format("%04d", Integer.parseInt(Integer.toBinaryString(3))));
        map.put("OR", String.format("%04d", Integer.parseInt(Integer.toBinaryString(4))));
        map.put("NOT", String.format("%04d", Integer.parseInt(Integer.toBinaryString(5))));
        map.put("MULT", String.format("%04d", Integer.parseInt(Integer.toBinaryString(6))));
        map.put("LSFTL", String.format("%04d", Integer.parseInt(Integer.toBinaryString(7))));
        map.put("LSFTR", String.format("%04d", Integer.parseInt(Integer.toBinaryString(8))));
        map.put("ASFTR", String.format("%04d", Integer.parseInt(Integer.toBinaryString(9))));
        map.put("RL", String.format("%04d", Integer.parseInt(Integer.toBinaryString(10))));
        map.put("RR", String.format("%04d", Integer.parseInt(Integer.toBinaryString(11))));

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int rD = Integer.parseInt(st.nextToken());
            int rA = Integer.parseInt(st.nextToken());
            int rB = Integer.parseInt(st.nextToken());
            // 1. opcode
            for (Map.Entry<String, String> value : map.entrySet()) {
                if (command.indexOf(value.getKey()) != -1) {
                    sb.append(map.get(value.getKey()));
                    break;
                }
            }
            // 1-2. opcode last binary
            boolean flag = command.charAt(command.length() - 1) == 'C' ? true : false;
            if (flag) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            // 2. default
            sb.append(0);
            // 3. rD
            sb.append(rDSolution(rD));
            // 4. rA
            sb.append(rASolution(command, rA));
            // 5. rB
            sb.append(rBSolution(rB, flag));
            sb.append("\n");
        }
        System.out.print(sb.toString());

    }

    private static String rDSolution(int rD) {
        String temp = Integer.toBinaryString(rD);
        return String.format("%03d", Integer.parseInt(temp));
    }

    private static String rASolution(String command, int rA) {
        if (command.equals("MOV") || command.equals("NOT")) {
            return "000";
        } else {
            return String.format("%03d", Integer.parseInt(Integer.toBinaryString(rA)));
        }
    }

    private static String rBSolution(int rB, boolean flag) {
        String temp = Integer.toBinaryString(rB);
        if (flag) {
            return String.format("%04d", Integer.parseInt(temp));
        } else {
            return String.format("%03d", Integer.parseInt(temp)) + "0";
        }
    }

}