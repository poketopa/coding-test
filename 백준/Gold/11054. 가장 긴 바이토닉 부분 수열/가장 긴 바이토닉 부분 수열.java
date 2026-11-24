    import java.util.*;
    import java.io.*;

    public class Main {
        public static void main(String args[]) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // StringTokenizer st = new StringTokenizer(br.readLine());

            int input = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] number = new int[input];
            for(int i=0;i<input;i++) number[i] = Integer.parseInt(st.nextToken());
            int max = -1;

            for(int i=0;i<number.length;i++){
                List<Integer> list1 = new ArrayList<>();
                List<Integer> list2 = new ArrayList<>();

                x:for(int j=i;j>=0;j--){
                    if(list1.isEmpty()) {
                        list1.add(number[j]);
                        continue;
                    }
                    for(int k=0;k<list1.size();k++){
                        if(list1.get(k) <= number[j]) {
                            list1.set(k, number[j]);
                            continue x;
                        }
                    }
                    list1.add(number[j]);
                }

                x:for(int j=i;j<number.length;j++){
                    if(list2.isEmpty()) {
                        list2.add(number[j]);
                        continue;
                    }
                    for(int k=0;k<list2.size();k++){
                        if(list2.get(k) <= number[j]) {
                            list2.set(k, number[j]);
                            continue x;
                        }
                    }
                    list2.add(number[j]);
                }
                max = Math.max(list1.size() + list2.size() - 1, max);
            }
            System.out.print(max);
        }
    }
