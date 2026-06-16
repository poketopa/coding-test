import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<strArr.length;i++){
            set.add(strArr[i].length());
            map.put(strArr[i].length(), map.getOrDefault(strArr[i].length(), 0) + 1);
        }
        int max = -1;
        for(int i : set){
            max = Math.max(map.get(i), max);
        }
        return max;
    }
}