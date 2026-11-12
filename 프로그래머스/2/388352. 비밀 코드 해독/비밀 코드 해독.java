import java.util.*;
class Solution {
    static int answer = 0;
    public int solution(int n, int[][] q, int[] ans) {
        List<Integer> list = new ArrayList<>();
        dfs(0, n, list, q, ans);
        return answer;
    }
    
    public void dfs(int now, int n, List<Integer> list, int[][] q, int[] ans) {
        if(list.size() == 5) {
            int allCount = 0;
            Set<Integer> set = new HashSet<>(list);
            for(int i=0;i<q.length;i++){
                int count = 0;
                for(int j=0;j<q[0].length;j++){
                    if(set.contains(q[i][j])) count++;
                }
                if(count == ans[i]){
                    allCount++;
                }
            }
            if(allCount == q.length) answer++;
            return;
        }
        for(int i=now + 1;i<=n;i++){
            list.add(i);
            dfs(i, n, list, q, ans);
            list.remove(list.size()-1);
        }
    }
}