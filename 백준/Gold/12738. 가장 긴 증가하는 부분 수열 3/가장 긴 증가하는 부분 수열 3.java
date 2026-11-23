import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int input = Integer.valueOf(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[input];
        int[] dp = new int[input];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++) arr[i] = Integer.valueOf(st.nextToken());
        list.add(arr[0]);

        // 1부터 확인, 리스트 마지막 요소보다 크면 add
        // 만약 마지막 요소보다 크지 않다면 이진 탐색
        for(int i=1;i<arr.length;i++){
            // 마지막 요소보다 크면 add
            if(list.get(list.size()-1)<arr[i]){
                list.add(arr[i]);
            }
            else{
                // 이진탐색
                binarySearch(arr[i], list);
            }
        }
        System.out.println(list.size());
    }
    private static void binarySearch(int number, List<Integer> list){
        int start = 0;
        int end = list.size()-1;
        while(start<=end){
            int mid = (start + end) / 2;
            if(number == list.get(mid)){
                list.set(mid, number);
                return;
            }
            // number이 mid보다 크면 start= mid + 1;
            else if(number > list.get(mid)){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        list.set(start, number);
    }
}