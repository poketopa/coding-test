class Solution {
    int count = 0;
    public int solution(int[] numbers, int target) {
        int now = 0;
        
        dfs(numbers, target, now, 0);
        return count;
    }
    
    public void dfs(int[] numbers, int target, int now, int index){
        if(index == numbers.length) {
            if(target == now) count++;
            return;
        }
        dfs(numbers, target, now + numbers[index], index + 1);
        dfs(numbers, target, now - numbers[index], index + 1);   
    }
}