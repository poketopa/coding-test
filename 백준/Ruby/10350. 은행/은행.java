import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        int n = readInt(in);
        if (n <= 0) return;
        
        int[] P = new int[n];
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum += readInt(in);
            P[i] = currentSum;
        }
        
        int S = currentSum;
        long ans = 0;
        
        for (int i = 0; i < n; i++) {
            int pi = P[i];
            for (int r = 0; r < n; r++) {
                int pr = P[r];
                if (pi > pr) {
                    int diff = pi - pr - 1;
                    int kMax = diff / S;
                    ans += kMax;
                    if (i < r) {
                        ans++;
                    }
                }
            }
        }
        
        System.out.println(ans);
    }
    
    static int readInt(InputStream in) throws Exception {
        int c = in.read();
        while (c <= 32) {
            if (c == -1) return 0;
            c = in.read();
        }
        boolean negative = false;
        if (c == '-') {
            negative = true;
            c = in.read();
        }
        int res = 0;
        while (c > 32) {
            res = res * 10 + (c - '0');
            c = in.read();
        }
        return negative ? -res : res;
    }
}