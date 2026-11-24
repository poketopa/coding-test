    import java.util.*;
    import java.io.*;

    public class Main {
        public static void main(String args[]) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // StringTokenizer st = new StringTokenizer(br.readLine());

            List<Integer> list = new ArrayList<>();
            int input = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            x:for(int i=0;i<input;i++){
                int number = Integer.parseInt(st.nextToken());
                if(list.isEmpty()) {
                    list.add(number);
                    continue;
                }
                for(int j=0;j<list.size();j++){
                    if(list.get(j) >= number) {
                        list.set(j, number);
                        continue x;
                    }
                }
                list.add(number);
            }
            System.out.print(list.size());
        }
    }
