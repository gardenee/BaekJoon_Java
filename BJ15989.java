import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ15989 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] dp = new int[10001][3];
        dp[1] = new int[] {0, 0, 1};
        dp[2] = new int[] {0, 1, 1};
        dp[3] = new int[] {1, 1, 1};

        int curr = 3;
        for (int i = 0; i < N; i++) {
            int ipt = Integer.parseInt(br.readLine());
            if (ipt > curr) {
                for (int j = curr+1; j <= ipt; j++) {
                    dp[j][0] = dp[j-3][0] + dp[j-3][1] + dp[j-3][2];
                    dp[j][1] = dp[j-3][1] + dp[j-3][2];
                    if (j % 2 == 0) dp[j][1]++;
                    dp[j][2] = 1;
                }
                curr = ipt;
            }
            System.out.println(dp[ipt][0]+dp[ipt][1]+dp[ipt][2]);
        }
    }
}
