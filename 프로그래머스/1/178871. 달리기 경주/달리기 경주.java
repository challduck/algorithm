import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for(String calling : callings) {
            int rank = map.get(calling);

            if (rank > 0){
                String temp = players[rank];
                players[rank] = players[rank - 1];
                players[rank - 1] = temp;
            }

            map.put(players[rank], rank);
            map.put(players[rank - 1], rank - 1);
        }
        return players;
    }

}