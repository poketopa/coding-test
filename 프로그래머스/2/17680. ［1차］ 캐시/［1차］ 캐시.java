import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        for(int i=0;i<cities.length;i++) cities[i] = cities[i].toUpperCase();
        int count = 0;
        Set<String> set = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0;i<cities.length;i++){
            if(queue.isEmpty()) {
                queue.add(new String(cities[i]));
                set.add(cities[i]);
                count+=5;
            }
            else {
                if(set.contains(cities[i])) { // hit!
                    queue.add(new String(cities[i]));
                    map.put(cities[i], map.getOrDefault(cities[i], 0) + 1);
                    count++;
                    cacheSize++;
                } else { // miss!
                    set.add(cities[i]);
                    queue.add(new String(cities[i]));
                    count+=5;
                }
            }
            while(queue.size() > cacheSize) {
                if(map.getOrDefault(queue.peek(), 0) > 0) {
                    map.put(queue.peek(), map.get(queue.peek()) - 1);
                    queue.poll();
                    cacheSize--;
                } else {
                    set.remove(queue.poll());
                    
                }
            }
        }
        return count;
    }
}