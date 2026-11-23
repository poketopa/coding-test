

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.valueOf(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        int answer = 0;
        for(int i=0;i<input;i++){
            String temp = br.readLine();
            if(temp.equals("ENTER")){
                map.clear();
            }
            else{
                if(map.containsKey(temp)) continue;
                else {
                    map.put(temp, 1);
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}