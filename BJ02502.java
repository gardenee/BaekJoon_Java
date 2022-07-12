import java.util.Scanner;

public class BJ02502 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int K = sc.nextInt();

        int[] dp = new int[D-1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < D-1; i++) dp[i] = dp[i-1] + dp[i-2];

        int a = dp[D-3];
        int b = dp[D-2];
        int A = 0;
        int B = 0;
        for (int i = 1; i < K; i++) {
            if ((K - a*i) % b == 0) {
                A = i;
                B = (K - a*i) / b;
                break;
            }
        }
        System.out.println(A);
        System.out.println(B);
    }
}
