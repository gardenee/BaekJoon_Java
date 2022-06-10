import java.io.IOException;
import java.util.Scanner;

public class BJ09095 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] dp = new int[12];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= 11; i++) dp[i] = dp[i-3] + dp[i-2] + dp[i-1];

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
    }
}
