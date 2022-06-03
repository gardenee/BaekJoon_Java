import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ14929 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];
        dp[0] = 0;

        String ipt = br.readLine();
        StringTokenizer st = new StringTokenizer(ipt);
        for (int i = 0; i < n; i++) dp[i+1] = Integer.parseInt(st.nextToken()) + dp[i];

        int sum = dp[n];
        long ans = 0;
        for (int i = 1; i <= n; i++) ans += (sum-dp[i]) * (dp[i]-dp[i-1]);

        System.out.println(ans);
    }
}
