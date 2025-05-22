import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Map<String, Integer> map = new LRULinkedHashMap<>(cacheSize);

        for (String city : cities) {
            String lowerCity = city.toLowerCase();

            if (map.containsKey(lowerCity)) {
                map.get(lowerCity);
                answer++;
            } else {
                map.put(lowerCity, 0);
                answer += 5;
            }
        }
        return answer;
    }

    class LRULinkedHashMap<K, V> extends LinkedHashMap<K, V> {
        private final int cacheSize;

        public LRULinkedHashMap(int cacheSize) {
            super(cacheSize, 0.75f, true);
            this.cacheSize = cacheSize;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > cacheSize;
        }
    }
}