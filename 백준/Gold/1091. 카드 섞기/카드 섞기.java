import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int howManyCards = Integer.parseInt(br.readLine());

        int[] card012 = new int[howManyCards]; // 현재 카드 배치
        int[] mixArr = new int[howManyCards];  // 섞는 방법

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < howManyCards; i++) {
            card012[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < howManyCards; i++) {
            mixArr[i] = Integer.parseInt(st.nextToken());
        }

        // 처음부터 정렬된 상태인지 확인
        boolean isSorted = true;
        for (int i = 0; i < card012.length; i++) {
            if (card012[i] != i % 3) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("0");
            return;
        }

        // 섞기 과정
        Set<String> visited = new HashSet<>();
        int count = 0;

        while (true) {
            String state = Arrays.toString(card012);
            if (visited.contains(state)) {
                System.out.println("-1"); // 무한 루프 방지
                return;
            }
            visited.add(state);

            // 새로운 카드 배치 배열
            int[] newCard = new int[howManyCards];
            for (int i = 0; i < howManyCards; i++) {
                newCard[mixArr[i]] = card012[i]; // mixArr[i] 위치로 카드 이동
            }
            card012 = newCard; // 새 배열을 기존 배열로 교체
            count++;

            // 목표 상태인지 확인
            boolean sorted = true;
            for (int i = 0; i < card012.length; i++) {
                if (card012[i] != i % 3) {
                    sorted = false;
                    break;
                }
            }
            if (sorted) {
                System.out.println(count);
                return;
            }
        }
    }
}
