import java.util.Scanner;

public class BJ14494 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[][] dp = new long[n][m];

        for (int i = 0; i < n; i++) dp[i][0] = 1;
        for (int i = 0; i < m; i++) dp[0][i] = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) dp[i][j] = (dp[i-1][j-1] + dp[i-1][j] + dp[i][j-1]) % 1000000007;
        }

        System.out.println(dp[n-1][m-1] % 1000000007);
    }
}
