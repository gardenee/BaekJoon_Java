import java.util.Scanner;

public class BJ01699 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N+1];
        for (int i = 0; i < N+1; i++) dp[i] = i;

        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j <= i; j++) {
                if (j*j > i) break;
                if (dp[i] > dp[i-j*j]) dp[i] = dp[i-j*j]+1;
            }
        }
        System.out.println(dp[N]);
    }
}
