import java.util .*;

class Solution {
    int[] rate = {10, 20, 30, 40};
    int maxPlus = Integer.MIN_VALUE;
    int maxProfit = Integer.MIN_VALUE;
    List<int[]> rateList = new ArrayList<>();

    public int[] solution(int[][] users, int[] emoticons) {
        dfs(new int[]{}, emoticons.length);

        for (int k = 0; k < rateList.size(); k++) { // 할인 경우의 수를 뽑아옴
            int plusCount = 0;
            int profit = 0;
            for (int i = 0; i < users.length; i++) { // 유저마다 적용
                int sum = 0;
                for (int j = 0; j < emoticons.length; j++) {
                    if (rateList.get(k)[j] >= users[i][0]) { // 할인율 높으면 구매
                        sum += emoticons[j] * (100 - rateList.get(k)[j]) / 100;
                    }
                }
                if (sum >= users[i][1]) { // 플러스 구매
                    plusCount++;
                } else { // 이모티콘 구매
                    profit += sum;
                }
            }
            if (plusCount > maxPlus) {
                maxPlus = plusCount;
                maxProfit = profit;
            } else if (maxPlus == plusCount) {
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return new int[]{maxPlus, maxProfit};
    }

    public void dfs(int[] list, int length) {
        if (list.length == length) {
            int[] temp = new int[list.length];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = list[i];
            }
            rateList.add(temp);
            return;
        }
        for (int i = 0; i < 4; i++) {
            int[] temp = new int[list.length + 1];
            for (int j = 0; j < list.length; j++) {
                temp[j] = list[j];
            }
            temp[temp.length - 1] = rate[i];
            dfs(temp, length);
        }
    }
}