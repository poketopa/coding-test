import java.util.*;
class Solution {
    static int min = Integer.MAX_VALUE;
    public int solution(int[][] beginning, int[][] target) {
        int rowNum = beginning.length;
        int columnNum = beginning[0].length;
        List<List<Integer>> row = new ArrayList<>();
        List<List<Integer>> column = new ArrayList<>();
        row.add(new ArrayList<>());
        column.add(new ArrayList<>());
        
        for(int i=1;i<=rowNum;i++){
            makeList(row, i, rowNum - 1, new ArrayList<>(), 0);
        }
        for(int i=1;i<=columnNum;i++){
            makeList(column, i, columnNum - 1, new ArrayList<>(), 0);
        }

        
        for(int i=0;i<row.size();i++){
            for(int j=0;j<column.size();j++){
                int count = row.get(i).size() + column.get(j).size();
                // 하나씩 확인
                int[][] map = makeMap(beginning);
                // 뒤집기
                for(int k=0;k<row.get(i).size();k++){
                    reverseRow(row.get(i).get(k), map);
                }
                for(int k=0;k<column.get(j).size();k++){
                    reverseColumn(column.get(j).get(k), map);
                }
                if(check(map, target)){
                    if(count < min){
                        min = count;
                    }
                }
            }
        }
        if(min == Integer.MAX_VALUE) return -1;
        return min;
    }
    
    public boolean check(int[][] map1, int[][] map2){
        for(int i=0;i<map1.length;i++){
            for(int j=0;j<map1[0].length;j++){
                if(map1[i][j] != map2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    
    public void reverseRow(int n, int[][] map){
        for(int i=0;i<map[0].length;i++){
            map[n][i] += 1;
            map[n][i] %= 2;
        }
    }
    
    public void reverseColumn(int n, int[][] map){
        for(int i=0;i<map.length;i++){
            map[i][n] += 1;
            map[i][n] %= 2;
        }
    }
    
    public void makeList(List<List<Integer>> list, int size, int rowNum, List<Integer> tempList, int now){
        if(tempList.size() == size){
            List<Integer> temp = new ArrayList<>();
            for(int i : tempList) temp.add(i);
            list.add(temp);
            return;
        }
        for(int i=now;i<=rowNum;i++){
            tempList.add(i);
            makeList(list, size, rowNum, tempList, i + 1);
            tempList.remove(tempList.size()-1);
        }
    }
    
    public int[][] makeMap(int[][] beginning){
        int[][] map = new int[beginning.length][beginning[0].length];
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                map[i][j] = beginning[i][j];
            }
        }
        return map;
    }
}