import java.io.*;
import java.util.StringTokenizer;

public class BJ09184 {

    public static int[][][] dp = new int[21][21][21];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int a = 0; a < 21; a++) {
            for (int b = 0; b < 21; b++) {
                for (int c = 0; c < 21; c++) {
                    dp[a][b][c] = w(a, b, c);
                }
            }
        }

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] ipt = new int[3];
            for (int i = 0; i < 3; i++) ipt[i] = Integer.parseInt(st.nextToken());
            if (ipt[0] == -1 && ipt[1] == -1 && ipt[2] == -1) break;

            bw.write("w(" + ipt[0] + ", " + ipt[1] + ", " + ipt[2] + ") = ");
            int ans = w(ipt[0], ipt[1], ipt[2]);
            bw.write(ans + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static int w(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) return 1;
        if (a > 20 || b > 20 || c > 20) return dp[20][20][20];
        if (a < b && b < c) return dp[a][b][c] = dp[a][b][c-1] + dp[a][b-1][c-1] - dp[a][b-1][c];
        else return dp[a][b][c] = dp[a-1][b][c] + dp[a-1][b-1][c] + dp[a-1][b][c-1] - dp[a-1][b-1][c-1];
    }
}
