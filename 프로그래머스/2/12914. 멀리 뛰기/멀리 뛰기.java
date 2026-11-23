class Solution {
    public long solution(int n) {
        int two = n / 2;
        int one = n % 2;
        long sum = 0;
        
        while (two >= 0) {
            int m = one + two;
            int r = Math.min(one, two);

            sum += cal(m, r);  // ✅ 올바른 조합 계산
            sum %= 1234567;  // ✅ 모듈러 연산 적용

            two--;  // ✅ 다음 조합 탐색
            one += 2;
        }
        return sum;
    }

    // ✅ 모듈러 연산을 적용한 nCr 계산 (안전한 조합 계산)
    private long cal(int n, int r) {
        if (r == 0 || n == r) return 1;

        long result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result %= 1234567;  // ✅ 중간에도 모듈러 연산 적용
            result /= (i + 1);
        }
        return result;
    }
}
