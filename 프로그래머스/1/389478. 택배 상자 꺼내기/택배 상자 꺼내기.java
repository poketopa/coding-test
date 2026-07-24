import java.util.*;
class Solution {
    public int solution(int n, int w, int num) {
        List<Integer>[] list = new ArrayList[w];
        for(int i=0;i<list.length;i++) list[i] = new ArrayList<>();
        int index = 0;
        boolean flag = true;
        for(int i=1;i<=n;i++){
            if(flag){
                list[index].add(i);
                index++;
                if(index == w) {
                    index = w-1;
                    flag = false;
                }   
            }
            else {
                list[index].add(i);
                index--;
                if(index == -1) {
                    index = 0;
                    flag = true;
                }  
            }
        }
        for(int i=0;i<list.length;i++){
            for(int j : list[i]){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        for(int i=0;i<list.length;i++){
            if(list[i].contains(num)){
                for(int j=0;j<list[i].size();j++){
                    if(list[i].get(j) == num){
                        return list[i].size() - j;
                    }
                }
            }
        }
        return 0;
    }
}