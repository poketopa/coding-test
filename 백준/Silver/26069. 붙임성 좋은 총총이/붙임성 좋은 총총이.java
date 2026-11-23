import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.valueOf(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        map.put("ChongChong", 1);
        int answer = 1;
        for(int i=0;i<input;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String temp1 = st.nextToken();
            String temp2 = st.nextToken();

            if(map.containsKey(temp1) || map.containsKey(temp2)){
                if(map.containsKey(temp1) && !map.containsKey(temp2)){
                    map.put(temp2, 1);
                    answer++;
                }
                else if(map.containsKey(temp2) && !map.containsKey(temp1)) {
                    map.put(temp1, 1);
                    answer++;
                }
            }

        }
        System.out.println(answer);
    }
}