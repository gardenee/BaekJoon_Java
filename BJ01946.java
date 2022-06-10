import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ01946 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[][] score = new int[N][2];
            for (int j = 0; j < N; j++) {
                String ipt = br.readLine();
                StringTokenizer st = new StringTokenizer(ipt);
                score[j][0] = Integer.parseInt(st.nextToken());
                score[j][1] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(score, (o1, o2) -> {
                return o1[0]-o2[0];
            });

            int max = score[0][1];
            int ans = 1;
            for (int j = 1; j < N; j++) {
                if (score[j][1] < max) {
                    ans++;
                    max = score[j][1];
                }
            }
            System.out.println(ans);
        }
    }
}
